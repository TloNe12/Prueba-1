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
public class Criatura extends Experimentos{
    private String name;
    private boolean tipo;
    private double estatura;
    private boolean hablar;
    private double peso;

    public Criatura() {
    }

    public Criatura(String name, boolean tipo, double estatura, boolean hablar, double peso) {
        this.name = name;
        this.tipo = tipo;
        this.estatura = estatura;
        this.hablar = hablar;
        this.peso = peso;
    }

    public Criatura(String name, boolean tipo, double estatura, boolean hablar, double peso, String nombre, int calificacion, Date fechacreacion, ArrayList<Materiales> lista, int Clase) {
        super(nombre, calificacion, fechacreacion, lista, Clase);
        this.name = name;
        this.tipo = tipo;
        this.estatura = estatura;
        this.hablar = hablar;
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public boolean isHablar() {
        return hablar;
    }

    public void setHablar(boolean hablar) {
        this.hablar = hablar;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Criatura{" + "name=" + name + ", tipo=" + tipo + ", estatura=" + estatura + ", hablar=" + hablar + ", peso=" + peso + '}';
    }
    
    public boolean avanzado (){
        return tipo;
    }
    
    
    
    
    
}
