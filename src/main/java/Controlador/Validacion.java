package Controlador;

import Modelo.Tiendas;
import Modelo_DAO.TiendasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

publi class Validacion extends HttpServlet {
    
    TiendasDAO tdao=new TiendasDAO();
    Tiendas td=new Tiendas();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8")
    }

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        
 }
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar")){
            String user=request.getParameter("txtuser");
            String password=request.getParameter("txtpass");
            td=tdao.validacion(user,password);
            if(td.getUser!=null){
                request.getRequestDispatcher("Control?accion=Principal").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }           
        }
    else{
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}
    @Override
    public String getServletInfo(){
        return  "Short description";
    }//</editor-fold>
}