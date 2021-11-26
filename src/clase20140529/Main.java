/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase20140529;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author jcgol
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
        //Agregar 
       /* administrarPersonas ap=
                new administrarPersonas("./blady.txt");        
        ap.cargarArchivo();
        int c,e;
        String n;
        c=Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
        n=JOptionPane.showInputDialog("Nombre");
        e=Integer.parseInt(JOptionPane.showInputDialog("Edad"));        
        Persona p= new Persona(c,n,e);
        ap.getListaPersonas().add(p);        
        ap.escribirArchivo();*/
        
        
      /*  administrarPersonas ap=
                new administrarPersonas("./blady.txt");        
        ap.cargarArchivo();
        //System.out.println(ap);
        for (Persona t : ap.getListaPersonas()) {
            System.out.println( ap.getListaPersonas().indexOf(t)+"- "+t );
        }*/
                
        
        //modificar
       /*administrarPersonas ap=
                new administrarPersonas("./blady.txt");  
        int p;
        String n;
        p=Integer.parseInt(JOptionPane.showInputDialog("Posicion"));
        n=JOptionPane.showInputDialog("Nombre");
        
        ap.cargarArchivo();
        ap.getListaPersonas().get(p).setNombre(n);
        ap.escribirArchivo();*/
       
        
        //eliminar
        administrarHello ap=
                new administrarHello("./blady.txt");  
        int p;        
        p=Integer.parseInt(JOptionPane.showInputDialog("Posicion"));       
        ap.cargarArchivo();
        ap.getListaPersonas().remove(p);
        ap.escribirArchivo();
        
    }
}
