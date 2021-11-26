/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;
import java.util.Date;
import java.awt.Color;
public class Vehiculo {
    private String serie, marca, modelo; 
    private Color color;
    private Date fecha_creacion;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String serie, String marca, String modelo, Color color, Date fecha_creacion) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        color = color;
        fecha_creacion = fecha_creacion;
    }
    
    public void setSerie(String serie){
        this.serie = serie;
    }
    
    public String getSerie(){
        return serie;
    }
    
     public void setModelo(String modelo){
        this.modelo = modelo;
    }
     
    public String getModelo(){
        return modelo;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
     public void setColor(Color color){
        this.color = color;
    }
     
    public Color getColor(){
        return color;
    }
    public void setFecha(Date fecha){
        this.fecha_creacion = fecha;
    }
    
    public Date getFecha(){
        return fecha_creacion;
    }
 
    @Override
    public String toString(){
        return serie+ " " +marca +"-" +modelo;
    }
    
}
