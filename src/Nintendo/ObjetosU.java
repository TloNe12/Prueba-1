/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

/**
 *
 * @author jcgol
 */
public class ObjetosU extends Items{
    private String nombre, uso;
    private int cantidadE;

    public ObjetosU() {
    }

    public ObjetosU(String nombre, String uso, int cantidadE, int codigo, int espacio) {
        super(codigo, espacio);
        this.nombre = nombre;
        this.uso = uso;
        this.cantidadE = cantidadE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int getCantidadE() {
        return cantidadE;
    }

    public void setCantidadE(int cantidadE) {
        this.cantidadE = cantidadE;
    }

    @Override
    public String toString() {
        return super.toString()+"ObjetosU{" + "nombre=" + nombre + ", uso=" + uso + ", cantidadE=" + cantidadE + '}';
    }
    
    
    
    
}
