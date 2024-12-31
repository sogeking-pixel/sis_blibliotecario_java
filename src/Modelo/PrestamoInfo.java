/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author yerso
 */
public class PrestamoInfo {
    private String socioNombre;
    private String socioCodigo;
    private String codigoArticulo;
    private String nombreArticulo;

    public PrestamoInfo(String socioNombre, String socioCodigo, String codigoArticulo, String nombreArticulo) {
        this.socioNombre = socioNombre;
        this.socioCodigo = socioCodigo;
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
    }

    public PrestamoInfo() {
    }

    public String getSocioNombre() {
        return socioNombre;
    }

    public void setSocioNombre(String socioNombre) {
        this.socioNombre = socioNombre;
    }

    public String getSocioCodigo() {
        return socioCodigo;
    }

    public void setSocioCodigo(String socioCodigo) {
        this.socioCodigo = socioCodigo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
    
     
}
