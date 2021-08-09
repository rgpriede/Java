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
public class AeropuertoPublico extends Aeropuerto implements Serializable{
    
   private double financiacion;
   private int numTrabajadoresDiscapacitados;

    public AeropuertoPublico() {
        super();
                
    }

    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
        super(nombre, direccion, anioInaguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, String pais, String calle, int numero, String ciudad, int anioInaguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInaguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

     public double getFinanciacion() {
        return financiacion;
    }

    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }

    public int getNumTrabajadoresDiscapacitados() {
        return numTrabajadoresDiscapacitados;
    }

    public void setNumTrabajadoresDiscapacitados(int numTrabajadoresDiscapacitados) {
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    @Override
    public String toString() {
        return super.toString() +" es público la financiacion recibida es de " + financiacion + 
                " el número de trabajadores discapacitados son " + numTrabajadoresDiscapacitados;
    }

    @Override
    public void gananciasTotales(double cantidad) {
       double ganancias = cantidad + financiacion + (this.numTrabajadoresDiscapacitados*100);
       System.out.println("La ganacia ha sido "+ ganancias);
    }
   
   
   
}
