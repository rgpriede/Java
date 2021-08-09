/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;


/**
 *
 * @author rgpriede
 */
public class AeropuertoPrivado extends Aeropuerto implements Serializable{

    private int numeroSocios;

    public AeropuertoPrivado() {
        super();
    }

    public AeropuertoPrivado(int numeroSocios, String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
        super(nombre, direccion, anioInaguracion, capacidad);
        this.numeroSocios = numeroSocios;
    }

    public AeropuertoPrivado(int numeroSocios, String nombre, String pais, String calle, int numero, String ciudad, int anioInaguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInaguracion, capacidad);
        this.numeroSocios = numeroSocios;
    }

    public int getNumeroSocios() {
        return numeroSocios;
    }

    public void setNumeroSocios(int numeroSocios) {
        this.numeroSocios = numeroSocios;
    }

    @Override
    public String toString() {
        return super.toString()+ " es privado y tiene "+this.numeroSocios +" socios.";
    }

    @Override
    public void gananciasTotales(double cantidad) {
       double ganancia= cantidad/ this.numeroSocios;
       System.out.println("dividendo de "+ganancia);
    }

}
