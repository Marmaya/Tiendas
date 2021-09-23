/* Metodos del sistema*/
package Interfaces;

import java.util.List;
import Modelo.Productos;

public interface CRUD {
    public List list();
    public Productos list(int id);
    public boolean add(Productos p);
    public boolean edit(Productos p);
    public boolean eliminar(int id);
    
}
