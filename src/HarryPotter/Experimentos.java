/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarryPotter;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author jcgol
 */
public class Experimentos {

    private String nombre;
    private int calificacion;
    private Date fechacreacion;
    private ArrayList<Materiales> lista;
    private int Clase;

    public Experimentos() {
    }

    public Experimentos(String nombre, int calificacion, Date fechacreacion, ArrayList<Materiales> lista, int Clase) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.fechacreacion = fechacreacion;
        this.lista = lista;
        this.Clase = Clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public ArrayList<Materiales> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Materiales> lista) {
        this.lista = lista;
    }

    public int getClase() {
        return Clase;
    }

    public void setClase(int Clase) {
        this.Clase = Clase;
    }

    @Override
    public String toString() {
        return "Experimentos{" + "nombre=" + nombre + ", calificacion=" + calificacion + ", fechacreacion=" + fechacreacion + ", lista=" + lista + ", Clase=" + Clase + '}';
    }

    public boolean avanzado (){
        return false;
    }


}
