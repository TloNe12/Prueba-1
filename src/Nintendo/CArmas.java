/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;
import java.util.ArrayList;
/**
 *
 * @author jcgol
 */
public class CArmas extends Contenedores {
    private int cantidad;
    private ArrayList<Armas> lista = new ArrayList();

    public CArmas() {
    }

    public CArmas(int cantidad, double peso, String material, int codigo, int espacio) {
        super(peso, material, codigo, espacio);
        this.cantidad = cantidad;
    }

    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Armas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Armas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return super.toString()+"CArmas{" + "cantidad=" + cantidad + ", lista=" + lista + '}';
    }
    
    
    
    
    
}
