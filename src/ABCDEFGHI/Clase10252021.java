/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

import java.awt.Color;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author jcgol
 */
public class Clase10252021 {
 
    //Hoy vere clases compuestas :3
    //Clases consiste de cuatro elementos atributos, mutadores, constructores y
    //metodos de administracion.
    
    /*
                Clase de hoy (compuesta y conjunto
    */
   
     public static void main(String[] args){
        Aula a = new Aula();
        a.setNume(203);
        a.setPl(new Pizarra(2,3,Color.white,new Date(),"lisa"));
         System.out.println(a.getPl().getColor());
        
        ArrayList<Aula> aulas = new ArrayList();
        aulas.add(new Aula(201,new Pizarra(2,3,Color.white,new Date(),"lisa")));
        aulas.add(new Aula(202,new Pizarra(2,3,Color.white,new Date(),"lisa")));
        aulas.add(new Aula(203,new Pizarra(2,3,Color.white,new Date(),"lisa")));
        
        aulas.get(1).setNume(502);
        aulas.get(1).getPl().setColor(Color.black);
    }
    
    
}
