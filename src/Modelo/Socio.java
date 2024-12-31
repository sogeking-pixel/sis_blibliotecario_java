
package Modelo;


public class Socio{
    
    private String nombres;
    private String apellidos;
    private String codigo;
    private String dni;
    private String direccion;
    private String telefono;
    private int id;

    public Socio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
 
 

    public Socio(String nombres, String apellidos, String codigo, String dni, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    
   
    
}
