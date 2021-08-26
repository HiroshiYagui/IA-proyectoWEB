<%-- 
    Document   : pregunta-0
    Created on : 24 ago. 2021, 23:07:56
    Author     : hiros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuestionario de Catalogo</title>
    </head>
    <body>
        <h1>¿Es de un uso especifico?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="3 lapiz-digital"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Para mi lapiz digital"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="3 agenda"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Para mi agenda"></input>
        </form>
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="3 uso-general"></input>
            <input name="redirect" type="hidden" value="pregunta-3-1"></input>
            <input name="submit" type="submit" value="Uso General"></input>
        </form>
            
        
    </body>
</html>
