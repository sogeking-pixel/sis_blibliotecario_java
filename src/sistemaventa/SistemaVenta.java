/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventa;

import Controlador.Ccontrolador;

import Modelo.Consultas;
import Modelo.Socio;
import Vista.AgregarSocios;
import Vista.AgregarArticulo;
import Vista.Sistema;
import Vista.panel_Socios;
import Vista.panel_historial_prestamos;
import Vista.panel_Articulos;
import Vista.panel_Autores;
import Vista.panel_roles;
import Vista.panel_prestamos;

/**
 *
 * @author USUARIO
 */
public class SistemaVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Sistema lg = new Sistema();
        panel_Socios c = new panel_Socios();
        panel_Articulos articulos = new panel_Articulos();
        panel_prestamos prestamos = new panel_prestamos();
        panel_roles roles = new panel_roles();
        panel_historial_prestamos h_prestamos=new panel_historial_prestamos();
        Socio socio = new Socio();
        
        Consultas consultas = new Consultas();       
        panel_Autores p_autores = new panel_Autores();
        AgregarSocios ventanaSocios = new AgregarSocios();
        AgregarArticulo ventanaArticulo = new AgregarArticulo();
        
        lg.setVisible(true);
        
        Ccontrolador controlador = new Ccontrolador(
                lg,
                c,
                articulos,
                prestamos, 
                roles,
                h_prestamos, 
                consultas,
                socio,
                p_autores,
                ventanaSocios,
                ventanaArticulo);
        
        controlador.iniciar();
        
    }
    
}
