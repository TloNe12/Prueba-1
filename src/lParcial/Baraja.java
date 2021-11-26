/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lParcial;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jcgol
 */
public class Baraja {
    private ArrayList<Carta> manojo=new ArrayList();

    public Baraja() {
        //programar los valores iniciales
        String [] p={"Corazones","Diamantes","Treboles","Espadas"};
        String [] n={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < n.length; j++) {
                manojo.add(new Carta(p[i],n[j]));
            }
            
        }
        this.barajarse();
    }

    public ArrayList<Carta> getManojo() {
        return manojo;
    }

    public void setManojo(ArrayList<Carta> manojo) {
        this.manojo = manojo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "manojo=" + manojo + '}';
    }
    
    public void barajarse(){
        Collections.shuffle(manojo);
    }
    
    public Carta repartir(){
        Carta r=manojo.get(0);
        manojo.remove(0);
        return r;
    }
}
