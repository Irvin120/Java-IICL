package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//convertimos clase en un servLet
@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Indicamos el tipo de respuesta que vamos a retornar
        response.setContentType("text/html;charset=UTF-8");
        
        //Solicitamos el objeto de session
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //Solicitamos un atributo a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        //Si es nullo es la primera vez que accedemos
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }else{
            contadorVisitas++;
            titulo = "Bienvenido Nuevamente";
        }
        
        //Agregamos el nuevo valor a la sesion
        
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //Mandamos la respuesta al cliente
        
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br/>");
        out.print("no. accesos al recurso:" + contadorVisitas);
        out.print("<br/>");
        out.print("ID de la sesion" + sesion.getId());
        out.close();
    }
    
}
