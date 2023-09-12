
package AccesoADatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import newpackage.entidades.Alumno;


public class AlumnoData {

 private Connection con; //CREO UNA VARIABLE DE TIPO CONEXION

    public AlumnoData() {
    }

    //AGREGO UN ALUMNO
    public void guardarAlumno(Alumno alumno) {

        //ESTA VARIBLE REPRESENTA MI SENTENCIA SQL
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) VALUES "
                + "(" + alumno.getDni() + ",'" + alumno.getApellido() + "','" + alumno.getNombre() + "','" + alumno.getFechaNac() + "'," + alumno.isActivo()+ ")";
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
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
                + ",estado=" + alumno.isActivo()+ " WHERE idAlumno=" + alumno.getIdAlumno();
        //CREO UNA CONEXION CON MI BASE DE DATOS
        con = Conexion.getConexion();
        try {
            //ENVIO LA SENTENCIA SQL Y LA EJECUTO
            PreparedStatement ps = con.prepareStatement(sql);
            int res = ps.executeUpdate();
            if (res == 0) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el alumno...");
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
                JOptionPane.showMessageDialog(null, "Alumno Eliminado ....");
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
    public Alumno buscarAlumno(int id){
        Alumno alum=new Alumno();
        return alum;
    }
    
    //RETORNO EL ALUMNO QUE REPRESENTA ESE DNI
    public Alumno buscarAlumnoPorDni(int dni){
         Alumno alum=new Alumno();
        return alum;
    }
            
    //RETORNO UNA LISTA DE ALUMNOS
  /* public List<Alumno> listarAlumnos(){
      
    }*/

       
}
