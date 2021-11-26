/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2021027;
import java.awt.Color;
import java.util.Date;
/**
 *
 * @author jcgol
 */
public class Fecha extends Date{
    private Color color;
    public Fecha(Color color, int i, int i1, int i2){
        super(i,i1,i2);
        this.color=color;
    }
    
    public Fecha(){
        super();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"Fecha{" + "color=" + color + '}';
    }
    
    //toda super clase puede ser instanciada a una sub clase
    
    
    
    
}
