package web;
//Convertimos la clase en un servlet

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Suponemos que el usuario visita por primera vez
        boolean nuevoUsuario = true;
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();

        //buscamos si existe una cookie creada con anterioridad
        //llamda visitanteRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //Si ya existe la cookie entonces es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }

        String mensaje = null;

        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("VisitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje:" + mensaje);
        out.close();
    }

}
