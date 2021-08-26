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
        <h1>¿Necesitas llevar billetes o monedas?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="3 billetes"></input>
            <input name="redirect" type="hidden" value="pregunta-3-2"></input>
            <input name="submit" type="submit" value="Billetes"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="3 monedas"></input>
            <input name="redirect" type="hidden" value="pregunta-3-3"></input>
            <input name="submit" type="submit" value="Monedas"></input>
        </form>
            
        
    </body>
</html>
