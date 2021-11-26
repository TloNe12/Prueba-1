/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

/**
 *
 * @author jcgol
 */
public class Armas extends CArmas{
    private String nombre;
    private int municion;

    public Armas() {
    }

    public Armas(String nombre, int municion, int cantidad, double peso, String material, int codigo, int espacio) {
        super(cantidad, peso, material, codigo, espacio);
        this.nombre = nombre;
        this.municion = municion;
    }

   

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    @Override
    public String toString() {
        return super.toString()+"Armas{" + "nombre=" + nombre + ", municion=" + municion + '}';
    }
    
    
    
    
    
}
