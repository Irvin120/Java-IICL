package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int contador = 0;
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("ContadorVisitas")) {
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }

        contador++;

// Actualiza la cookie con el nuevo valor del contador.
        Cookie c = new Cookie("ContadorVisitas", Integer.toString(contador));
        c.setMaxAge(3600);
        response.addCookie(c);

// Imprime las cookies en la respuesta (solo para depuración).
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     out.print(contador);
    }
}
