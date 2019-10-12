package com.lineadecodigo.java.string;

/**
 * @file VocalesPalabra.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/octubre/2010
 * @url    http://lineadecodigo.com/java/contar-las-vocales-de-una-palabra-con-java/
 * @description Código que cuenta las vocales de una palabra 
 */

public class VocalesPalabra {

	public static void main(String[] args) {

		//String sPalabra = "Supercalifragilisticoespialidoso";
		String sPalabra ="murcielago";
		
		int contador = 0;
		
		for(int x=0;x<sPalabra.length();x++) {			
			if ((Character.toLowerCase(sPalabra.charAt(x))=='a') || (Character.toLowerCase(sPalabra.charAt(x))=='e') || (Character.toLowerCase(sPalabra.charAt(x))=='i') || (Character.toLowerCase(sPalabra.charAt(x))=='o') || (Character.toLowerCase(sPalabra.charAt(x))=='u')){
				contador++;
			}
		}
		
		System.out.println("La palabra " + sPalabra + "contiene " + contador + " vocales");
		

	}

}
