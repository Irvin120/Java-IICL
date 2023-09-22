package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet {

//    Peticion de tipo do get
    @Override
    protected void doGet(HttpServletRequest reques, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola mundo desde servlets");

    }

}
