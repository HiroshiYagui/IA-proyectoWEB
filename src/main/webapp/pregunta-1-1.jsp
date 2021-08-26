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
        <h1>¿Objetos Grandes o Pequeños?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="2 grandes"></input>
            <input name="redirect" type="hidden" value="pregunta-2-1"></input>
            <input name="submit" type="submit" value="Grandes"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="2 pequenos"></input>
            <input name="redirect" type="hidden" value="pregunta-2-2"></input>
            <input name="submit" type="submit" value="Pequeños"></input>
        </form>
            
        
    </body>
</html>
