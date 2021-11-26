/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author jcgol
 */
public class CRupees extends Contenedores {

    private int capacidad;
    private ArrayList<Rupees> total = new ArrayList();

    public CRupees() {
    }

    public CRupees(double peso, String material, int codigo, int espacio) {
        super(peso, material, codigo, espacio);
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Rupees> getTotal() {
        return total;
    }

    public void setTotal(ArrayList<Rupees> total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return super.toString() + "Rupees{" + "capacidad=" + capacidad + ", total=" + total + '}';
    }

}
