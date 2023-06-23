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
public class Computadora {
    private String NumSerie;
    private int ano;
    private Color color;
    private String material;
    private Ram ram;
    private DiscoDuro disco;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;

    public Computadora() {
    }

    public Computadora(String NumSerie, int ano, Color color, String material, Ram ram, DiscoDuro disco, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.NumSerie = NumSerie;
        this.ano = ano;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco = disco;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public String getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(String NumSerie) {
        this.NumSerie = NumSerie;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "NumSerie=" + NumSerie + ", ano=" + ano + ", color=" + color + ", material=" + material + ", ram=" + ram + ", disco=" + disco + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", procesador=" + procesador + '}';
    }
    
    
}
