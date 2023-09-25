package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. Procesamos los parametros
        String accion = request.getParameter("accion");

        //2. Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);

        //3. Agregamos el javabean a algun alcance
        //revisamos la accion proporcionada
        if ("agregaVariables".equals(accion)) {
            //Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            
            //Alcance de session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSession", recSesion);
            
            //Alcance de application
            ServletContext  application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);
            
            //Agregamos mensaje para saber que es lo que se ejecuto 
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //4. redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }
        else if("listarVariables".equals(accion)){
            //4. Redireccionamiento al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }
        else{
            //Redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            
            //Esta linea no agregaria informacion al JSP ya que no propaga los objetos reques y response
            // response.sendRedirect("index.jsp");
        }
    }

}
