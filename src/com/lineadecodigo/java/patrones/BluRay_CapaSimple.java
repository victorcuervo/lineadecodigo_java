package com.lineadecodigo.java.patrones;

import com.lineadecodigo.java.patrones.prototype.Prototipo;

public class BluRay_CapaSimple extends BluRay {

    @Override
    public Prototipo clone() {
            return new BluRay_CapaSimple();
    }

    @Override
    public String getCapacidad() {
            return "25GB";
    }

    @Override
    public String getNombre() {
            return "BluRay Capa Simple";
    }

    @Override
    public String getPrecio() {
            return "8.00$";
    }

}