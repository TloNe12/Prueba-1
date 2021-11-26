/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TonyStark;

/**
 *
 * @author jcgol
 */
public class Componentes {
    private int entradas;
    private String name;

    public Componentes() {
    }

    public Componentes(int entradas, String name) {
        this.entradas = entradas;
        this.name = name;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Componentes{" + "entradas=" + entradas + ", name=" + name + '}';
    }
    
    
    
    
    
    
    
}
