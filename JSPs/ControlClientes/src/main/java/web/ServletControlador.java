package web;

//Convertimos la clase en un servler
import datos.ClienteDaoJDBC;
import dominio.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCliente(request, response);
                    break;
                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }
    }

    protected void accionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println("Clientes" + clientes);

        HttpSession sesion = request.getSession();

        sesion.setAttribute("clientes", clientes);
        sesion.setAttribute("totalClientes", clientes.size());
        sesion.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));

        //No se notifica el cambio al navegador
        //request.getRequestDispatcher("clientes.jsp").forward(request, response);
        //Notificamos al navegador del camnio
        response.sendRedirect("clientes.jsp");

    }

    private double calcularSaldoTotal(List<Cliente> clientas) {
        double saldo = 0;

        for (Cliente cliente : clientas) {
            saldo += cliente.getSaldo();
        }
        return saldo;
    }

    private void editarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar el cliente
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));

        System.out.println("ID Cliente: " + cliente.getIdCliente());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Saldo: " + cliente.getSaldo());


// Establecer el cliente como atributo en la solicitud
        request.setAttribute("cliente", cliente);

// Luego, reenviar la solicitud a la página de edición
        request.getRequestDispatcher("/WEB-INF/paginas/cliente/editarCliente.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":

                    this.insertarCliente(request, response);
                    break;

                default:
                    this.accionDefault(request, response);
            }
        } else {
            this.accionDefault(request, response);
        }

    }

    private void insertarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperamos valores del formulario

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        double saldo = 0;
        String saldoString = request.getParameter("saldo");
        if (saldoString != null & !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }

        //Creamos el objeto de cliente (modelo)
        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);

        //Insertamos el nuevo objeto en la base de datos
        int registrosModificados = new ClienteDaoJDBC().insertar(cliente);
        System.out.println("registrosModificados = " + registrosModificados);

        //Redireccionamos a accion por defaul
        this.accionDefault(request, response);
    }

}
