/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

/**
 *
 * @author SURFACEB2I7
 */
public class Pantalla extends Parte{
    private boolean tactil;
    private String tipo;

    public Pantalla() {
        super();
    }

    public Pantalla(boolean tactil, String tipo) {
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public Pantalla(boolean tactil, String tipo, int tiempo) {
        super(tiempo);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "tactil=" + tactil + ", tipo=" + tipo + '}';
    }
    
    
}
