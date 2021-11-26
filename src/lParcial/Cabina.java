/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lParcial;

/**
 *
 * @author jcgol
 */
public class Cabina {
    private int peso,capacidad,cantidad;
    
    public Cabina(){
        
    }

    public Cabina(int peso, int capacidad) {
        this.peso = peso;
        this.capacidad = capacidad;
        this.cantidad = 1;
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }


    @Override
    public String toString() {
        return "Cabina{" + "peso=" + peso + ", capacidad=" + capacidad + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
}
