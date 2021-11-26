/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import clase20140529.Hello;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcgol
 */
public class AdministrarContacto {
    private ArrayList<Contacto> listaContacto = new ArrayList();
    private File archivo = null;

    public AdministrarContacto(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Contacto> getListaContacto() {
        return listaContacto;
    }

    public void setListaContacto(ArrayList<Contacto> listaContacto) {
        this.listaContacto = listaContacto;
    }

    @Override
    public String toString() {
        return "listaContacto=" + listaContacto;
    }

    //extra mutador
    public void setContacto(Contacto p) {
        this.listaContacto.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Contacto t : listaContacto) {
                bw.write(t.getMarca() + ";");
                bw.write(t.getModelo() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getExistencia()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaContacto = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaContacto.add(new Contacto(sc.next(),
                                    sc.next(),
                                    sc.nextDouble(),
                                    sc.nextInt()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
