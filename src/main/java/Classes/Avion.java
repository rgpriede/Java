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
public class Avion implements Activable, Serializable{
    protected static final long serialVersionUID=1l;
    // atributos
    private String modelo;
    private int nAsientos;
    private double velocidadMaxima;
    private boolean activado;
    
    
    //Contructores
    public Avion (){
        this("",0,0);
    }
    public Avion(String modelo, int nAsientos, double velocidadMaxima){
        this.modelo=modelo;
        this.nAsientos=nAsientos;
        this.velocidadMaxima=velocidadMaxima;
        this.activado=false;
    }
    //Metodos
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
   @Override
    public boolean isActivado() {
        return activado;
    }

    @Override
    public void setActivado(boolean value) {
        this.activado=value ;
    }
       
    @Override
    public String toString() {
        return modelo + " nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima ;
    }

 
}
