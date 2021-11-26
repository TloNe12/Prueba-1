/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

import java.util.Scanner;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;

/**
 *
 * @author jcgol
 */
public class Almacenamiento {

    public static void main(String args[]) {
        int codigo, espacio;
        String material;
        double peso;

        Scanner leer = new Scanner(System.in);
        ArrayList<Items> lista = new ArrayList();
        int opcion = 0, opcionSub = 0;
        System.out.println("1. Agregar un item");
        System.out.println("2. Reporte");
        System.out.println("3. Salir");
        System.out.println("Ingrese la opcion que usted desee");
        opcion = leer.nextInt();
        while (opcion != 3) {
            if (opcion == 1) {
                //Incio del Submenu
                System.out.println("1. Agregar Rupees");
                System.out.println("2. Agregar Arma");
                System.out.println("3. Agregar Objeto Utilizable");
                System.out.println("4. Agregar Mascara");
                System.out.println("Ingrese la opcion que usted desee");
                opcionSub = leer.nextInt();
                switch (opcionSub) {
                    case 1:
                        int valor;
                        Color color;
                        System.out.println("Ingrese valor ");
                        valor = leer.nextInt();
                        color = JColorChooser.showDialog(null, "seleccione color", Color.BLUE);
                        System.out.println("Ingrese peso");
                        peso = leer.nextDouble();
                        System.out.println("Ingrese material");
                        material = leer.next();
                        System.out.println("Codigo");
                        codigo = leer.nextInt();
                        System.out.println("Espacio");
                        espacio = leer.nextInt();
                        lista.add(new Rupees(valor, color, peso, material, codigo, espacio));
                        break;

                    case 2:
                        String nombre;
                        int municion,
                         cantidad;//Armas
                        System.out.println("Nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese Muncion");
                        municion = leer.nextInt();
                        System.out.println("Ingrese cantidad:");
                        cantidad = leer.nextInt();
                        System.out.println("Ingrese peso");
                        peso = leer.nextDouble();
                        System.out.println("Ingrese material");
                        material = leer.next();
                        System.out.println("Codigo");
                        codigo = leer.nextInt();
                        System.out.println("Espacio");
                        espacio = leer.nextInt();
                        lista.add(new Armas(nombre, municion, cantidad, peso, material, codigo, espacio));
                        break;

                    case 3:
                        String uso;
                        int cantidadE;
                        System.out.println("Ingrese nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese uso");
                        uso = leer.next();
                        System.out.println("Ingrese cantdad de espacio");
                        cantidadE = leer.nextInt();
                        System.out.println("Ingrese el codigo");
                        codigo = leer.nextInt();
                        System.out.println("Ingrese el espacio");
                        espacio = leer.nextInt();
                        lista.add(new ObjetosU(nombre, uso, cantidadE, codigo, espacio));
                        break;

                    default:
                        double tamanio;
                        String transformacion;
                        System.out.println("Ingrese el tamanio");
                        tamanio = leer.nextDouble();
                        System.out.println("Ingrese el peso");
                        peso = leer.nextDouble();
                        System.out.println("Ingrese el nombre");
                        nombre = leer.next();
                        System.out.println("Ingrese la transformacion");
                        transformacion = leer.next();
                        System.out.println("Ingrese el codigo");
                        codigo = leer.nextInt();
                        System.out.println("Ingrese espacio");
                        espacio = leer.nextInt();
                        lista.add(new Mascaras(tamanio, peso, nombre, transformacion, codigo, espacio));
                        break;
                }
            }

            if (opcion == 2) {
                for (Items items : lista) {
                    System.out.println(items);
                }
            }

        }

    }
}
