package lParcial;

public class MetodosRecursivos {

    /*
    Un metodo es un bloque que hace la funciones que 
    hace de una forma exclusiva
    
    Una recursion es un metodo con tres caracteristicas
    1. Debe llamarse a si mismo al menos una vez tamvien dependiendo de la situacion
    2. Debe existir una forma de pararlo en otras palabras caso base
         
            void Metodo(){
            sout("Hola");
            Metodo();
            }   
            Sin caso base entonces seguira sin fin.
            Para hacer que haya un fin ha esto se puede colocar una funcion if, while , etc.
    
    
    3. Cuando se ejecuta el recursivo se usa la memoria de RAM generando una pila o Stack.
           
    Static int POW (int x, int y)
    int s = x;
    for(int i = 0 , i< y ; i++){
    s*=x,}
    return s
    }
    
     */

    static int POW(int x, int y) {
        int s = x;
        for (int i = 0; i < y; i++) {
            s *= x;
        }
        return s;
    }

    static int Pow(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x * Pow(x, y - 1);
        }
    }

    public static void imprimeMatriz(int matriz[][], int filas, int cols) {

        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {

            System.out.print(matriz[filas][cols] + "  ");

        } else {

            if (cols == matriz[0].length - 1) {

                System.out.println(matriz[filas][cols]);

                imprimeMatriz(matriz, filas + 1, 0);

            } else {

                System.out.print(matriz[filas][cols] + "  ");

                imprimeMatriz(matriz, filas, cols + 1);

            }

        }

    }

    public static void main(String args[]) {
        System.out.println(imprimeMatriz(,5,4));
        System.out.println(POW(3, 2));
        System.out.println(Pow(3, 5));
    }

}
