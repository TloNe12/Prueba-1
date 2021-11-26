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
public class Veloz extends Vehiculos {

    private double peso;
    private int serie;
    private int velocidadMAX;

    public Veloz() {

    }

    public Veloz(double peso, int serie, int codigo, String nombre, int velocidad, String tipo) {
        super(codigo, nombre, velocidad, tipo);
        this.peso = peso;
        this.serie = serie;
        if (velocidad > 750) {
            this.velocidadMAX = velocidad;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getVelocidadMAX() {
        return velocidadMAX;
    }

    public void setVelocidadMAX(int velocidadMAX) {
        this.velocidadMAX = velocidadMAX;
    }

    @Override
    public String toString() {
        return super.toString()+"Veloz{" + "peso=" + peso + ", serie=" + serie + ", velocidadMAX=" + velocidadMAX + '}';
    }

    
    
    
    
    
    
    
    
}
