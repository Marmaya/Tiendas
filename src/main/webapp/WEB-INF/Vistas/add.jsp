<%-- Ingresar producto
--%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Productos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo_DAO.ProductosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Ingresar Producto</h1>
            <form action="Control">
                Nombre:<br>
                <input type="text" name="txtNombre"><br>
                Categoria:<br>
                <input type="text" name="txtCategoria"><br>
                <input type="submit" name="action" value="Ingresar"><br>
            </form>
        </div>
    </body>
</html>
