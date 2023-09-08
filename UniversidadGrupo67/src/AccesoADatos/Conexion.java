
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
 
      // CREO TRES VARIABLES ESTATICAS QUE REPRESENTAN LA BASE DE DATO
    private static String url = "jdbc:mariadb://localhost/universidadulp"; //NOMBRE DE LA BASE DE DATOS
    private static String usuario = "root"; //NOMBRE DE USUARUIO
    private static String password = ""; // PALABRA CLAVE DE ACCESO A LA BASE DE DATOS

    private static Conexion conexion = null; // CREO UNA VARIABLE DE PRIVADA QUE REPRESENTA LA CLASE

    // CREO UN CONSTRUCTOR PRIVADO PARA QUE LA CONEXION NO SE PUEDA INSTANCIAR
    private Conexion() {
        // CARGO EL DRIVER PARA USAR BASE DE DATOS
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver no encontrado " + ex.getMessage());
        }
    }

    public static Connection getConexion() {
        Connection cnn = null;
        if (conexion == null) {  // PREGUNTO SI NO HAY UNA CONEXION ACTIVA
            conexion = new Conexion(); // LLAMO A MI CONSTRUCTOR DENTRO DE LA CLASE
        }
        try { //CREO LA CONEXION
            // ME CONECTO CON LA BASE DE DATOS SEGUN EL NOMBRE
            cnn = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Imposible conectarse con la base de datos " + ex.getMessage());
        }
        return cnn;
    }

    public static void cerrarConexion(Connection mico) {
        if (mico != null) {
            try {
                mico.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Imposible cerrar la base de datos " + ex.getMessage());
            }
        }
    }
    
}
