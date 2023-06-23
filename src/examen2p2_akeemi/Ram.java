/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

/**
 *
 * @author SURFACEB2I7
 */
public class Ram extends Parte{
    private int tamano;
    private String marca;

    public Ram() {
        super();
    }

    public Ram(int tamano, String marca) {
        this.tamano = tamano;
        this.marca = marca;
    }

    public Ram(int tamano, String marca, int tiempo) {
        super(tiempo);
        this.tamano = tamano;
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ram{" + "tamano=" + tamano + ", marca=" + marca + '}';
    }
    
    
}
