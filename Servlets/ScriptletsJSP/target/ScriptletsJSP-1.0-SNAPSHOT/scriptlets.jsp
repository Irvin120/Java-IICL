<%-- 
    Document   : scriptlets
    Created on : 17 sep. 2023, 0:20:14
    Author     : Irvin Cueto
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%--Scriptlet para enviar informacion al navegador  --%>
        <% 
            out.print("Saludos desde un Scriptlet"); 
        %>

        <%-- Scriptlet para manipular los objetos implicitos --%>
        <br>
        <% 
    String nombreAplicacion = request.getContextPath();
    out.print("nombre de la aplicacion:" + nombreAplicacion);
        %>

        <br>
        <%-- Scriptlet con codigo condicionado--%>
        <% 
            if(session != null && session.isNew()){
        %>
        La sesion SI es nueva

        <% 
            } else if (session != null){
        %>
        la sesion NO es nueva
        <% } %>

        <br>
        <a href="index.html"> Regresar al inicio</a>




    </body>
</html>
