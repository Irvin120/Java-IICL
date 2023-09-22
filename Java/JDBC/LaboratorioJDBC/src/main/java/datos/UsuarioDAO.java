package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    //creamos constructor para recibir la conexion transaccional
    public UsuarioDAO() {

    }

    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    //modificaion de las connecciones para que se mantenga abierta en caso de tener una coneccion transaccional PENDIENTE
    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String nombreUsuario = rs.getString("usuario");
                String password = rs.getString("password");

                usuario = new Usuario(idUsuario, nombreUsuario, password);

                usuarios.add(usuario);

            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
                return usuarios;

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            return usuarios;

        }

    }

    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            //tratamos de hacer la coneccion
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();

        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) throws SQLException {
        //Declaracion de variables de variables para la conexion de la base 
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosActualizados = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();

            stmt = conn.prepareStatement(SQL_UPDATE);

            //Establecer los valores para los marcadores de posicion 
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());

            //ejecutar consulta y actualizar los cambios
            registrosActualizados = stmt.executeUpdate();
            System.out.println("Registros Actualizados " + registrosActualizados);

        } finally {
            try {
                //Cerrando conexiones
                stmt.close();
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registrosActualizados;
    }

    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registrosEliminados = 0;

        //inicio de la conexion
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            // Establecer los valores para los marcadores de posición
            stmt.setInt(1, usuario.getIdUsuario());

            registrosEliminados = stmt.executeUpdate();

        } finally {
            try {
                //cerramos conexion y consulta
                conn.close();
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registrosEliminados;

    }

}
