package com.lineadecodigo.java.patrones;

public class DVDPack extends Pack {

    public DVDPack() {

    }

    public void setSimple(DVD doble) {
            this.doble = doble;
    }

    public void setDoble(DVD simple) {
            this.simple = simple;
    }
    

    @Override
    public String toString() {
            return "Pack DVD:\n" + getSimple() + "\n" + getDoble();
    }
}