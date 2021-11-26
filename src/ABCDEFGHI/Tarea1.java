/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Tarea1 {

    public static void main(String[] args) {
        ArrayList inventario = new ArrayList();
        int opcion = 0;
        while (opcion != 7) {
            opcion=Integer.parseInt(
            JOptionPane.showInputDialog("1 - Agregar un vehiculo\n"
                    + "2- Agregar un rectangulo\n"
                    + "3- Listar todo\n" + "4- Listar Vehiculo\n"
                    + "5- Modificar un Vehiculo\n" + "6- Elminar algo\n" 
                    + "7- Salir"));
            
            if(opcion==1){
                String s,ma,mo;
                s=JOptionPane.showInputDialog("serie");
                ma=JOptionPane.showInputDialog("marca");
                mo=s=JOptionPane.showInputDialog("modelo");
                inventario.add(new Vehiculo(s,ma,mo,JColorChooser.showDialog(null, "color", Color.yellow),
                               new Date()));
                JOptionPane.showMessageDialog(null, "Vehiculo agregado exitosamente");
            }   
            if(opcion==2){
                int l,a;
                l=Integer.parseInt(JOptionPane.showInputDialog("largo"));
                a=Integer.parseInt(JOptionPane.showInputDialog("ancho"));
                inventario.add(new Rectangulo(l,a));
                JOptionPane.showMessageDialog(null,"Rectangulo agregado exitosamente");
                
            }
            
            if(opcion==3){
                String salida = "";
                for (Object o : inventario) {
                    salida+=inventario.indexOf(o)+"- " +o + "\n";
                }
                JOptionPane.showMessageDialog(null, salida);
            }
            
            if(opcion==4){
                String salida = "";
                for (Object o : inventario) {
                    if(o instanceof Vehiculo){
                        salida+=inventario.indexOf(o)+"-" +o+ "\n";
                    }
                }
                JOptionPane.showMessageDialog(null,salida);
            }
            
            if(opcion==5){
                int pos;
                String m;
                pos=Integer.parseInt(JOptionPane.showInputDialog("indique la posicion del Vehiculo en el inventario"));
           
                if(inventario.get(pos) instanceof Vehiculo){
                    m=JOptionPane.showInputDialog("ingresa el nuevo modelo");
                    ((Vehiculo)inventario.get(pos)).setModelo(m);
                } else{
                    JOptionPane.showMessageDialog(null, "su seleccion no es un Vehiculo");
                }
            
            }
            
            if(opcion==6){
                int pos;
                pos=Integer.parseInt(JOptionPane.showInputDialog("Indique la posicion a eliminar del inventario"));
                inventario.remove(pos);
                JOptionPane.showMessageDialog(null, "elemento eliminado exitosamente");
            }
                
            
        }//while su fin
        
    }
}
