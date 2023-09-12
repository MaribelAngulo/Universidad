package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import newpackage.entidades.Materia;

public class MateriaData {

    private Connection con = null;  //Creo la instancia conexion

    //Constructor vacio
    public MateriaData() {
        con = Conexion.getConexion();
    }

    // Metodo para agregar materia
    public void agregarMateria(Materia materia) {
        // Consulta sql para insertar materia
        String sql = "INSERT INTO materia(nombre, anio, estado) VALUES (?, ?, ?)";
        
        try {
            Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //PreparedStatement con la consulta sql
            ps.setString(1, materia.getNombre()); //Asignacion de valores
            ps.setInt(2, materia.getAnioMateria()); //Asignacion de valores
            ps.setBoolean(3, materia.isActivo()); //Asignacion de valores
            ps.executeUpdate(); // Ejecutar PreparedStatement
            
            ResultSet rs = ps.getGeneratedKeys(); //Devolver clave generada
            if (rs.next()){
                materia.setIdMateria(rs.getInt(1)); // Asignar IdMateria
                JOptionPane.showMessageDialog(null, "Materia Agregada"); //Dialogo de materia agregada
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }
    
    // Metodo para modificar materia
    public void modificarMateria(Materia materia){
        // Consulta sql para insertar materia
        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? WHERE idMascota = ?";
        
        try {
            Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setString(1, materia.getNombre()); //Asignacion de valores
            ps.setInt(2, materia.getAnioMateria()); //Asignacion de valores
            ps.setBoolean(3, materia.isActivo()); //Asignacion de valores
            ps.setInt(4, materia.getIdMateria()); //Asignacion de valores
            ps.executeUpdate(); // Ejecutar PreparedStatement
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }
    
    // Metodo para buscar materia
    public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria=?"; // Consulta sql para buscar materia
         
        try {
            Conexion.getConexion(); // Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado")); 
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Conexion.cerrarConexion(con);
        }
        return materia;    
    }

}
