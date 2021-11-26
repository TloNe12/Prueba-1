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
public class Masivo extends Vehiculos{
    private int capacidadMAX;
    private double velocidadMAX;
    private int operarios;

    public Masivo() {
    }

    public Masivo(int capacidadMAX, int operarios, int codigo, String nombre, int velocidad, String tipo) {
        super(codigo, nombre, velocidad, tipo);
        this.capacidadMAX = capacidadMAX;
        this.operarios = operarios;
        if(velocidad<200){
        this.velocidadMAX=velocidad;
         }
    }

    public int getCapacidadMAX() {
        return capacidadMAX;
    }

    public void setCapacidadMAX(int capacidadMAX) {
        this.capacidadMAX = capacidadMAX;
    }

    public double getVelocidadMAX() {
        return velocidadMAX;
    }

    public void setVelocidadMAX(double velocidadMAX) {
        this.velocidadMAX = velocidadMAX;
    }

    public int getOperarios() {
        return operarios;
    }

    public void setOperarios(int operarios) {
        this.operarios = operarios;
    }

    @Override
    public String toString() {
        return super.toString()+"Masivo{" + "capacidadMAX=" + capacidadMAX + ", velocidadMAX=" + velocidadMAX + ", operarios=" + operarios + '}';
    }
    
    
    
    
    
}
