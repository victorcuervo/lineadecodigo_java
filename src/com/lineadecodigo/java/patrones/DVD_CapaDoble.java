package com.lineadecodigo.java.patrones;

import com.lineadecodigo.java.patrones.prototype.Prototipo;

public class DVD_CapaDoble extends DVD {

    @Override
    public Prototipo clone() {
            return new DVD_CapaDoble();
    }

    @Override
    public String getCapacidad() {
            return "8.5GB";
    }

    @Override
    public String getNombre() {
            return "DVD Capa Doble";
    }

    @Override
    public String getPrecio() {
            return "10.00$";
    }

}