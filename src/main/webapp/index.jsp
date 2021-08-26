<%-- 
    Document   : index
    Created on : 24 ago. 2021, 22:57:22
    Author     : hiros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Principal</title>
    </head>
    <body>
        <h1>Cuestionario de producto</h1>
        <p>¿Quieres saber lo que ofrecemos?</p>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="iniciar-pregunta"></input>
            <input name="redirect" type="hidden" value="pregunta-0"></input>
            <input name="submit" type="submit" value="¡Iniciemos!"></input>            
        </form >
    </body>
</html>
