package com.lineadecodigo.java.patrones.abstractfactory;


/**
 * @file PatronAbstractFactory.java
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date 29/enero/2013
 * @url http://lineadecodigo.com/patrones/patron-abstract-factory/
 * @description Codigo correspondiente al ejemplo sobre el patrón de diseño AbstractFactory
 */

import com.lineadecodigo.java.patrones.*;


public class PatronAbstractFactory {
	
    public static void main(String[] args) {
        FabricaDiscos fabrica;
        DVD dvd;
        BluRay bluray;

        fabrica = new FabricaDiscos_CapaSimple();
        dvd = fabrica.crearDVD();
        bluray = fabrica.crearBluRay();

        System.out.println(dvd);
        System.out.println(bluray);

        fabrica = new FabricaDiscos_CapaDoble();
        dvd = fabrica.crearDVD();
        bluray = fabrica.crearBluRay();

        System.out.println(dvd);
        System.out.println(bluray);
    }

}
