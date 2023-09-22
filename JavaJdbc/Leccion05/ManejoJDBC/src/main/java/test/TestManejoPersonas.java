package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaJdbc = new PersonaDAO(conexion);

            Persona cambioPersona = new Persona();
            
            cambioPersona.setIdPersona(7);
            cambioPersona.setNombre("Yhair");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("Yhair@gmail.com");
            cambioPersona.setTelefono("2489382321");
            
            personaJdbc.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            
            nuevaPersona.setNombre("Irvin");
            nuevaPersona.setApellido("Cueto");
            
            personaJdbc.insertar(nuevaPersona);

            conexion.commit();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }

        }

    }
}
