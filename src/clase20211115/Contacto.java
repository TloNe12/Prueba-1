/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20211115;

/**
 *
 * @author jcgol
 */
public class Contacto {
    private String nombre;
    private int telefeno;
    private String direccion;

    public Contacto() {
    }

    public Contacto(String nombre, int telefeno, String direccion) {
        this.nombre = nombre;
        this.telefeno = telefeno;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(int telefeno) {
        this.telefeno = telefeno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" 
                + "nombre=" + nombre +
                ", telefeno=" + telefeno + 
                ", direccion=" + direccion +
                '}';
    }
    
    
    
}
