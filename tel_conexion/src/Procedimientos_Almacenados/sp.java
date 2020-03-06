
package Procedimientos_Almacenados;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Calendar;
import sun.security.util.Password;
import tel_conexion.Tel_conexion;
public class sp {
    java.util.Date fecha=null;
    
    public static void insertaEmpleado(String a, String b, String c, int d, String e, String f, String g, String h)throws SQLException{
        String sql="{call SP_insertarEmpleado (?,?,?,?,?,?,?,?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setString(5, e);
        entrada.setString(6, f);
        entrada.setString(7, g);
        entrada.setString(8, h);
        entrada.execute();
    }
    public static void eliminaEmpleado(int a)throws SQLException{
        String sql="{call SP_eliminar_Empleado (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    
    
}
