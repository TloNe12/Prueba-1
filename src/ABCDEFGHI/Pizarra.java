/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

import java.awt.Color;
import java.util.Date;
/**
 *
 * @author jcgol
 */
public class Pizarra {
    
     
    private int largo;
    private int ancho;
    private Color color;
    private Date fecha;
    private String textura;

    public Pizarra(int largo, int ancho) {
        this.setLargo(largo);
        this.setAncho(ancho);
        
    }

    public Pizarra(int largo, int ancho, Color color, Date fecha, String textura) {
        this.setLargo(largo);
        this.setAncho(ancho);
        this.color = color;
        this.fecha = fecha;
        this.textura = textura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if(largo>0 && largo <=10){
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho>0 && ancho<=3){
        this.ancho = ancho;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return "largo=" + largo + ", ancho=" + ancho;
    }
    
   
}
