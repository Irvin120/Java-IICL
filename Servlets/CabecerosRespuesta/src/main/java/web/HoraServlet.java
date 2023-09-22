package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");

        Date fecha = new Date();

        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        
        String horaConfirmada = formateador.format(fecha);
        
        PrintWriter out = response.getWriter();
        
        out.print(horaConfirmada);
        
        out.close();
        
    }

}
