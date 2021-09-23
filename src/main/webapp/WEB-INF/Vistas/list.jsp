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
            <h1>Productos</h1>
            <a href="Control?action=add">Ingresar Nuevo</a>
            <table border="1">
                 <thead>
                     <tr>
                        <th>ID</th> 
                        <th>NOMBRE</th> 
                        <th>CATEGORIA</th> 
                        <th>DESCRIPCION</th> 
                        <th>MARCA</th> 
                        <th>VALORUNITARIOVENTA</th> 
                        <th>VALORUNITARIOCOMPRA</th> 
                     </tr> 
                </thead>
                <%
                   ProductosDAO dao=new ProductosDAO();
                   List<Productos>list=dao.list();
                   Iterator<Productos>iter=list.iterator();
                   Productos p=null;
                   while(iter.hasNext()){
                       p=iter.next();
                %>
                <tbody>
                    <tr>
                        <td><%= p.getId()%></td> 
                        <td><%= p.getNombre()%></td>
                        <td><%= p.getCategoria()%></td> 
                        <td><%= p.getDescripcion()%></td> 
                        <td><%= p.getMarca()%></td> 
                        <td><%= p.getValorUnitarioVenta()%></td> 
                        <td><%= p.getValorUnitarioCompra()%></td> 
                        <td>
                            <a href="Control?action=editar&id=<%p.getId()%>">Editar</a>
                            <a>Remove</a>
                        </td>
                    </tr>   
                    <%}%>
                </tbody>
        </div>
    </body>
</html>
