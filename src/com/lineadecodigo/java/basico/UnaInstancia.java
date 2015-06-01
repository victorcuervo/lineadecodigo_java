package com.lineadecodigo.java.basico;

/**
 * @file UnaInstancia.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   22-febrero-2012
 * @url  http://lineadecodigo.com/java/evitar-que-un-programa-java-se-cargue-dos-veces/  
 * @description  Controlar que nuestro programa Java se ejecute una única vez.
 */

import java.io.IOException;
import java.net.ServerSocket;

public class UnaInstancia {

	private static ServerSocket SERVER_SOCKET;

    public static void main(String[] args) {
        try {
            SERVER_SOCKET = new ServerSocket(1334);
            System.out.println("Es la primera instancia de la aplicación...");
            System.out.println("Pulsa OK para terminar");
            System.in.read();
        } catch (IOException x) {
            System.out.println("Otra instancia de la aplicación se está ejecutando...");
        }
    }

}
