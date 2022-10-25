package persistencia;

import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DataMateria {

    private Connection conec;

    public DataMateria() {
        this.conec = Conexion.getConexion();
    }

    public void createMateria(Materia a) {
        try {
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");

        }
    }

    public Materia readMateria(int id) {
        String sql = "SELECT * FROM `materia` WHERE estado=1 AND id_materia = ?";
        Materia materiaAux = new Materia();
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materiaAux.setId_materia(id);
                materiaAux.setNombre(rs.getString("nombre"));
                materiaAux.setAnio(rs.getInt(3));
                materiaAux.setEstado(rs.getBoolean("estado"));
            }
            conec.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
        return materiaAux;
    }
    
    public ArrayList<Materia> readAllMateria(){
        ArrayList<Materia> listaAux = new ArrayList();
        String sql = "SELECT * FROM `materia` WHERE estado=1";
        try{
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Materia materiaAux = new Materia();
                materiaAux.setId_materia(rs.getInt("id_materia"));
                materiaAux.setNombre(rs.getString("nombre"));
                materiaAux.setAnio(rs.getInt(3));
                materiaAux.setEstado(rs.getBoolean("estado"));
                listaAux.add(materiaAux);
            }
            conec.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia SQL Erronea");
        }
        return listaAux;
    }
}
