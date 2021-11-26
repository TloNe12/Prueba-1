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
public class Items {
    private int codigo;
    private int espacio;

    public Items() {
    }

    public Items(int codigo, int espacio) {
        this.codigo = codigo;
        this.espacio = espacio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public String toString() {
        return "Items{" + "codigo=" + codigo + ", espacio=" + espacio + '}';
    }
    
    
    
    
    
    
    
}
