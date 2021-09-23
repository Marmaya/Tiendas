package Controlador;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

publi class Control extends HttpServlet {
    String list="Vistas/list.jsp;";
    String add="Vistas/add.jsp";
    String edit="Vistas/edit,jsp ";
    Productos p= new Productos();
    ProductosDAO dao=new ProductosDAO();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
            String accion=request.getParameter("accion");
            switch (accion){
            case "Principal":           
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                break;
            default:
                throw new ASsertionError();
            }
            }
        }
 

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        String acceso="";
        String action=request.getParameter("action")
        if (action.equalsIgnoreCase("list")){
            acceso=list;
        }else if(action.equalsIgnoreCase)("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Ingresar")){
            String Nombre=request.getParameter("txtNombre");
            String Categoria=request.getParameter("txtCategoria");
            p.setNombre(Nombre);
            p.setCategoria(Categoria);
            dao.add(p)
            acceso=list;
        }
        else if(action.equalsIgnoreCase("Editar")){
            request.setAtribute("Idp",request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
            String Nombre=request.getParameter("txtNombre");
            String Categoria=request.getParameter("txtCategoria");
            p.setId(id);
            p.setNombre(Nombre);
            p.setCategoria(Categoria);
            dao.edit(p);
            acceso=list;
        }
        RequestDispatcher Vista=request.getRequestDispatcher(acceso);
        Vista.forward(request, response);
    }

 }
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        processRequest(request,response);
    }