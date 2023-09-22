package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import newpackage.entidades.Materia;

public class MateriaData {

    private Connection con = null;  //Creo la instancia conexion

    //Constructor vacio
    public MateriaData() {
    }

    // Metodo para agregar materia
    public void agregarMateria(Materia materia) {
        // Consulta sql para insertar materia
        String sql = "INSERT INTO materia(nombre, anio, estado) VALUES (?, ?, ?)";

        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //PreparedStatement con la consulta sql
            ps.setString(1, materia.getNombre()); //Asignacion de valores
            ps.setInt(2, materia.getAnioMateria()); //Asignacion de valores
            ps.setBoolean(3, true); //Asignacion de valores
            ps.executeUpdate(); // Ejecutar PreparedStatement
            ResultSet rs = ps.getGeneratedKeys(); //Devolver clave generada
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Materia agregada con el codigo: " + rs.getInt(1)); //Dialogo de materia agregada
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }

    // Metodo para modificar materia
    public void modificarMateria(Materia materia) {
        // Consulta sql para insertar materia
        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? WHERE idMateria =?";
        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setString(1, materia.getNombre()); //Asignacion de valores
            ps.setInt(2, materia.getAnioMateria()); //Asignacion de valores
            ps.setBoolean(3, materia.isActivo()); //Asignacion de valores
            ps.setInt(4, materia.getIdMateria()); //Asignacion de valores
            ps.executeUpdate(); // Ejecutar PreparedStatement
            JOptionPane.showMessageDialog(null, "Materia modificada");
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }

    // Metodo para buscar materia
    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria=?"; // Consulta sql para buscar materia

        try {
            con = Conexion.getConexion(); //Inicio la conexion
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta SQL
            ps.setInt(1, id); //Asignacion de valores
            ResultSet rs = ps.executeQuery();
            if (rs.next()) { //Verificar si existe una materia con ese codigo
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria")); //Setear nombre en TextField
                materia.setNombre(rs.getString("nombre")); //Setear nombre en TextField
                materia.setAnioMateria(rs.getInt("anio")); //Setear año en TextField
                if (rs.getBoolean("estado") == true) {
                    materia.setActivo(true); //Marcar RadioButton si estado es true
                } else {
                    materia.setActivo(false); //Desmarcar RadioButton si estado es false
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe una materia con ese codigo"); //Dialogo si no existe una materia con ese codigo
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con); //Cerrar conexion
        }
        return materia;
    }

    // Metodo para eliminar materia
    public void eliminarMateria(Materia materia) {
        // Consulta sql para eliminar
        String sql = "UPDATE materia SET estado=? WHERE idMateria=?";
        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            if (materia.isActivo()) {
                PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
                ps.setBoolean(1, false); //Asignacion de valores
                ps.setInt(2, materia.getIdMateria()); //Asignacion de valores
                ps.executeUpdate(); // Ejecutar PreparedStatement
                JOptionPane.showMessageDialog(null, "Materia eliminada");
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "La materia ya ha sido eliminada"); //Dialogo de materia eliminada 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con); //Cerrar conexion
        }
    }

// Metodo para listar materias
    public List listarMaterias() {

        ArrayList<Materia> lista = new ArrayList<Materia>();

        // Consulta sql para insertar materia
        String sql = "SELECT * FROM Materia";
        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ResultSet rs = ps.executeQuery(); // Ejecutar PreparedStatement

            while (rs.next()) { // Bucle para agregar elementos a la lista
                lista.add(new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("anio"), rs.getBoolean("estado")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con); // Cerrar conexion
        }
        return lista;
    }
    
}
