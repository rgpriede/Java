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
public class Direccion implements Serializable{
    protected static final long serialVersionUID=1l;
    private String pais;
    private String calle;
    private int numero;
    private String ciudad;

    public Direccion(){
        this("","",0,"");
    }
    public Direccion(String pais, String calle, int numero, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "esta en " + pais + " calle " + calle + "," + numero + " de " + ciudad ;
    }
    
    
}
