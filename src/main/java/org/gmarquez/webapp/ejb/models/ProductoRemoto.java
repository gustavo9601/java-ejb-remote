package org.gmarquez.webapp.ejb.models;

import java.io.Serializable;

// Serializable // Indica que la clase puede ser serializada, necesario por que es usada en una interfaz remota
public class ProductoRemoto implements Serializable {

    // uui necesario para la serializacion de la clase
    static final long serialVersionUID = 100452L;

    private String nombre;

    public ProductoRemoto() {
    }

    public ProductoRemoto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
