/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;
import java.awt.Color;
/**
 *
 * @author jcgol
 */
public class Rupees extends CRupees{
    private int valor;
    private Color color;

    public Rupees() {
    }

    public Rupees(int valor, Color color, double peso, String material, int codigo, int espacio) {
        super(peso, material, codigo, espacio);
        this.valor = valor;
        this.color = color;
    }

    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Rupees{" + "valor=" + valor + ", color=" + color + '}';
    }
    
    
    
    
    
}
