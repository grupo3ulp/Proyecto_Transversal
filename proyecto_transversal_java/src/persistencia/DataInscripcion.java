package persistencia;

import entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            Logger.getLogger(DataInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }

    public void actualizarNota(int id_inscripcion) {

        Inscripcion i = null;

        String query = "UPDATE `inscripcion` SET `nota`= ? WHERE id_inscripcion = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(query);
            ps.setFloat(1, i.getNota());
            ps.setInt(2, id_inscripcion);

            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteInscripcion(int id) {
        String sql = "DELETE FROM inscripcion WHERE id_inscripcion=?";

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue modifico correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
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

}
