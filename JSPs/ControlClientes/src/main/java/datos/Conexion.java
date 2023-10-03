package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
//Declaracion de las variables 

    private static final String JDBC = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimeZone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "kawhi";

//Agregamos el metodo que va a recuperar la conexion a la base de datos
    public static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        //Inicializamos la variable dataSource
        ds.setUrl(JDBC); //Especificamos la url para conectarnos a la base de datos;
        ds.setUsername(JDBC_USER);//Especificamos el nombre del usuario
        ds.setPassword(JDBC_PASSWORD);
        //Iniciamos 50 conexiones, estas pueden ser modificadas 
        ds.setInitialSize(50);
        return ds;
    }

    //Definimos un metodo para obtener una conexion a la base de datos
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    //Implementamos algunos datos para cerrar los objetos de resulSet y Connection y 
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
