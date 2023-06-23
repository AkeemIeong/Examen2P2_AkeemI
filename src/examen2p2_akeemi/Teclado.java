/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

import java.awt.Color;

/**
 *
 * @author SURFACEB2I7
 */
public class Teclado extends Parte{
    private String material;
    private Color color;

    public Teclado() {
    }

    public Teclado(String material, Color color) {
        this.material = material;
        this.color = color;
    }

    public Teclado(String material, Color color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material + ", color=" + color + '}';
    }
    
    
}
