
package tel_conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Tel_conexion {
    @SuppressWarnings("finally")
	public static Connection GetConnection()
    {
        Connection conexion=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost;databaseName=telematica2020;user=sa;password=123;";
            conexion=DriverManager.getConnection(url);
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la conexion con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la conexion con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la conexion con la BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        finally
        {
            return conexion;
        }
        
   }
    
    


   
    public static void main(String[] args) {
        Connection miConexion;
        miConexion=Tel_conexion.GetConnection();
        autentication log = new autentication();
        if(miConexion!=null)
        {
           JOptionPane.showMessageDialog(null, "Conexión realizada correctamente");
           new autentication().setVisible(true);
            
            
            
        }
    }
}
        
        
        
       
    
    

