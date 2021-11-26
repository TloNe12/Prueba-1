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
public class Armamento {
    private String codigo;
    private String nombre;
    private double capacidad;
    private int municion;

    public Armamento() {
    }

    public Armamento(String codigo, String nombre, double capacidad, int municion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.municion = municion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    @Override
    public String toString() {
        return "Armamento{" + "codigo=" + codigo + ", nombre=" + nombre + ", capacidad=" + capacidad + ", municion=" + municion + '}';
    }
    
    
    
    
    
}
