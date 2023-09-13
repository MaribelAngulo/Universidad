package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import newpackage.entidades.Alumno;

public class AlumnoData {

    private Connection con = null; //CREO UNA VARIABLE DE TIPO CONEXION

    public AlumnoData() {
    }

    //AGREGO UN ALUMNO
    public void guardarAlumno(Alumno alumno) {

        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES "
                + "(" + alumno.getDni() + ",'" + alumno.getApellido() + "','" + alumno.getNombre() + "','" + alumno.getFechaNac() + "'," + alumno.isActivo() + ")";
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Al Insertar Alumno" + ex.getMessage());
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);

    }

    //MODIFICO UN ALUMNO
    public void modificarAlumno(Alumno alumno) {
        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "UPDATE alumno SET dni=" + alumno.getDni() + ",apellido='" + alumno.getApellido() + "',nombre='" + alumno.getNombre() + "',fechaNacimiento='" + alumno.getFechaNac() + "'"
                + ",estado=" + alumno.isActivo() + " WHERE idAlumno=" + alumno.getIdAlumno();
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res == 0) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el alumno...");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno modificado con exito.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar " + ex.getMessage());
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);
    }

    //BORRAR ALUMNO LOGICAMENTE
    public void eliminarAlumno(int id) {

        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "UPDATE alumno SET estado=false WHERE idAlumno=" + id;
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado ....");
            } else {
                JOptionPane.showMessageDialog(null, "Imposible eliminar alumno ...");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar" + ex.getMessage());
        }
        //CUANDO TERMINA TODO CIERRO MI CONEXION
        Conexion.cerrarConexion(con);
    }

    //RETORNO EL ALUMNO QUE REPRESENTA EL ID
    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = " + id + " AND estado = 1";
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento"));
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return alumno;
    }

    //RETORNO EL ALUMNO QUE REPRESENTA ESE DNI
    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = " + dni + " AND estado = 1";
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(dni);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento"));
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        Conexion.cerrarConexion(con);
        return alumno;
    }

    //RETORNO UNA LISTA DE ALUMNOS  
    public ArrayList<Alumno> listarAlumnos() {
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        con=Conexion.getConexion();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento"));
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }
}
