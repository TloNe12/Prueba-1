/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TonyStark;
import java.util.ArrayList;
/**
 *
 * @author jcgol
 */
public class Robotica extends Componentes {
    private double peso;
    private int numero;
    private ArrayList<Componentes> lista = new ArrayList();

    public Robotica(double peso, int numero, int entradas, String name) {
        super(entradas, name);
        this.peso = peso;
        this.numero = numero;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Componentes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Componentes> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return super.toString() + "Robotica{" + "peso=" + peso + ","
                + " numero=" + numero + ", lista=" + lista + '}';
    }
    
    
    
    
}
