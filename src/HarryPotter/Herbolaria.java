/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarryPotter;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author jcgol
 */
public class Herbolaria extends Experimentos{

    private String name;
    private boolean venenosa;
    private Color color;
    private String contextura;

    public Herbolaria() {
    }

    public Herbolaria(String name, boolean venenosa, Color color, String contextura) {
        this.name = name;
        this.venenosa = venenosa;
        this.color = color;
        this.contextura = contextura;
    }

    public Herbolaria(String name, boolean venenosa, Color color, String contextura, String nombre, int calificacion, Date fechacreacion, ArrayList<Materiales> lista, int Clase) {
        super(nombre, calificacion, fechacreacion, lista, Clase);
        this.name = name;
        this.venenosa = venenosa;
        this.color = color;
        this.contextura = contextura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    @Override
    public String toString() {
        return "Herbolaria{" + "name=" + name + ", venenosa=" + venenosa + ", color=" + color + ", contextura=" + contextura + '}';
    }

    public boolean avanzado (){
        return venenosa;
    }
    
    
}
