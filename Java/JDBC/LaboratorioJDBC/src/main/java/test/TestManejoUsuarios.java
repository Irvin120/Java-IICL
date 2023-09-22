package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            //INSERTAR UN NUEVO USUARIO
            UsuarioDAO usuarioJdbc = new UsuarioDAO(conexion);

            Usuario nuevoUsuario = new Usuario();
            
            nuevoUsuario.setUsuario("Ignacio Cueto");
            nuevoUsuario.setPassword("Lopez");

            usuarioJdbc.insertar(nuevoUsuario);
            
            //ACTUALIZAR NUEVO USUARIO
            Usuario actualizarUsuario = new Usuario();
            actualizarUsuario.setIdUsuario(9);
            actualizarUsuario.setUsuario("Irvin Cueto");
            actualizarUsuario.setPassword("4122");
            
            usuarioJdbc.actualizar(actualizarUsuario);
            

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
