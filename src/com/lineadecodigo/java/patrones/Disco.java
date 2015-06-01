package com.lineadecodigo.java.patrones;

import com.lineadecodigo.java.patrones.prototype.Prototipo;

public abstract class Disco implements Prototipo {

	
    @Override
    public abstract Prototipo clone();

    public abstract String getCapacidad();

    public abstract String getNombre();

    public abstract String getPrecio();

    @Override
    public String toString() {
            return getNombre() + " (" + getCapacidad() + ")";
    }
}