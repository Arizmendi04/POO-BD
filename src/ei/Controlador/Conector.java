package ei.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conector {
    
    public Connection con = null;
    public Statement comando = null;
    public ResultSet registro;

    public Connection JavaToMySQL(){
        try{
            //Instanciar librería del conector
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Datos de la conexion con la base de datos
            String servidor = "jdbc:mysql://localhost:3306/tienda_ropa";
            String usuario = "root";
            String password = "";

            //Crear la conexion
            con = DriverManager.getConnection(servidor, usuario, password);
            
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se pudo encontrar la clase Conexion");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error con la información gestionada en la aplicación");
        }
        if(con != null){   
            // JOptionPane.showMessageDialog(null,"Conexión exitosa");
            return con;
        }
        return null;
    }
    
    
    
}
