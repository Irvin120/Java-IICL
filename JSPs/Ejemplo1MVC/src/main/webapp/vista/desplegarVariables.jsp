<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables </title>
    </head>
    <body>
        <h1>Despliege de variables</h1>
        Variable en alcance de request
        ${mensaje}
        <br/>
        <br/>
        Variable en alcance de sesion
        <br/>
        Rectangulo:
        Base: ${rectangulo.base}
        Altura: ${rectangulo.altura}
        Area ${rectangulo.area}
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
