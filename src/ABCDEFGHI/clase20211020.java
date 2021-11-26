/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

import java.util.ArrayList;
import java.util.Date;
import java.awt.Color;

public class clase20211020 {

    public static void main(String[] args) {
        int x = 5;
        Object o = "Hola";
        Object o2 = 5;

        ArrayList lista = new ArrayList(); //arrayList NO tipado.
        ArrayList<Integer> lista2 = new ArrayList(); //arrayList tipado
        ArrayList<Date> lista3 = new ArrayList<Date>();

        //CRUD  :: Create, Read, Update, Delete
        //agregar es create
        lista.add(5);
        lista.add(o);
        lista.add(0, new Date());
        lista.add(Color.red);
        lista.add(7);
        lista.add(200L);
        lista.add(15F);

        //listar
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Tipada");
        for (Object temp : lista) {
            if (temp instanceof Integer) {
                System.out.println(lista.indexOf(temp) + "-" + temp);
            }
        }

    }

}
