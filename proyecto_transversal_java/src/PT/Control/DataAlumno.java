package PT.Control;

import PT.Modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataAlumno {

    private Connection conec;

    public DataAlumno() {
        this.conec = Conexion.getConexion();
    }

    public void createAlumno(Alumno alumnoAux) {
        String sql = "INSERT INTO `alumno`(`dni`, `nombre`, `apellido`, `fecha_nacimiento`, `estado`) VALUES (?,?,?,?,?)";
        try {

            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, alumnoAux.getDni());
            ps.setString(2, alumnoAux.getNombre());
            ps.setString(3, alumnoAux.getApellido());
            ps.setDate(4, java.sql.Date.valueOf(alumnoAux.getFecha_nacimiento()));
            ps.setBoolean(5, true);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "El Registro fue agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el registro");

            }

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumnoAux.setId_alumno(rs.getInt(1));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

    }

    public Alumno readAlumno(int id) {
        String sql = "SELECT * FROM `alumno` WHERE estado=1 AND id_alumno = ?";
        Alumno alumnoAux = new Alumno();
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumnoAux.setId_alumno(id);
                alumnoAux.setDni(rs.getString("dni"));
                alumnoAux.setNombre(rs.getString("nombre"));
                alumnoAux.setApellido(rs.getString("apellido"));
                alumnoAux.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alumnoAux.setEstado(rs.getBoolean("estado"));
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
        return alumnoAux;
    }

    public ArrayList<Alumno> readAllAlumno() {
        ArrayList<Alumno> listaAux = new ArrayList();
        String sql = "SELECT * FROM `alumno` WHERE estado=1";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumnoAux = new Alumno();
                alumnoAux.setId_alumno(rs.getInt("id_alumno"));
                alumnoAux.setDni(rs.getString("dni"));
                alumnoAux.setNombre(rs.getString("nombre"));
                alumnoAux.setApellido(rs.getString("apellido"));
                alumnoAux.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                alumnoAux.setEstado(rs.getBoolean("estado"));
                listaAux.add(alumnoAux);
            }

            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

        return listaAux;
    }

    public void updateAlumno(int id, Alumno alumnoAux, int dato) {
        String sql = "";

        switch (dato) {
            case 1:
                sql = "UPDATE `alumno` SET `dni`=?,`nombre`=?,`apellido`=?,`fecha_nacimiento`=?"
                        + ",`estado`=? WHERE id_alumno=?";
                try {
                    PreparedStatement ps = conec.prepareStatement(sql);
                    ps.setInt(6, id);
                    ResultSet rs = ps.getGeneratedKeys();

                    ps.setString(1, alumnoAux.getDni());
                    ps.setString(2, alumnoAux.getNombre());
                    ps.setString(3, alumnoAux.getApellido());
                    ps.setDate(4, java.sql.Date.valueOf(alumnoAux.getFecha_nacimiento()));
                    ps.setBoolean(5, alumnoAux.isEstado());

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

                    }

                    conec.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

                }
                break;
            case 2:
                sql = "UPDATE `alumno` SET `dni`=? WHERE id_alumno=?";
                try {
                    PreparedStatement ps = conec.prepareStatement(sql);
                    ps.setInt(2, id);
                    ResultSet rs = ps.getGeneratedKeys();

                    ps.setString(1, alumnoAux.getDni());

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

                    }

                    conec.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

                }
                break;
            case 3:
                sql = "UPDATE `alumno` SET `nombre`=? WHERE id_alumno=?";
                try {
                    PreparedStatement ps = conec.prepareStatement(sql);
                    ps.setInt(2, id);
                    ResultSet rs = ps.getGeneratedKeys();

                    ps.setString(1, alumnoAux.getNombre());

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                    }

                    conec.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

                }
                break;
            case 4:
                sql = "UPDATE `alumno` SET `apellido`=? WHERE id_alumno=?";
                try {
                    PreparedStatement ps = conec.prepareStatement(sql);
                    ps.setInt(2, id);
                    ResultSet rs = ps.getGeneratedKeys();

                    ps.setString(1, alumnoAux.getApellido());

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

                    }

                    conec.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

                }
                break;
            case 5:
                sql = "UPDATE `alumno` SET `fecha_nacimiento`=? WHERE id_alumno=?";
                try {
                    PreparedStatement ps = conec.prepareStatement(sql);
                    ps.setInt(2, id);
                    ResultSet rs = ps.getGeneratedKeys();

                    ps.setDate(1, java.sql.Date.valueOf(alumnoAux.getFecha_nacimiento()));

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");

                    }

                    conec.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

                }
                break;
            case 6:
                sql = "UPDATE `alumno` SET `estado`=? WHERE id_alumno=?";
                try {
                    PreparedStatement ps = conec.prepareStatement(sql);
                    ps.setInt(2, id);
                    ResultSet rs = ps.getGeneratedKeys();
                    ps.setBoolean(1, alumnoAux.isEstado());

                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                    }

                    conec.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

                }

                break;
        }

    }

    public void deleteAlumno(int id) {
        String sql = "DELETE FROM inscripcion WHERE id_alumno=?";
        String sql2 = "DELETE FROM alumno WHERE id_alumno=?";
        
         if((JOptionPane.showConfirmDialog(null, "Borara el "
                 + "alumno con id "+ id+" y todos los datos relacionados a este desea continuar?", "Confirmar Borrado",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE))==0){
        try {
                PreparedStatement ps = conec.prepareStatement(sql);
                PreparedStatement ps2 = conec.prepareStatement(sql2);
                ps.setInt(1, id);
                ps2.setInt(1, id);
                if (ps.executeUpdate() > 0 || ps2.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "El Registro fue modificado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                }

                conec.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

            }
        }
           

    }

}
