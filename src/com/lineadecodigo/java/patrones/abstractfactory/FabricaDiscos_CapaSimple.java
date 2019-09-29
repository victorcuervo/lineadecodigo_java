package com.lineadecodigo.java.patrones.abstractfactory;

/**
* @file FabricaDiscos_CapaSimple.java
* @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
* @date 29/enero/2013
* @url http://lineadecodigo.com/patrones/patron-abstract-factory/
* @description Codigo correspondiente al ejemplo sobre el patrón de diseño AbstractFactory
*/

import com.lineadecodigo.java.patrones.*;

public class FabricaDiscos_CapaSimple implements FabricaDiscos {

       @Override
       public BluRay crearBluRay() {
               return new BluRay_CapaSimple();
       }

       @Override
       public DVD crearDVD() {
               return new DVD_CapaSimple();
       }

}