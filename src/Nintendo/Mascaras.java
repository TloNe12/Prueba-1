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
public class Mascaras extends Items{
    private double tamanio,peso;
    private String nombre,transformacion;

    public Mascaras() {
    }

    public Mascaras(double tamanio, double peso, String nombre, String transformacion, int codigo, int espacio) {
        super(codigo, espacio);
        this.tamanio = tamanio;
        this.peso = peso;
        this.nombre = nombre;
        this.transformacion = transformacion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(String transformacion) {
        this.transformacion = transformacion;
    }

    @Override
    public String toString() {
        return super.toString()+"Mascaras{" + "tamanio=" + tamanio + ", peso=" + peso + ", nombre=" + nombre + ", transformacion=" + transformacion + '}';
    }
    
    
    
    
    
}
