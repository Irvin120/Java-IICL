<%-- 
    Document   : manejoErrores
    Created on : 21 sep. 2023, 22:37:08
    Author     : Irvin Cueto
--%>
<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de errores</title>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        <br/>
        Ocurrio una excepcion <%= exception.getMessage() %>
        <br/>
        <textarea cols="30" rows="5">
            <% exception.printStackTrace(new PrintWriter(out)); %>
        </textarea>

    </body>
</html>