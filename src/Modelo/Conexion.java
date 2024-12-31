package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
        
    private final String url = "jdbc:mysql://localhost:3306/" + "biblioteca";
    private Connection con = null;
    private final String user = "root";
    private final String password = "123456";
    
    public Connection getConexion(){//metodo que realiza la conexion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//es un nombre de espacio que trae el conector se carga el driver
            con =(Connection) DriverManager.getConnection(this.url,this.user,this.password);//se realiza la conexion 
            
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
