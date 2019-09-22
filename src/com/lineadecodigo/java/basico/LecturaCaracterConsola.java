package com.lineadecodigo.java.basico;

/**
 * @file LecturaCaracterConsola.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/marzo/2007
 * @url    http://lineadecodigo.com/2007/04/06/lectura-de-caracteres-por-consola-en-java/
 * @description Explicación de cómo se realiza una lectura de caracteres por teclado en una aplicación de consola.  
 */

import java.io.IOException;

public class LecturaCaracterConsola {

	public static void main(String[] args) throws IOException {
		
		int caracter = 0;    

		while (caracter!=13) {
			caracter = System.in.read();
			System.out.print((char)caracter);
		}
		
	}

}
