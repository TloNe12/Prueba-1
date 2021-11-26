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
public class Contenedores extends Items{
    private double peso;
    private String material;

    public Contenedores() {
    }

    public Contenedores(double peso, String material) {
        this.peso = peso;
        this.material = material;
    }

    public Contenedores(double peso, String material, int codigo, int espacio) {
        super(codigo, espacio);
        this.peso = peso;
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+"Contenedores{" + "peso=" + peso + ", material=" + material + '}';
    }
    
    
    
    
    
}
