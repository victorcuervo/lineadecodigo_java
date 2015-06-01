package com.lineadecodigo.java.patrones;

public class BluRayPack extends Pack {

    public BluRayPack() {

    }

    public void setSimple(BluRay doble) {
            this.doble = doble;
    }

    public void setDoble(BluRay simple) {
            this.simple = simple;
    }
    
    @Override
    public String toString() {
            return "Pack BluRay:\n" + getSimple() + "\n" + getDoble();
    }
}
