/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import newpackage.entidades.Alumno;
import newpackage.entidades.Inscripcion;
import newpackage.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class InscripcionData {
    
    private MateriaData materiaData = new MateriaData();
    private AlumnoData alumnoData = new AlumnoData();
    private Connection con = null; //CREO UNA VARIABLE DE TIPO CONEXION

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria) VALUES (?, ?)";
        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //PreparedStatement con la consulta sql
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno()); //Asignacion de valores
            ps.setInt(3, inscripcion.getMateria().getIdMateria()); //Asignacion de valores
            ps.executeUpdate(); // Ejecutar PreparedStatement

            ResultSet rs = ps.getGeneratedKeys(); //Devolver clave generada
            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1)); // Asignar IdMateria
                JOptionPane.showMessageDialog(null, "Inscripcion realizada. Cod. de Inscripcion: "+rs.getInt(1)); //Dialogo de materia agregada
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> incripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));
                Alumno alumno = alumnoData.buscarAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);
                Materia materia = materiaData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                //Guardo la inscripcion en la lista
                incripciones.add(inscripcion);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return incripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> incripcionesPorAlumno = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno); //Asignacion de valores
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));
                Alumno alumno = alumnoData.buscarAlumno(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);
                Materia materia = materiaData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                //Guardo la inscripcion en la lista
                incripcionesPorAlumno.add(inscripcion);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return incripcionesPorAlumno;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
         ArrayList<Materia> materiasCursadas = new ArrayList<>();
         String sql = "SELECT materia.idMateria, materia.nombre, materia.anio, materia.estado " +
                     "FROM materia " +
                     "INNER JOIN inscripcion " +
                     "ON materia.idMateria = inscripcion.idMateria " +
                     "WHERE inscripcion.idAlumno=? AND materia.estado=1";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno); //Asignacion de valores
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("estado"));
                //Guardo la inscripcion en la lista
                materiasCursadas.add(materia);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return materiasCursadas;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
        ArrayList<Materia> materiasNoCursadas = new ArrayList<>();
         String sql = "SELECT materia.idMateria, materia.nombre, materia.anio " +
                     "FROM materia " +
                     "INNER JOIN inscripcion " +
                     "ON materia.idMateria = inscripcion.idMateria " +
                     "WHERE inscripcion.idAlumno!=? AND materia.estado=1 " +
                     "GROUP BY materia.idMateria";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno); //Asignacion de valores
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                //Guardo la inscripcion en la lista
                materiasNoCursadas.add(materia);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return materiasNoCursadas;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        // Consulta sql para insertar materia
        String sql = "DELETE FROM inscripcion WHERE idAlumno =? AND idMateria=?";
        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setInt(1, idAlumno); //Asignacion de valores
            ps.setInt(2, idMateria); //Asignacion de valores
            int res = ps.executeUpdate();
            if (res == 0) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la inscripcion");
            } else {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        // Consulta sql para insertar materia
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno =? AND idMateria=?";
        try {
            con = Conexion.getConexion(); //Conexion con la base de datos
            PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement con la consulta sql
            ps.setDouble(1, nota); //Asignacion de valores
            ps.setInt(2, idAlumno); //Asignacion de valores
            ps.setInt(3, idMateria); //Asignacion de valores
            int res = ps.executeUpdate();
            if (res == 0) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la nota");
            } else {
                JOptionPane.showMessageDialog(null, "Nota modificada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        } finally {
            Conexion.cerrarConexion(con);
        }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        ArrayList<Alumno> alumnos = new ArrayList<>();
         String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre " +
                      "FROM materia " +
                      "INNER JOIN inscripcion ON materia.idMateria = inscripcion.idMateria " +
                      "INNER JOIN alumno ON alumno.idAlumno = inscripcion.idAlumno " +
                      "WHERE materia.estado=1 AND alumno.estado=1 AND materia.idMateria=?";
        try {
            //CREO UNA CONEXION CON MI BASE DE DATOS
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria); //Asignacion de valores
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                //Guardo la inscripcion en la lista
                alumnos.add(alumno);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return alumnos;
    }
}
