package com.lineadecodigo.java.math;

/**
 * @file VolumenEsfera.java
 * @version 1.0
 * @author Ariel Carraro (http://lineadecodigo.com)
 * @date   2/febrero/2013
 * @url    http://lineadecodigo.com/java/calcular-el-volumen-de-una-esfera-en-java/
 * @description Programa que nos muestra como podemos calcular el volumen de una esfera en Java mediante una sencilla formula matematica.
 */

public class VolumenEsfera{
    
    public static void main(String[] args) {
        Figura esfera=new Esfera(20);
        esfera.ver();
    }
}

interface Servicio{
    public abstract void ver();
}

abstract class Figura implements Servicio{
    private double radio;
    public abstract double volumen();

    public Figura(){}

    public Figura(double _radio){
        this.radio=_radio;
    }

    public double getRadio(){
        return this.radio;
    }
}

class Esfera extends Figura{
    double r;

    public Esfera(){}

    public Esfera(double _r){
        super(_r);
        r=_r;
    }

    @Override
    public double volumen(){
        return ((4/3) * Math.PI*(r*r*r));
    }

    @Override
    public void ver(){
        System.out.println(String.format("radio: %f , volumen esfera: %f",getRadio(),volumen()));
    }
}