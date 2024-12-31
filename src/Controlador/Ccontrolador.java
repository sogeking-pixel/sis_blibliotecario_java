
package Controlador;

import Modelo.Autor;
import Modelo.Socio;
import Modelo.Consultas;
import Vista.Sistema;
import Vista.panel_Socios;
import Vista.panel_historial_prestamos;
import Vista.panel_Articulos;
import Vista.panel_Autores;
import Vista.panel_roles;
import Vista.panel_prestamos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.Conexion;
import Modelo.PrestamoInfo;
import Vista.AgregarSocios;
import Vista.AgregarArticulo;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.awt.Color;
import java.sql.SQLException;


public class Ccontrolador implements ActionListener{
    Sistema s;
    panel_Socios c;
    panel_Articulos articulos;
    panel_prestamos prestamos;
    panel_roles roles;
    panel_Autores p_autor;
    Socio socios;
    Consultas consultas;
    AgregarSocios ventanaSocios;
    AgregarArticulo ventanaArticulos;
    
    boolean bandera1 = false;
    boolean bandera2 = false;
    boolean bandera3 = false;
    int idSocio = 0;
    int idCopia = 0;
    int idPrestamox = 0;
    
    DefaultTableModel modelo = null;
    float color[];
    
    
    public Ccontrolador(
            Sistema s, 
            panel_Socios c,
            panel_Articulos articulos,
            panel_prestamos prestamos,            
            panel_roles roles, 
            panel_historial_prestamos h_prestamos,
            Consultas cProd,
            Socio clientes,
            panel_Autores p_autores,
            AgregarSocios ventanaSocios,
            AgregarArticulo ventanaProductos
    ){
        
        this.s=s;
        this.c=c;
        this.articulos=articulos;
        this.prestamos=prestamos;
        
        this.roles=roles;
        this.consultas = cProd;
        this.socios = clientes;        
        this.p_autor = p_autores;
        this.ventanaSocios = ventanaSocios;
        this.ventanaArticulos = ventanaProductos;
        
        
        this.s.btnSocio.addActionListener(this);
        this.s.btnArticulo.addActionListener(this);        
        this.s.btnClose.addActionListener(this);
        this.s.btnNuevoPrestamo.addActionListener(this);        
        this.s.btnAutor.addActionListener(this);
        
     
        //manejo de eventos clienres
        this.c.btnGuardarSocio.addActionListener(this);
        this.c.txtbuscarCliente.addActionListener(this);
        this.c.btnReporteGeneralCliente.addActionListener(this);
        
        this.p_autor.btnregistrarAutor.addActionListener(this);
        
       
        this.roles.txtbuscarVendedor.addActionListener(this);
        this.roles.btnReporteGeneralVendedor.addActionListener(this);
        
        this.s.tabla_panel.add(c);//Socio
        this.s.tabla_panel.add(articulos);   
        this.s.tabla_panel.add(prestamos);
        this.s.tabla_panel.add(roles);
        this.s.tabla_panel.add(h_prestamos);
        this.s.tabla_panel.add(p_autores);
        
        this.articulos.btnregistrarArticulo.addActionListener(this);
        this.articulos.btnregistrarCopia.addActionListener(this);

        
        this.prestamos.btnBuscarSocio.addActionListener(this);
        this.prestamos.btnBucarArticulo.addActionListener(this);
        this.prestamos.btnBuscarPrestamo.addActionListener(this);
        this.prestamos.btnRegistrarDevolucion.addActionListener(this);
        this.prestamos.btnregistrarPrestamo.addActionListener(this);        
        
        this.ventanaSocios.btnAgregarCliente.addActionListener(this);
        this.ventanaArticulos.btnAgregarProductos.addActionListener(this);
        
       
    }
    
    public void cargarComboAutor(){
        try 
        {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
             
            String sql = "SELECT nombre from autor";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            System.out.println("Cantidad de registros: "+cantidadColumnas);
            
            articulos.comboAutor.addItem("Selecciona Autor");
            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                    articulos.comboAutor.addItem(filas[i]);
                }
            }
        } 
        catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    
     public void cargarComboArticulo(){
        try 
        {
            PreparedStatement ps;
            ResultSet rs;
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
             
            String sql = "SELECT nombre from articulo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            System.out.println("Cantidad de registros: "+cantidadColumnas);
            
            articulos.comboArticulos.addItem("Selecciona articulo");
            
            while(rs.next()){//recorriendo los resultados.
                Object filas[] = new Object[cantidadColumnas];
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                    articulos.comboArticulos.addItem(filas[i]);
                }
            }
        } 
        catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    
    public void iniciar(){
        cargarComboAutor();
        cargarComboArticulo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Color  colorDefault = new Color(55,71,79);
        Color  colorSeleccion = new Color(255,140,0);

        //ABRE PANEL PARA LOS Socios
        if(e.getSource() == s.btnSocio){            
            s.tabla_panel.setSelectedIndex(0);
            c.TablaCliente.setModel(consultas.reporteSocios());           
            
            
            s.btnSocio.setBackground(colorSeleccion);
            s.btnArticulo.setBackground(colorDefault); 
            s.btnNuevoPrestamo.setBackground(colorDefault);
            s.btnAutor.setBackground(colorDefault);
            
        }
        /**************/
        
        //Registrar Un socio
        if(e.getSource()==c.btnGuardarSocio){
            String dni = c.txtDniSocio.getText();
            String nombre = c.txtNombreSocio.getText();
            String apellidos = c.txtApellidoSocio.getText();
            String direccion = c.txtDirecionSocio.getText();
            String telefono = c.txtTelefonoSocio.getText();
            String codigo = c.txtCodigoSocio.getText();
            
            Socio socio = new Socio(nombre, apellidos, codigo, dni, direccion, telefono);            
            
            if(consultas.registrarSocio(socio)){
                limpiarDatosClientes();
                JOptionPane.showMessageDialog(null, "Se registro correctamente el usaurio " + socio.getNombres());
                c.TablaCliente.setModel(consultas.reporteSocios());
            }
        }
        
        
        if(e.getSource()==c.btnReporteGeneralCliente){
            c.TablaCliente.setModel(consultas.reporteSocios());
            c.txtbuscarCliente.setText("");
        }
        
        
        
        
        //ABRE PANEL PARA LOS Autores
        if(e.getSource() == s.btnAutor){            
            s.tabla_panel.setSelectedIndex(5);
            p_autor.tablaAutores.setModel(consultas.reporteAutores());          
            
            
            s.btnSocio.setBackground(colorDefault);
            s.btnArticulo.setBackground(colorDefault); 
            s.btnNuevoPrestamo.setBackground(colorDefault);
            s.btnAutor.setBackground(colorSeleccion);
            
        }
        /**************/
        
        //Registrar Un autor
        if(e.getSource()== p_autor.btnregistrarAutor){
           
            String nombre = p_autor.txtAutorNombre.getText();
            String pais = p_autor.txtPaisAutor.getText();
            
            Autor autor = new Autor(nombre, pais);                     
            
            if(consultas.registrarAutor(autor)){
                limpiarDatosClientes();
                JOptionPane.showMessageDialog(null, "Se registro correctamente el Autor " + autor.getNombre());
                p_autor.tablaAutores.setModel(consultas.reporteAutores());
                cargarComboAutor();
            }
        }
        
        
        //ABRE PANEL PARA LOS ARTICULOS
        if(e.getSource() == s.btnArticulo){
            System.out.println("Articulos");
            s.tabla_panel.setSelectedIndex(1);
            articulos.TablaProductos.setModel(consultas.reporteArticulos());
            articulos.TablaProductos1.setModel(consultas.reporteCopias());

            
            s.btnArticulo.setBackground(colorSeleccion);
            s.btnSocio.setBackground(colorDefault); 
            s.btnNuevoPrestamo.setBackground(colorDefault);
            s.btnAutor.setBackground(colorDefault);           
           
        }
        
        
        
        //Registrar Un articulo
        if(e.getSource()== articulos.btnregistrarArticulo){
            String name = articulos.txtNombreArticulo.getText();
            String nameAutor = (String) articulos.comboAutor.getSelectedItem();
            int id_autor = consultas.obtenerIdAutor(nameAutor);
            String fecha = articulos.txtFechaArticulo.getText();
            String cantidad = articulos.txtCantidadArticulo.getText();
            String resumen = articulos.jTextAreaResumen.getText();
            boolean b = false;
            String selectedItem = (String) articulos.comboTipo.getSelectedItem();
            switch (selectedItem) {
                case "Pelicula":
                    b = consultas.crearPelicula(name, resumen, id_autor, cantidad, fecha);
                    break;
                case "Libro":
                    b = consultas.crearLibro(name, resumen, id_autor, Integer.parseInt(cantidad), fecha);
                    break;                
                case "Cds":
                    b = consultas.crearCDS(name, resumen, id_autor, Integer.parseInt(cantidad), fecha);
                    break;
                default:
                    throw new AssertionError();
            }
            
            if(b){
                 limpiarDatosArticulo();
                 JOptionPane.showMessageDialog(null, "Se registro correctamente el articulo " + name);
                 articulos.TablaProductos.setModel(consultas.reporteArticulos());
                 cargarComboArticulo();
            }
           
            
        }
        
        
        
        //Registrar una copia
        if(e.getSource()== articulos.btnregistrarCopia){
            System.out.println("hola");
            String codigo = articulos.txtCodigoCopia.getText();
            String nameArticulo = (String) articulos.comboArticulos.getSelectedItem();
            System.out.println(nameArticulo);
            int id_articulo = consultas.obtenerIdArticulo(nameArticulo);
            String estado = (String) articulos.comboEstadoCopia.getSelectedItem();        
            
            System.out.println(id_articulo);
            if(consultas.crearCopiaArticulo(codigo, estado, id_articulo)){
                 limpiarDatosCopia();
                 JOptionPane.showMessageDialog(null, "Se registro correctamente el articulo " + codigo);
                 articulos.TablaProductos.setModel(consultas.reporteArticulos());
                 articulos.TablaProductos1.setModel(consultas.reporteCopias());
            }
           
            
        }
        
        
        
        //ABRE PANEL PARA prestamos
        if(e.getSource() == s.btnNuevoPrestamo){
            System.out.println("Prestamos");
            s.tabla_panel.setSelectedIndex(2);
            prestamos.TablaProductos.setModel(consultas.reportePrestamos());            
            s.btnArticulo.setBackground(colorDefault);
            s.btnSocio.setBackground(colorDefault); 
            s.btnNuevoPrestamo.setBackground(colorSeleccion);
            s.btnAutor.setBackground(colorDefault);          
           
        }
        

        
        // Prestamo Registrar
        if(e.getSource() == prestamos.btnBuscarSocio){
            
            String codigoSocio = prestamos.txtSocioCodigo.getText();
           
            Socio socio = new Socio();
            int id = consultas.buscarSocio(codigoSocio, socio);
            if( id != -1){
                JOptionPane.showMessageDialog(null, "Se encontro a " + socio.getNombres());
                prestamos.txtSocioNombre.setText(socio.getNombres());
                prestamos.txtSocioDni.setText(socio.getDni());
                prestamos.txtSocioApellidos.setText(socio.getApellidos());
                bandera1 = true;
                this.idSocio = id;
            }
            else{
                JOptionPane.showMessageDialog(null, "Porfavor registrar a socio");
            }
            
        }
        
        if(e.getSource() == prestamos.btnBucarArticulo){
            String codigoArticulo = prestamos.txtCodigoArticulo.getText();
           
            int id = consultas.obtenerIdCopia(codigoArticulo);
            if( id != -1){
                JOptionPane.showMessageDialog(null, "Se encontro");                
                bandera2 = true;
                this.idCopia = id;
            }else{ JOptionPane.showMessageDialog(null, "No existeencontro");       }                                 
            
        }        
        
        if(e.getSource() == prestamos.btnregistrarPrestamo ){
            
            if (bandera1 && bandera2){
                int dias =Integer.parseInt(prestamos.txtDiaPrestamo.getText());
                if(consultas.crearPrestamo(idSocio, idCopia, dias)){
                    JOptionPane.showMessageDialog(null, "Se creo correctamente el prestamo ");
                    prestamos.TablaProductos.setModel(consultas.reportePrestamos());
                    prestamos.txtDiaPrestamo.setText("");
                    prestamos.txtDevolucionCodigoArticulo.setText("");
                    prestamos.txtSocioCodigo.setText("");
                    prestamos.txtSocioNombre.setText("No se encontro");
                    prestamos.txtSocioDni.setText("No se encontro");
                    prestamos.txtSocioApellidos.setText("No se encontro");
                    bandera1 = false;
                    bandera2=false;
                }   
            }             
            
        }
        
        // Prestamo Devolucion
        if(e.getSource() == prestamos.btnBuscarPrestamo){
            
            int idPrestamo = Integer.parseInt(prestamos.txtIdPrestamo.getText()); 
           
            PrestamoInfo prestamo = new PrestamoInfo();
            
            if( consultas.buscarPrestamo(idPrestamo, prestamo)){
                JOptionPane.showMessageDialog(null, "Se encontro" );
                prestamos.txtDevolucionArticuloNombre.setText(prestamo.getNombreArticulo());
                prestamos.txtDevolucionCodigoArticulo.setText(prestamo.getCodigoArticulo());
                prestamos.txtDevolucionCodigoSocio.setText(prestamo.getSocioCodigo());
                prestamos.txtDevolucionSocioNombre.setText(prestamo.getSocioNombre());                
                bandera3 = true;
                idPrestamox = idPrestamo;
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encuentra");
            }
            
        }
        
        if(e.getSource() == prestamos.btnRegistrarDevolucion ){
            
            if (bandera3){
                
                if(consultas.devolverPrestamo(idPrestamox)){
                    JOptionPane.showMessageDialog(null, "Se devolvio correctamente ");
                    prestamos.TablaProductos.setModel(consultas.reportePrestamos());
                    prestamos.txtSocioCodigo.setText("");
                    
                    prestamos.txtDevolucionArticuloNombre.setText("No se encontro");
                    prestamos.txtDevolucionCodigoArticulo.setText("No se encontro");
                    prestamos.txtDevolucionCodigoSocio.setText("No se encontro");
                    prestamos.txtDevolucionSocioNombre.setText("No se encontro");

                    bandera3 = false;                    
                }   
            }             
            
        }
       
        
    }
    
    /*limpiar campos socios*/
    public void limpiarDatosClientes(){
        c.txtDniSocio.setText("");
        c.txtNombreSocio.setText("");
        c.txtApellidoSocio.setText("");
        c.txtDirecionSocio.setText("");
        c.txtTelefonoSocio.setText("");
        c.txtCodigoSocio.setText(""); 
    }    
    /**************************/
    
    /*limpiar campos vendedor*/
    public void  limpiarDatosVendedor(){
        roles.txtDniVendedor.setText("");
        roles.txtNombreVendedor.setText("");
        roles.txtApellidoVendedor.setText("");
        roles.txtDirecionVendedor.setText("");
        roles.txtTelefonoVendedor.setText("");
        roles.txtFechaVendedor.setText("");
    }
    /**************************/
    
    
    public void  limpiarDatosArticulo(){
        articulos.comboAutor.setSelectedIndex(0);
        articulos.comboTipo.setSelectedIndex(0);
        articulos.txtCantidadArticulo.setText("");
        articulos.txtFechaArticulo.setText("");
        articulos.txtNombreArticulo.setText("");
        articulos.jTextAreaResumen.setText("");
    }
    
    public void  limpiarDatosCopia(){
        articulos.comboArticulos.setSelectedIndex(0);
        articulos.comboEstadoCopia.setSelectedIndex(0);        
        articulos.txtCodigoCopia.setText("");
    }
    
    
   

}
