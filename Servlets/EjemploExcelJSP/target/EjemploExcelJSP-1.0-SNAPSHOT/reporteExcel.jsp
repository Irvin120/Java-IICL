<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType = "application/vnd.ms-excel"%>

<% String nombreArchivo = "repote.xls";
   response.setHeader("Content-Disposition", "attachment;filename=" + nombreArchivo);
%>


<!DOCTYPE html>
<html>
    <head>
        <title>Gneracion de Reporte Excel</title>
    </head>
    <body>
        <h1>title</h1>

        <br/>
        <table border="1" >
            <tr> 
                <th> Cursos </th>        
                <th> Descripcion </th>
                <th> Fecha </th>
            </tr>

            <tr> 
                <th>1. Fundamentos de Java </th>        
                <th> Aprendemos la sintaxis basica de Java</th>
                <th> <%= Conversiones.format(new Date()) %> </th>
            </tr>


            <tr> 
                <th>2. Programacion con Java </th>        
                <th> Pondremos en practica conceptos de la programacion orientada a objetos</th>
                <th> <%= Conversiones.format(new Date()) %> </th>
            </tr>

        </table>

    </body>
</html>
