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
        <h1>Una cartuchera será perfecta para tus objetos pequeños, <br> ¿De que tamaño te gustaría?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="4 pequeno"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Pequeño"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="4 mediano"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Mediano"></input>
        </form>
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="4 grande"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Grande"></input>
        </form>
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="3 grande"></input>
            <input name="redirect" type="hidden" value="ejecutar"></input>
            <input name="submit" type="submit" value="Grande"></input>
        </form> 
            
        
    </body>
</html>
