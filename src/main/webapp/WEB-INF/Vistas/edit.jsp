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
            <%
                ProductosDAO    dao=new ProductosDAO();
                int id=Integer.parseInt((String)request.getAttribute("idp"));
                Productos p=(Productos)dao.list(id);
            %>
            <h1>Modificar Producto</h1>
            <form action="Control">
                Nombre:<br>
                <input type="text" name="txtNombre" value="<%p.getNombre()%>"><br>
                Categoria:<br>
                <input type="text" name="txtCategoria" value="<%p.getCategoria()%>"><br>
                <input type="hidden" name="txtid" value="<%p.getId()%>">
                <input type="submit" name="action" value="Actualizar"><br>
            </form>
        </div>
    </body>
</html>

        <h1>Hello World!</h1>
    </body>
</html>
