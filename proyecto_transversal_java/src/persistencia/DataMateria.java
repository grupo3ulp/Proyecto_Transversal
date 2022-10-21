
package persistencia;

import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DataMateria {
    
    private Connection conec;

    public DataMateria() {
        this.conec = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia a){
        try{
            String sql = "INSERT INTO `materia`( `nombre`, `año`, `estado`) VALUES (?,?,?)"; 
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getAnio());
            ps.setBoolean(3, true);
            
            if (ps.executeUpdate() > 0) {
                 JOptionPane.showMessageDialog(null, "La materia fue agregada correctamente");
            } else {
                 JOptionPane.showMessageDialog(null, "No se pudo agregar la materia");
            }
            
            ResultSet rs = ps.getGeneratedKeys();
            
             if (rs.next()) {
                a.setId_materia(rs.getInt(1));
            }
             
             conec.close();
        }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
    }
    
}
