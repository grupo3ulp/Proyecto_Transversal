package persistencia;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataAlumno {

    private Connection conec;

    public DataAlumno() {
        this.conec = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno a) {

        try {
            String sql = "INSERT INTO `alumno`(`dni`, `nombre`, `apellido`, `fecha_nacimiento`, `estado`) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, a.getDni());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApellido());
            ps.setDate(4, java.sql.Date.valueOf(a.getFecha_nacimiento()));
            ps.setBoolean(5, true);
        
            if (ps.executeUpdate() > 0) {
                 JOptionPane.showMessageDialog(null, "El Registro fue agregado correctamente");
            } else {
                 JOptionPane.showMessageDialog(null, "No se pudo agregar el registro");

            }
           
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                a.setId_alumno(rs.getInt(1));
            }
            

            conec.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }

    }

}
