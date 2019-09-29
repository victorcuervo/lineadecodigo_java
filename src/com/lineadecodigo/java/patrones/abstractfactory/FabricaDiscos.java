package com.lineadecodigo.java.patrones.abstractfactory;

/**
 * @file FabricaDiscos.java
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Enero 29, 2013
 * @url http://lineadecodigo.com/patrones/patron-abstract-factory/
 * @description Codigo correspondiente al ejemplo sobre el patrón de diseño AbstractFactory
 */

import com.lineadecodigo.java.patrones.*;

public interface FabricaDiscos {

        public BluRay crearBluRay();
        public DVD crearDVD();
}
