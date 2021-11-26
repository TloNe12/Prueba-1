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
public class Tanques {

    private int capacidad, peso, cantidad;

    public Tanques() {

    }

    public Tanques(int capacidad, int peso, int cantidad) {

        this.capacidad = capacidad;

        this.peso = peso;

        this.cantidad = cantidad;

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 500) {
            this.capacidad = capacidad;
        }
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
        if (cantidad <= 4) {
            this.cantidad = cantidad;
        }
    }

    @Override
    public String toString() {
        return "Tanques{" + "capacidad=" + capacidad + ", peso=" + peso + ", cantidad=" + cantidad + '}';
    }

}
