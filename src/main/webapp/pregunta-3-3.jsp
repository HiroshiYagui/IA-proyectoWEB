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
        <h1>Al parecer busca un monedero, <br> ¿De que tipo te gustaría?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="4 minimonedero"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Minimonedero"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="4 sencillero"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Sencillero"></input>
        </form>
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="4 tarjetero"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Tarjetero"></input>
        </form>
            
        
    </body>
</html>
