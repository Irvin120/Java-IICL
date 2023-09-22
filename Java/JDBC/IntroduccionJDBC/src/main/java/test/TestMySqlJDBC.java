package test;

import java.sql.*;
import java.util.logging.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        //escribir cadena de conexion de la base de datos a la que se van a conectar depende de la base
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimeZone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true"; //cadenas de conexion mas caracteres especiales de use
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver"); cuando se trabaja con aplicaciones locales no deberia de haber problema, solo afecta en la web
            Connection conexion = DriverManager.getConnection(url, "root", "kawhi");
            //Esta linea permite ejecutar sentencias sobre la tabla
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono:" + resultado.getString("telefono"));
                System.out.println("");
            }
            //es importante cerrar siempre las consutas a la base de datos
            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
