/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lParcial;

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;

public class PokerJuego {

    public static void main(String args[]) {
        //valores de clases o import
        String t[] = new String[9];
        String g[] = new String[4];
        String baraja[] = new String[9];
        Baraja b = new Baraja();
        Carta c = new Carta();
        Jugador j = new Jugador();
        Scanner leer = new Scanner(System.in);
        //atributos temp
        int opcion = 0, num = 0;
        String name;
        //Inicio del menu
        System.out.println(" M E N U ");
        System.out.println("1. Agregar nuevos Jugador");
        System.out.println("2. Barajar");
        System.out.println("3. Repartir");
        System.out.println("4. Imprimir ganadores");
        System.out.println("5. Imprimir listado de los ganadores mas recientes");
        System.out.println("6. Salir");
        System.out.println("Ingrese la opcion que usted desea");
        opcion = leer.nextInt();
        //Inicio del sub menu
        while (opcion != 6) {
            //Agrega un nuevo Jugador 
            if (opcion == 1) {
                System.out.println("Ingrese nombre del jugador");
                name = leer.next();
                for (int i = 0; i < t.length; i++) {
                    t[i] = name;
                }
                System.out.println("Se agrego el jugador correctamente");
            }
        }
        if (opcion == 2) {
            b.barajarse();
            System.out.println("Se barajo correctamente");
        }
        if (opcion == 3) {
            b.repartir();
        }
        if (opcion == 4) {

        }
        if (opcion == 5) {

        }

        //Final del Sub menu
    }
    //Final del menu

}

