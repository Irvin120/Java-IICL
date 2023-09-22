package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    //caracteres de conexion mas caracteres especiales de use
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimeZone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "kawhi";

    //metodo para obtener la conexion de la base de datos 

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
     public static void close (ResultSet rs) throws SQLException{
        rs.close();
    }
     
    public static void close (Statement smtm) throws SQLException {
        smtm.close();
    }
    
    public static void  close (PreparedStatement smtm) throws SQLException {
        smtm.close();
    }
    
    public static void close (Connection con) throws SQLException{
        con.close();
    }
    
  
    
}
