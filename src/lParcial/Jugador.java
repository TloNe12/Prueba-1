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
public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano=new ArrayList();

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mano=" + mano + '}';
    }
    
    
    public void recibir(Carta c){
        mano.add(c);
    }
    
    public int TotalMano(){
        int t=0;
        for (Carta temp : mano) {
            if(temp.getNumero().equals("A")){
                t+=1;
            }
            if(temp.getNumero().equals("J")){
                t+=11;
            }
            if(temp.getNumero().equals("Q")){
                t+=12;
            }
            if(temp.getNumero().equals("K")){
                t+=13;
            }
            
            if(temp.getNumero().equals("2")){
                t+=2;
            }
            
            if(temp.getNumero().equals("3")){
                t+=3;
            }
            if(temp.getNumero().equals("4")){
                t+=4;
            }
            
            if(temp.getNumero().equals("5")){
                t+=5;
            }
            
            if(temp.getNumero().equals("6")){
                t+=6;
            }
            
            if(temp.getNumero().equals("7")){
                t+=7;
            }
            
            if(temp.getNumero().equals("8")){
                t+=8;
            }
            
            if(temp.getNumero().equals("9")){
                t+=9;
            }
            
            if(temp.getNumero().equals("10")){
                t+=10;
            }
        }
        
        return t;
        
    }
    
}
