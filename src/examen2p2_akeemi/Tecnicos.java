/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

/**
 *
 * @author SURFACEB2I7
 */
public class Tecnicos {
    private String nombre;
    private int edad;
    private String genero;
    private int exito;

    public Tecnicos() {
    }

    public Tecnicos(String nombre, int edad, String genero, int exito) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.exito = exito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", exito=" + exito + '}';
    }
    
    
}
