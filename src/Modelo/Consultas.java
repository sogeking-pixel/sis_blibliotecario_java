
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Consultas extends Conexion{
    
    //metodo para registrar socio
    public boolean registrarSocio(Socio p) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sqlSocio = "INSERT INTO Socio (nombre, apellidos, codigo, dni, direccion) VALUES(?,?,?,?,?)";
        String sqlTelefono = "INSERT INTO Telefono (numero_telefono, socio_id) VALUES(?,?)";

        try {

            ps = con.prepareStatement(sqlSocio, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getApellidos());
            ps.setString(3, p.getCodigo());
            ps.setString(4, p.getDni());
            ps.setString(5, p.getDireccion());
            ps.executeUpdate();


            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int socioId = rs.getInt(1);


                ps = con.prepareStatement(sqlTelefono);                
                ps.setString(1, p.getTelefono());
                ps.setInt(2, socioId);
                ps.executeUpdate();
               
            }

            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
        
    //metodo para registrar Autor
    public boolean registrarAutor(Autor p) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sqlAutor = "INSERT INTO Autor (nombre, pais) VALUES(?,?)";
       

        try {

            ps = con.prepareStatement(sqlAutor, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getPais());
            ps.execute();
            

            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
        
    //metodo para buscar al socio
    public int buscarSocio(String codigo,Socio c){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int id;        
        String sql = "SELECT * FROM socio WHERE codigo=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,codigo);
            rs = ps.executeQuery();
            
            if(rs.next()){
                c.setDni(rs.getString("dni"));
                c.setNombres(rs.getString("nombre"));
                c.setApellidos(rs.getString("apellidos"));
                c.setDireccion(rs.getString("direccion"));
               
                
                id = rs.getInt("id");
                
                return id;
            }
            return -1;
            
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    
    public boolean buscarPrestamo(int id, PrestamoInfo c) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT p.id AS prestamo_id, a.codigo_interno AS CodigoArticulo, b.nombre AS NombreArticulo, " +
                     "s.codigo AS SocioCodigo, s.nombre AS SocioNombre " +
                     "FROM prestamo p " +
                     "JOIN socio s ON p.socio_id = s.id " +
                     "JOIN copia_articulo a ON p.copia_articulo_id = a.id " +
                     "JOIN articulo b ON a.articulo_id = b.id " +
                     "WHERE p.id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                c.setCodigoArticulo(rs.getString("CodigoArticulo"));
                c.setNombreArticulo(rs.getString("NombreArticulo"));
                c.setSocioCodigo(rs.getString("SocioCodigo"));
                c.setSocioNombre(rs.getString("SocioNombre"));                

                return true;
            }
            return false;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    

    //metodo para obtener id al CopiaArticulo
    public int obtenerIdCopia(String codigo){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int id;        
        String sql = "SELECT * FROM copia_articulo WHERE codigo_interno=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,codigo);
            rs = ps.executeQuery();
            
            if(rs.next()){                
                
                id = rs.getInt("id");
                
                return id;
            }
            return -1;
            
        } catch (SQLException e) {
            System.err.println(e);
            return -1;
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
      //metodo para obtener id Autor
    public int obtenerIdAutor(String nombre){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int id;        
        String sql = "SELECT * FROM autor WHERE nombre=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            rs = ps.executeQuery();
            
            if(rs.next()){                
                
                id = rs.getInt("id");
                
                return id;
            }
            return 0;
            
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    //metodo para obtener id articulo
    public int obtenerIdArticulo(String nombre){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        int id;        
        String sql = "SELECT * FROM articulo WHERE nombre=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            rs = ps.executeQuery();
            
            if(rs.next()){                
                
                id = rs.getInt("id");
                
                return id;
            }
            return 0;
            
        } catch (SQLException e) {
            System.err.println(e);
            return 0;
        } finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    /*reporte Socios*/
    public DefaultTableModel reporteSocios(){
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = null;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
            CallableStatement procedimiento = con.prepareCall("{call listarSocio}");
            rs = procedimiento.executeQuery();
            
            java.sql.ResultSetMetaData rsMd = (java.sql.ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();            
            
            modelo.addColumn("ID");            
            modelo.addColumn("DNI");
            modelo.addColumn("Codigo");            
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Telefonos");
            modelo.addColumn("Cant. Prestamos");           

            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    
    
    /*reporte Autores*/
    public DefaultTableModel reporteAutores(){
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = null;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
            CallableStatement procedimiento = con.prepareCall("{call listarAutor}");
            rs = procedimiento.executeQuery();
            
            java.sql.ResultSetMetaData rsMd = (java.sql.ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();            
            
            modelo.addColumn("ID");            
            modelo.addColumn("Nombre");
            modelo.addColumn("Pais"); 
            modelo.addColumn("Cant. Articulos");           

            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);                    
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
    
    /*reporte Articulo*/
    public DefaultTableModel reporteArticulos(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = null;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
            CallableStatement procedimiento = con.prepareCall("{call listar_Articulo}");
            rs = procedimiento.executeQuery();
            
            java.sql.ResultSetMetaData rsMd = (java.sql.ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            System.out.println("Cantidad de registros: "+cantidadColumnas);
            
            modelo.addColumn("ID");           
            modelo.addColumn("NOMBRE");
            modelo.addColumn("Fecha Creacion");
            modelo.addColumn("Autor");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Pretamos Realizados");            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    

    /*reporte Copia*/
    public DefaultTableModel reporteCopias(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = null;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
            CallableStatement procedimiento = con.prepareCall("{call listar_Copias}");
            rs = procedimiento.executeQuery();
            
            java.sql.ResultSetMetaData rsMd = (java.sql.ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            System.out.println("Cantidad de registros: "+cantidadColumnas);
            
            modelo.addColumn("ID");           
            modelo.addColumn("codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("estado");            
            modelo.addColumn("Pretamos Realizados");            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
     public DefaultTableModel reportePrestamos(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = null;
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
            CallableStatement procedimiento = con.prepareCall("{call listar_Prestamos}");
            rs = procedimiento.executeQuery();
            
            java.sql.ResultSetMetaData rsMd = (java.sql.ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            System.out.println("Cantidad de registros: "+cantidadColumnas);
            
            modelo.addColumn("ID");           
            modelo.addColumn("Socio cod");
            modelo.addColumn("Socio Name");
            modelo.addColumn("Articulo cod");
            modelo.addColumn("Articulo name");
            modelo.addColumn("Creacion");                                

            modelo.addColumn("Tope");            
            modelo.addColumn("devolucion");            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    
   private int crearArticulo(String nombre, String resumen, int idAutor, String fecha) {
    try {
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        String sql = "INSERT INTO articulo (nombre, resumen, fecha_creacion, autor_id) VALUES(?,?,?,?)"; 
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, nombre);
        ps.setString(2, resumen);
        ps.setString(3, fecha);
        ps.setInt(4, idAutor);  
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        } else {
            return -1; // No se generó ninguna clave
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Imprime el error para depuración
        return -1;
    } 
}

    
    
    /*crear Libro*/
    public Boolean crearLibro(String nombre,String resumen, int idAutor, int numero_pagina, String fecha){
        try {
            
            int resultado = crearArticulo(nombre,resumen,idAutor, fecha);
            System.out.println(resultado);
            if(resultado == -1){
                return false;
            }
            
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
            PreparedStatement ps ;                        
            
            String sql = "INSERT INTO libro (numero_pagina, articulo_id) VALUES(?,?)"; 
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, numero_pagina);
            ps.setInt(2, resultado); 
            ps.execute();
                     
            return true;            
            
        } catch (SQLException e) {            
            return false;
        }
    }
    
    
    /*crear CDS*/
    public Boolean crearCDS(String nombre,String resumen, int idAutor, int numero_musica, String fecha){
        try {
            
            int resultado = crearArticulo(nombre,resumen,idAutor, fecha);
            
            if(resultado == -1){
                return false;
            }
            
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
            PreparedStatement ps ;                        
            
            String sql = "INSERT INTO cds (numero_musica, articulo_id) VALUES(?,?)"; 
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, numero_musica);
            ps.setInt(2, resultado); 
            ps.execute();
                     
            return true;            
            
        } catch (SQLException e) {            
            return false;
        }
    }
    
    
    
    /*crear copiasArticulos*/
    public Boolean crearCopiaArticulo(String codigo_interno,String estado, int idArticulo){
        try {
            
            
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
            PreparedStatement ps ;                        
            
            String sql = "INSERT INTO copia_articulo (articulo_id, codigo_interno,estado) VALUES(?,?,?)"; 
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idArticulo);
            ps.setString(2, codigo_interno);
            ps.setString(3, estado); 

            ps.execute();
                     
            return true;            
            
        } catch (SQLException e) {            
            return false;
        }
    }
    
    
    
    /*crear Peliculas*/
    public Boolean crearPelicula(String nombre,String resumen, int idAutor, String duracion, String fecha){
        try {
            
            int resultado = crearArticulo(nombre,resumen,idAutor, fecha);
            
            if(resultado == -1){
                return false;
            }
            
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
            PreparedStatement ps ;                        
            
            String sql = "INSERT INTO pelicula (duracion, articulo_id) VALUES(?,?)"; 
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, duracion);
            ps.setInt(2, resultado); 
            ps.execute();
                     
            return true;            
            
        } catch (SQLException e) {            
            return false;
        }
    }
    
    
    
    /*crear Prestamo*/
    public Boolean crearPrestamo(int socio_id, int copia_articulo_id, int num_dias) {
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
            
            CallableStatement procedimiento = con.prepareCall("{call crearPrestamo(?, ?, ?)}");
            procedimiento.setInt(1, socio_id);
            procedimiento.setInt(2, copia_articulo_id);
            procedimiento.setInt(3, num_dias);
           
            procedimiento.execute();
           
            procedimiento.close();
            con.close();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    
    // devolver prestamo 
    public Boolean devolverPrestamo(int prestamo_id) {
        try {
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();

            
            CallableStatement procedimiento = con.prepareCall("{call devolverPrestamo(?)}");
            procedimiento.setInt(1, prestamo_id); 
            procedimiento.execute();
            procedimiento.close();
            con.close();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    
   
    
    

}
