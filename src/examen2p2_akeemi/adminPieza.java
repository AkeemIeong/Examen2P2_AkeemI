/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author SURFACEB2I7
 */
public class adminPieza {
     private File archivo=null;
     private Parte parte;

    public adminPieza(String path) {
        archivo = new File(path);
    }

    public adminPieza(File archivo, Parte parte) {
        this.archivo = archivo;
        this.parte = parte;
    }

   

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

    @Override
    public String toString() {
        return "adminPieza{" + "archivo=" + archivo + ", parte=" + parte + '}';
    }
     
     
    
    public void cargararchivo(){
        try {            
            parte = new Parte();
            Parte temp;
            if (archivo.exists()) {
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto= new ObjectInputStream(entrada);
                try {
                    temp = (Parte)objeto.readObject();
                    parte=temp;
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
                bw.writeObject(parte);
            
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
