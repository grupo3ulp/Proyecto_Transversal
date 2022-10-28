package PT.Control;

import PT.Modelo.Alumno;
import PT.Modelo.Inscripcion;
import PT.Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataInscripcion {

    private Connection conec;

    public DataInscripcion() {
        this.conec = Conexion.getConexion();
    }

    public Inscripcion obtenerInscripcion(int id_inscripcion) {

        Inscripcion i = null;
        String query = "SELECT * FROM `inscripcion` WHERE id_inscripcion = ?"; //1
        try {
            PreparedStatement ps = conec.prepareStatement(query); //2
            ps.setInt(1, id_inscripcion);
            ResultSet rs = ps.executeQuery(); //3
            while (rs.next()) { //4 Creo un objeto
                i = new Inscripcion();
                i.setId_inscripcion(rs.getInt("id_inscripcion"));
                i.setId_alumno(rs.getInt("id_alumno"));
                i.setId_materia(rs.getInt("id_materia"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }

        return i;
    }

    public void actualizarNota(int id_inscripcion) {

        Inscripcion i = null;

        String query = "UPDATE `inscripcion` SET `nota`= ? WHERE id_inscripcion = ?";
        try {
            i = new Inscripcion();
            PreparedStatement ps = conec.prepareStatement(query);
            ps.setFloat(1, i.getNota());
            ps.setInt(2, id_inscripcion);
            ps.executeUpdate();

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
            } 
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
    }

    public void deleteInscripcion(int id) {
        String sql = "DELETE FROM inscripcion WHERE id_inscripcion=?";

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La inscripcion fue eliminada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la inscripcion");
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
    }

    public void crearInscripcion(Inscripcion a) {
        try {
            String sql = "INSERT INTO inscripcion( id_alumno, id_materia, nota) VALUES (?,?,?)";
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, a.getId_alumno());
            ps.setInt(2, a.getId_materia());
            ps.setFloat(3, a.getNota());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "La inscripcion fue agregada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la inscripcion");
            }

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                a.setId_inscripcion(rs.getInt(1));

                conec.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
    }

    public ArrayList<Materia> obtenerMateriasInscriptas(int id_alumno) {
        ArrayList<Materia> listaAux = new ArrayList();
        String sql = "SELECT * FROM materia m \n"
                + "JOIN inscripcion l \n"
                + "ON l.id_materia = m.id_materia \n"
                + "WHERE l.id_alumno = ?;";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materiaAux = new Materia();
                materiaAux.setId_materia(rs.getInt("id_materia"));
                materiaAux.setNombre(rs.getString("nombre"));
                materiaAux.setAnio(rs.getInt("año"));
                materiaAux.setEstado(rs.getBoolean("estado"));
                listaAux.add(materiaAux);
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }

        return listaAux;
    }

    public ArrayList<Materia> obtenerMateriasNoInscriptas(int id_alumno) {
        ArrayList<Materia> listaAux = new ArrayList();
        String sql = "SELECT *\n"
                + "FROM materia m\n"
                + "WHERE NOT EXISTS (SELECT id_materia FROM inscripcion l\n"
                + "WHERE m.id_materia = l.id_materia\n"
                + "AND l.id_alumno = ?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materiaAux = new Materia();
                materiaAux.setId_materia(rs.getInt("id_materia"));
                materiaAux.setNombre(rs.getString("nombre"));
                materiaAux.setAnio(rs.getInt("año"));
                materiaAux.setEstado(rs.getBoolean("estado"));
                listaAux.add(materiaAux);
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }

        return listaAux;
    }

    public ArrayList<Alumno> obtenerAlumnosInscriptos(int id_materia) {
        ArrayList<Alumno> listaAux = new ArrayList();
        String sql = "SELECT * FROM alumno a \n"
                + "JOIN inscripcion l \n"
                + "ON l.id_alumno = a.id_alumno\n"
                + "WHERE l.id_materia = ?;\n"
                + "";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id_materia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno AlumnoAux = new Alumno();
                AlumnoAux.setId_alumno(rs.getInt("id_alumno"));
                AlumnoAux.setNombre(rs.getString("nombre"));
                AlumnoAux.setApellido(rs.getString("apellido"));
                AlumnoAux.setEstado(rs.getBoolean("estado"));
                AlumnoAux.setDni(rs.getString("dni"));
                AlumnoAux.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                listaAux.add(AlumnoAux);
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }

        return listaAux;
    }

}
