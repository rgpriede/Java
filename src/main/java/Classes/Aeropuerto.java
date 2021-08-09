/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author rgpriede
 */
public abstract class Aeropuerto implements Comparable<Aeropuerto>, Serializable {
    protected static final long serialVersionUID=1l;
    private static int id_autonumerado = 1;

    private final int MAX_AVIONES = 20;
    private int id;
    private String nombre;
    private Direccion direccion;
    private int anioInaguracion;
    private int capacidad;
    private Avion[] aviones;
    int numero_aviones;

    public Aeropuerto() {
        this("", "", "", 0, "", 0, 0);
        //this.id = id_autonumerado++;
        //aviones = new Avion[MAX_AVIONES];
        //this.numero_aviones = 0;
    }
    /**
     * 
     * @param nombre
     * @param direccion
     * @param anioInaguracion
     * @param capacidad 
     */
    public Aeropuerto(String nombre, Direccion direccion, int anioInaguracion, int capacidad) {
        this(nombre, direccion.getPais(),
                direccion.getCalle(),
                direccion.getNumero(),
                direccion.getCiudad(),
                anioInaguracion,
                capacidad);
        //this.id = id_autonumerado++;
        //this.nombre = nombre;
        //this.direccion = direccion;
        //this.anioInaguracion = anioInaguracion;
        //this.capacidad = capacidad;
        //aviones = new Avion[MAX_AVIONES];
        //this.numero_aviones = 0;
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInaguracion, int capacidad) {
        this.id = id_autonumerado++;
        this.nombre = nombre;

        this.direccion = new Direccion(pais, calle, numero, ciudad);
        this.anioInaguracion = anioInaguracion;
        this.capacidad = capacidad;
        aviones = new Avion[MAX_AVIONES];
        this.numero_aviones = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getAnioInaguracion() {
        return anioInaguracion;
    }

    public void setAnioInaguracion(int anioInaguracion) {
        this.anioInaguracion = anioInaguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //final no permite sobreescribir en la herencia solo se usa en padre
    public final int yearsOpened() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        return currentYear - this.anioInaguracion;
    }

    public void addPlane(Avion a) {
        if (numero_aviones < MAX_AVIONES) {
            this.aviones[numero_aviones] = a;
            numero_aviones++;
        } else {
            System.out.println("No es posible añadir más aviones.");
        }
    }

    public int getNumero_aviones() {
        return numero_aviones;
    }

    private String mostrarAviones() {

        String avionesCadena = "";
        for (int i = 0; i < numero_aviones; i++) {
            if (this.aviones[i].isActivado()) {
                avionesCadena += this.aviones[i].toString() + "\n";
            }

        }
        return avionesCadena;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aeropuerto other = (Aeropuerto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    // se declara en padre y se ejecuta en los hijos (herencia)
    public abstract void gananciasTotales(double cantidad);

    @Override
    public String toString() {
        return this.id + " Aeropuerto " + nombre + " " + this.direccion + " "
                + "\nse inaguro en " + anioInaguracion + " con una capacidad de " + capacidad + " pasajeros\n"
                + "cuenta con los siguientes aviones:\n"
                + mostrarAviones() + "\n";
    }

    @Override
    public int compareTo(Aeropuerto o) {
        if (this.anioInaguracion < o.getAnioInaguracion()) {
            return -1;
        } else if (this.anioInaguracion > o.getAnioInaguracion()) {
            return 1;
        } else {
            return 0;
        }

    }

}
