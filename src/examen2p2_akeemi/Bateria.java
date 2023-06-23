/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

/**
 *
 * @author SURFACEB2I7
 */
public class Bateria extends Parte{
    private int horas;
    private String material;

    public Bateria() {
    }

    public Bateria(int horas, String material) {
        this.horas = horas;
        this.material = material;
    }

    public Bateria(int horas, String material, int tiempo) {
        super(tiempo);
        this.horas = horas;
        this.material = material;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria{" + "horas=" + horas + ", material=" + material + '}';
    }
    
    
}
