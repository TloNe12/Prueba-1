package Semana7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Lunes {
    public static void main(String args[]) throws IOException{
    //forma 1 de leer un archivo
    File f = null; //Archivo
    FileReader fr = null; //Canal de Lectura
    BufferedReader br = null; //Ram de Lectura
    try {
        //Una forma de instanciar
        f = new File("C:\\Users\\jcgol\\Desktop\\Programacion2\\prueba.txt"); //Absoluta contrapleca
        //f = new File("C:/Users/jcgol\\Desktop/Programacion2/prueba.txt"); //absoluta completa
        //f = new File("./f.txt"); //relativo pleca
        //f = new File(".\\configuracion/colores.txt");//relatico contrapleca
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        
        String linea;
        while( (linea=br.readLine()) != null){
            System.out.println(linea);
        }
        
        
    }catch (Exception e) {
        e.printStackTrace();
    }
    
    br.close();
    fr.close();
    
    
    }
    
    
}
