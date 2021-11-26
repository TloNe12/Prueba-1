/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TonyStark;

/**
 *
 * @author jcgol
 */
public class Vehiculos {
    private int codigo;
    private String nombre;
    private int velocidad;
    private String tipo;

    public Vehiculos() {
    }

    public Vehiculos(int codigo, String nombre, int velocidad, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "codigo=" + codigo
                + ", nombre=" + nombre + ", velocidadMAX=" 
                + velocidad + ", tipo=" + tipo + '}';
    }
    
    
    
}
