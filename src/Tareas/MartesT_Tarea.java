/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author jcgol
 */
public class MartesT_Tarea {
    public static void main(String args[]) throws IOException{
       
        AdministrarContacto ac=
                new AdministrarContacto("./contacto.txt");        
        ac.cargarArchivo();
        String marca,modelo;
        int existencia;
        double precio;
        marca = JOptionPane.showInputDialog("Marca");
        modelo=JOptionPane.showInputDialog("Modelo");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio"));
        existencia=Integer.parseInt(JOptionPane.showInputDialog("Existencia"));        
        Contacto c= new Contacto(marca,modelo,precio,existencia);
        ac.getListaContacto().add(c);        
        ac.escribirArchivo();
       
    }
}
