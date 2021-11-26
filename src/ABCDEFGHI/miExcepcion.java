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
public class miExcepcion extends Exception {

    private Color color;
    private Date fecha;

    public miExcepcion(Date fecha, String string) {
        super(string);
        this.fecha = fecha;
    }

    public miExcepcion() {
    }

    public miExcepcion(Color color, String string) {
        super(string);
        this.color = color;
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

    @Override
    public String toString() {
        return "miExcepcion{" + "fecha=" + fecha + '}';
    }
    
    

}
