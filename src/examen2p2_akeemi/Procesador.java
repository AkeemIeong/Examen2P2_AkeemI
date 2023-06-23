/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

/**
 *
 * @author SURFACEB2I7
 */
public class Procesador extends Parte{
    private int nucleos;
    private String velocidad;

    public Procesador() {
        super();
    }

    public Procesador(int nucleos, String velocidad) {
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public Procesador(int nucleos, String velocidad, int tiempo) {
        super(tiempo);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" + "nucleos=" + nucleos + ", velocidad=" + velocidad + '}';
    }
    
    
}
