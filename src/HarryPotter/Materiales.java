/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarryPotter;
import java.awt.Color;
/**
 *
 * @author jcgol
 */
public class Materiales {
    private String descripcion;
    private Color color;
    private String textura;

    public Materiales() {
    }

    public Materiales(String descripcion, Color color, String textura) {
        this.descripcion = descripcion;
        this.color = color;
        this.textura = textura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    @Override
    public String toString() {
        return "Materiales{" + "descripcion=" + descripcion + ", color=" + color + ", textura=" + textura + '}';
    }
    
    
    
}
