package com.lineadecodigo.java.math;

/**
 * @file Ejemplos.java
 * @version 1,0
 * @author Ariel Carraro
 * @date   20/diciembre/2013
 * @url    http://lineadecodigo.com/java/calcular-el-volumen-de-una-piramide-en-java/
 * @description Programa que calcula el volumen de una pirámide
 */


public class VolumenPiramide{
    Servicios2 servicio;

    public VolumenPiramide(){}

    public VolumenPiramide(Servicios2 serv){
        this.servicio=serv;
    }

    public void activa(){
        System.out.println("volumen obtenido: "+servicio.volumen());
    }

    public static void main(String[] args) {
        Servicios2 piramide=new Piramide(10,15);

        VolumenPiramide vp = new VolumenPiramide(piramide);
        vp.activa();

    }

}

interface Servicios2{
public static final int M=3;
public abstract double volumen();
}

class Piramide implements Servicios2{
    private double base;
    private double altura;

    public Piramide(){}

    public Piramide(double b,double h){
        this.base=b;
        this.altura=h;
    }

    @Override
    public double volumen(){
        return (base*altura)/M;
    }
}