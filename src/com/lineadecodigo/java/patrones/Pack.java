package com.lineadecodigo.java.patrones;

public abstract class Pack {

    protected Disco doble;
    protected Disco simple;

    public Disco getDoble() {
            return this.doble;
    }

    public Disco getSimple() {
            return this.simple;
    }

    @Override
    public String toString() {
            return "Pack:\n" + getSimple() + "\n" + getDoble();
    }
}
