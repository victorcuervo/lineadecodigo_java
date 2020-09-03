package com.lineadecodigo.java.string;

import java.util.Scanner;

/**
 * @file PalabraQueEmpiezaPor.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   20/septiembre/2010
 * @url    http://lineadecodigo.com/java/palabras-que-empiecen-por/
 * @description Juego para que el usuario acierte palabras que comiencen por...
 */


 public class PalabraQueEmpiezaPor {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String sTexto = "";
		String sInicio = "ca";
		int contador = 0;

		System.out.println("Escribe palabras que empiecen por '" + sInicio + "'");

		sTexto = reader.next();
		
		while(sTexto.startsWith(sInicio)) {
		  System.out.println("Correcto... " + sTexto);
		  contador++;
		  System.out.println("Dime otra palabra...");
		  sTexto = reader.next();
		}	
	
		System.out.println("Lo siento '" + sTexto + "' no empieza por " + sInicio);
		System.out.println("Tu puntuación es de " + contador);		
		
		reader.close();
	}

}
