package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html; charset = UTF-8");

        //creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();

        //Recuperar la lista de los objetos previos
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //verificamos si la lista de articulos existe
        if (articulos == null) {
            //iniciamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //procesar el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);

        }

        try (
            //imprimir la lista de los articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1> Lista de Articulos </h1>");
            out.print("<br/>");
            //iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //agregamos un link para regresar al inicio
            out.print("<br/>");
            out.print("<a href='/EjemploCarritoCompras'> Regresar al inicio </a> ");
        }

    }

}
