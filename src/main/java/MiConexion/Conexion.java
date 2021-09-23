/*Instalar en las dependencias la libreria mysql.jdbc.Driver
productos seria el nombre de nuestra tabla de base de datods*/
package Conexion;

import java.sql.*;

public class Conexion{
    Connection con;
    String url="jdbc:mysql://localhost:3306/DBTiendas";
    String user="root";
    String password="contraseña"
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password)
        }   catch(Exeption e){
                System.err.println("Error"+e);
        }
        return con;
    }
}