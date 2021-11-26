/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

/**
 *
 * @author jcgol
 */
public class Contacto {
    private String marca,modelo;
    private double precio;
    private int existencia;

    public Contacto() {
    }

    public Contacto(String marca, String modelo, double precio, int existencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Contacto{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
    
    
    
    
}
