<%-- 
    Document   : index
    Created on : 16 sep. 2023, 21:41:15
    Author     : Irvin Cueto
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Uso de las diferentes directivas -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%--Se puede quitar debido a que ya se especifico el tipo de contenido--%>
        <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> --%>
        <title>HolaMundo JSP</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs</h1>
        <ul>
            <li><% out.print("Hola Mundo con Scriplets"); %></li>
            <li>${"Hola Mundo con Expression Language (EL)"}</li>
            <li><%="Hola Mundo con Expresiones" %></li> <%--Sustitucion de out--%>
            <li> <c:out value="HolaMundo con JSTL"/> </li>
        </ul>

    </body>
</html>
