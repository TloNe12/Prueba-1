/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

/**
 *
 * @author jcgol
 */
public class Aula {
    private int nume;
    private Pizarra pl; //un atributo de un nuevo tipo

    public Aula() {
    }

    public Aula(int nume, Pizarra pl) {
        this.nume = nume;
        this.pl = pl;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    public Pizarra getPl() {
        return pl;
    }

    public void setPl(Pizarra pl) {
        this.pl = pl;
    }

    @Override
    public String toString() {
        return "nume=" + nume + ", pl=" + pl;
    }
    
    
    
    
    
    
    
    
    
}
