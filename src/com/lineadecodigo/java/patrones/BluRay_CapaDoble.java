package com.lineadecodigo.java.patrones;

import com.lineadecodigo.java.patrones.prototype.Prototipo;

public class BluRay_CapaDoble extends BluRay {

    @Override
    public Prototipo clone() {
            return new BluRay_CapaDoble();
    }

    @Override
    public String getCapacidad() {
            return "50GB";
    }

    @Override
    public String getNombre() {
            return "BluRay Capa Doble";
    }

    @Override
    public String getPrecio() {
            return "40.00$";
    }

}