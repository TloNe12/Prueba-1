/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HarryPotter;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author jcgol
 */
public class Sistema {
    public static void main(String args[])
    {
        //Crear un experimento,materiales,encatamiento,herbolaria,criaturas
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Menu");
        System.out.println("1. Abrir menu");
        System.out.println("2. Salir");
        opcion = leer.nextInt();
        if(opcion!=2){
            int opcion1 = 0;
            System.out.println("1. Crear Experimento");
            System.out.println("2. Crear Material");
            System.out.println("3. Crear un encantamineto");
            System.out.println("4. Crear una planta");
            System.out.println("5. Crear una criatura");
            System.out.println("6. Verificar si un experimento es avanzado");
            System.out.println("7. Listar");
            System.out.println("8. Salir");
            
            
        }
        
        
        
        Color color = JColorChooser.showDialog(null, "seleccione color", Color.BLUE);
    }
}
