/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABCDEFGHI;

import java.awt.Color;

/**
 *
 * @author jcgol
 */
public class Clase20211104 {

    public static void main(String args[]) {
        try {
            validarInt(0);
        } catch (miExcepcion ex) {
            ex.printStackTrace();
        }

        try {
            Racional r = new Racional(1, 2);
        } catch (miExcepcion ex) {
            System.out.println(ex.getMessage());
        }

    }

    static void validarInt(int x) throws miExcepcion {
        if (x < 0) {
            throw new miExcepcion(Color.red, "no se aceptan valores");
        }

    }

}
