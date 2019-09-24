package com.lineadecodigo.java.file;

/**
 * @file SeparadorDirectorios.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   18-noviembre-2010
 * @url    http://lineadecodigo.com/java/separador-de-directorios-en-java/
 * @description Conocer cual es el separador de directorios del sistema operativo sobre el que se ejecuta Java
 */

public class SeparadorDirectorios {

	public static void main(String[] args) {
		System.out.println("El separador de directorios de tu SO es " + System.getProperty("file.separator"));
	}
}
