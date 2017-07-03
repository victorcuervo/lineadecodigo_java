package com.lineadecodigo.java.string;

/**
 * @file PrimeraLetraPalabras.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  2/julio/2017
 * @url    http://lineadecodigo.com/java/primera-letra-palabra-java/
 * @description Obtener la primera letra de cada una de las palabras que forman una frase. 
 */

import java.util.StringTokenizer;

public class PrimeraLetraPalabras {

	public static void main(String[] args) {
				
		String sTexto = "En un lugar de la mancha";
		String sPalabra = "";
		StringTokenizer stPalabras = new StringTokenizer(sTexto);
		
		while (stPalabras.hasMoreTokens()) {
			sPalabra = stPalabras.nextToken();
			System.out.println(sPalabra.substring(0,1));
		}	    

	}

}
