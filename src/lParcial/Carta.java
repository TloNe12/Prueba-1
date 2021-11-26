/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lParcial;

/**
 *
 * @author jcgol
 */
public class Carta {
    private String palo, numero;

    public Carta() {
    }

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }
    
    public boolean comparar(Carta otra){
        if (this.palo.equals(otra.getPalo())  &&  
                this.numero.equals(otra.getNumero())
                ) {
            return true;            
        }
        return false;
    }
}
