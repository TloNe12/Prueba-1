/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

import java.util.Date;

/**
 *
 * @author jcgol
 */
public class Racional {
    private int num,den;

    public Racional() {
    }

    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) throws miExcepcion{
        if(num<0 || num>9){
            throw new miExcepcion(new Date(), "numerador fuera de rango");
        }
        this.num = num;
    }

    public int getDen() {
        
        return den;
    }

    public void setDen(int den) throws miExcepcion{
        if(den==0){
            throw new miExcepcion(new Date(), "den no puede ser cero");
        }
        this.den = den;
    }

    public Racional(int num, int den) throws miExcepcion{
        this.setNum(num);
        this.setDen(den);
    }

    @Override
    public String toString() {
        return "Racional{" + "num=" + num + ", den=" + den + '}';
    }
    
    
    
    
    
    
}
