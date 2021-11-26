/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarryPotter;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcgol
 */
public class Encantamiento extends Experimentos{
    private int cantidadPersonas;
    private double duracion;
    private String instrumento;

    public Encantamiento() {
    }

    public Encantamiento(int cantidadPersonas, double duracion, String instrumento) {
        this.cantidadPersonas = cantidadPersonas;
        this.duracion = duracion;
        this.instrumento = instrumento;
    }

    public Encantamiento(int cantidadPersonas, double duracion, String instrumento, String nombre, int calificacion, Date fechacreacion, ArrayList<Materiales> lista, int Clase) {
        super(nombre, calificacion, fechacreacion, lista, Clase);
        this.cantidadPersonas = cantidadPersonas;
        this.duracion = duracion;
        this.instrumento = instrumento;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return "Encantamiento{" + "cantidadPersonas=" + cantidadPersonas + ", duracion=" + duracion + ", instrumento=" + instrumento + '}';
    }
    
    public boolean avanzado (){
        return cantidadPersonas>50;
    }
    
    
}
