/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lParcial;
import java.util.ArrayList;
/**
 *
 * @author jcgol
 */
public class Transbordadores {
    private ArrayList<Motores> motores = new ArrayList();
    private ArrayList<Tanques> tanques = new ArrayList();
    private ArrayList<Cabina> cabina = new ArrayList();
    private ArrayList<Propulsores> propulsores = new ArrayList();
    private int peso;
    private String nombre,destino;
    
    public Transbordadores(){
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public void CrearNave(int peso, String nombre, int cantidadM,
            int cantidadT, int cantidadP, int tamanioM, int pesoM, int capacidadT,
            int pesoC, int cantidadC, int pesoP){
        
        motores.add(tamanioM, pesoP, cantidadP);
        
    }
    
    
    
}
