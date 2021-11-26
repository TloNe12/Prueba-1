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
public class NOT extends Componentes{
    private int entrada;
    
    public NOT(){
        
    }

    public NOT(int entrada, int entradas, String name) {
        super(entradas, name);
        this.entrada = entrada;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return super.toString() + "NOT{" + "entrada=" + entrada + '}';
    }
    
    
    
    
}
