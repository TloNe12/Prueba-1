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
public class Motores {

    private int cantidad, peso, tamanio;

    public Motores() {

    }

    public Motores(int cantidad, int peso, int tamanio) {
        this.cantidad = cantidad;
        this.peso = peso;
        this.tamanio = tamanio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 6) {
            this.cantidad = cantidad;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Motores{" + "cantidad=" + cantidad + ", peso=" + peso + ", tamanio=" + tamanio + '}';
    }

}
