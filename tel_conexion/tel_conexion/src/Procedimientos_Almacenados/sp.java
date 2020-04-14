



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
    
    public static void buscarEmpleado(int a)throws SQLException{
        String sql="{call SP_buscarEmpleado (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setInt(1, a);
        entrada.execute();
    }
    
        /*public static void modificaEmpleado(String a, String b, String c, int d, String e, String f, String g, String h)throws SQLException{
        String sql="{call SP_modificarEmpleado (?,?,?,?,?,?,?,?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.setString(3, c);
        entrada.setInt(4, d);
        entrada.setString(5, e);
        entrada.setString(6, f);
        entrada.setString(7, g);
        entrada.setString(8, h);
        entrada.executeUpdate();
    
    
    
    }*/
     public static void insertaCliente(String a, String b, String c, String d)throws SQLException{
        String sql="{call SP_insertarCliente (?,?,?,?)}";
        CallableStatement client=Tel_conexion.GetConnection().prepareCall(sql);
        client.setString(1, a);
        client.setString(2, b);
        client.setString(3, c);
        client.setString(4, d);
        client.execute();
    }
     public static void eliminacliente(int a)throws SQLException{
        String sql="{call SP_eliminar_cliente (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setInt(1, a);
        entrada.execute();
    }
     
     public static void insertaEstado(String a)throws SQLException{
        String sql="{call SP_insertarEstado (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setString(1, a);
        entrada.execute();
     }
     
     public static void eliminaestado(int a)throws SQLException{
        String sql="{call SP_eliminar_estado (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setInt(1, a);
        entrada.execute();
     }
     public static void insertapais(String a)throws SQLException{
        String sql="{call SP_insertarPais (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setString(1, a);
        entrada.execute();}
     
     public static void eliminapais(int a)throws SQLException{
        String sql="{call SP_eliminar_pais (?)}";
        CallableStatement entrada=Tel_conexion.GetConnection().prepareCall(sql);
        entrada.setInt(1, a);
        entrada.execute();
     }
     
<<<<<<< Updated upstream:tel_conexion/tel_conexion/src/Procedimientos_Almacenados/sp.java
=======
    }
     public static void insertaretelcli(int a, int b)throws SQLException{
        String sql="{call SP_insertarRetelcli (?,?)}";
        CallableStatement tel=Tel_conexion.GetConnection().prepareCall(sql);
        tel.setInt(1, a);
        tel.setInt(2, b);
        tel.execute();
     
    }
     
     public static void inserta_Relacion_direccion_cliente(int a, int b)throws SQLException{
        String sql="{call SP_insertarRedicli (?,?)}";
        CallableStatement tel=Tel_conexion.GetConnection().prepareCall(sql);
        tel.setInt(1, a);
        tel.setInt(2, b);
        tel.execute();
     
    }
     
     public static void inserta_Relacion_correo_cliente(int a, int b)throws SQLException{
        String sql="{call SP_insertarRecocli (?,?)}";
        CallableStatement tel=Tel_conexion.GetConnection().prepareCall(sql);
        tel.setInt(1, a);
        tel.setInt(2, b);
        tel.execute();
     
    }
     public static void inserta_correo(String a, String b)throws SQLException{
        String sql="{call SP_insertarCorreo (?,?)}";
        CallableStatement tel=Tel_conexion.GetConnection().prepareCall(sql);
        tel.setString(1, a);
        tel.setString(2, b);
        tel.execute();
     
    }
    public static void inserta_Direccion(String a, int b, int c, String d)throws SQLException{
        String sql="{call SP_insertarDireccion (?,?,?,?)}";
        CallableStatement tel=Tel_conexion.GetConnection().prepareCall(sql);
        tel.setString(1, a);
        tel.setInt(2, b);
        tel.setInt(3, c);
        tel.setString(4, d);
        tel.execute();
     
    }
>>>>>>> Stashed changes:tel_conexion/src/Procedimientos_Almacenados/sp.java
}