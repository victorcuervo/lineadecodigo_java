package com.lineadecodigo.java.patrones;

import com.lineadecodigo.java.patrones.prototype.Prototipo;

public class DVD_CapaSimple extends DVD {

    @Override
    public Prototipo clone() {
            return new DVD_CapaSimple();
    }

    @Override
    public String getCapacidad() {
            return "4.7GB";
    }

    @Override
    public String getNombre() {
            return "DVD Capa Simple";
    }

    @Override
    public String getPrecio() {
            return "5.00$";
    }

}
