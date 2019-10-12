package com.lineadecodigo.java.util;

/**
 * @file LecturaConsolaScanner.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/diciembre/2008
 * @url    http://lineadecodigo.com/java/lectura-de-datos-en-java-con-scanner/
 * @description Ejemplo de lectura de datos por consola mediante la clase Scanner.  
 */

import java.util.Scanner;

public class LecturaConsolaScanner {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String sTexto = "";

		System.out.println("Escribe palabras hasta que te canses. Entonces escribe FIN");

		do {
		  sTexto = reader.next();
		  System.out.println(sTexto);
		} while(!sTexto.equals("FIN"));	
		
		reader.close();
	}

}
