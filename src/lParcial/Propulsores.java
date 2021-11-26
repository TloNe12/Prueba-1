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
public class Propulsores {
    private int peso,cantidad;
    
    public Propulsores(){
        
    }

    public Propulsores(int peso, int cantidad) {
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad<=8){
        this.cantidad = cantidad;}
    }
    
    
    
    
    
    
    
}
