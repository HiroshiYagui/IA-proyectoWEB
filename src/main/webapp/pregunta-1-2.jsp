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
        <h1>¿Estos suelen ser documentos,llaves o dinero?</h1>
        <form action="<%= request.getContextPath()%>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="2 documentos"></input>
            <input name="redirect" type="hidden" value="pregunta-2-3"></input>
            <input name="submit" type="submit" value="Documentos"></input>
        </form >
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="2 dinero"></input>
            <input name="redirect" type="hidden" value="pregunta-2-4"></input>
            <input name="submit" type="submit" value="Dinero"></input>
        </form>
        <br>
        <form action="<%= request.getContextPath() %>/GestorHechoServlet" method="GET">
            <input name="fact" type="hidden" value="2 llaves"></input>
            <input name="redirect" type="hidden" value="pregunta-2-5"></input>
            <input name="submit" type="submit" value="Llaves"></input>
        </form>
            
        
    </body>
</html>
