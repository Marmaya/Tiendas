/* Logica*/
package Modelo_DAO;

import Interfaces.CRUD;
import Modelo.Productos;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import MiConexion.Conexion_DB;
import java.sql.SQLException;

public class ProductosDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatment ps;
    ResultSet rs;
    Productos p=new Productos();
    @Override
    public List list() {
        ArrayList<Productos>list=new ArrayList<>();
        String sql="select* from Productos";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Productos p=new Productos();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("Nombre"));
                p.setCategoria(rs.getString("Categoria"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setMarca(rs.getString("Marca"));
                p.setValorUnitarioCompra(rs.getDouble("ValorUnitarioCompra"));
                p.setValorUnitarioVenta(rs.getDouble("ValorUnitarioVenta"));
                list.add(p);
            }
           
        } catch(SQLException e){
        }
        return  list;
    }

    @Override
    public Productos list(int id) {
        String sql="select* from Productos where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("Nombre"));
                p.setCategoria(rs.getString("Categoria"));
                p.setDescripcion(rs.getString("Descripcion"));
                p.setMarca(rs.getString("Marca"));
                p.setValorUnitarioCompra(rs.getDouble("ValorUnitarioCompra"));
                p.setValorUnitarioVenta(rs.getDouble("ValorUnitarioVenta"));
              
            }
           
        } catch(Exception e){
        }
        return  list;
    }
        
  
    @Override
    public boolean add(Productos p) {
        String sql="insert into productos(Id,Nombre)values(('"+p.getId()+"','"+p.getNombre()+"')"; 
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps=executeUpdate();
        }   catch (Exception e)  {
        return false;
    }
    @Override
    public boolean edit(Productos p) {
        String sql="update productos set Nombre='"+p.getNombre()+"',Categorias='"+p.getCategorias()+"'where Id="+p.getId(); 
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) { 
        return  false;
    }       
    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
