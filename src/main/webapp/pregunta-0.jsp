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
        <h1>¿Que clases de cosas llevas contigo?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="1 cosas-importantes"></input>
            <input name="redirect" type="hidden" value="pregunta-1-2"></input>
            <input name="submit" type="submit" value="¡Cosas Importantes!"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="1 de-todo"></input>
            <input name="redirect" type="hidden" value="pregunta-1-1"></input>
            <input name="submit" type="submit" value="¡Muchas Cosas!"></input>
        </form>
            
        
    </body>
</html>
