/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_akeemi;

/**
 *
 * @author SURFACEB2I7
 */
public class OrdenDeEnsamblaje {
    private Computadora compu;
    private Tecnicos tecnico;

    public OrdenDeEnsamblaje() {
    }

    public OrdenDeEnsamblaje(Computadora compu, Tecnicos tecnico) {
        this.compu = compu;
        this.tecnico = tecnico;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    public Tecnicos getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnicos tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "OrdenDeEnsamblaje{" + "compu=" + compu + ", tecnico=" + tecnico + '}';
    }
    
    
}
