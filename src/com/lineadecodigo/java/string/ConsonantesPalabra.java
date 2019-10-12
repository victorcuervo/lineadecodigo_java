package com.lineadecodigo.java.string;

public class ConsonantesPalabra {

	/**
	 * @file ConsonantesPalabra.java
	 * @version 1.0
	 * @author Víctor Cuervo (http://lineadecodigo.com)
	 * @date   23/octubre/2010
	 * @url    http://lineadecodigo.com/java/contar-las-consonantes-de-una-palabra-con-java/
	 * @description Código que cuenta las consonantes de una palabra 
	 */
	public static void main(String[] args) {

		//String sPalabra = "Supercalifragilisticoespialidoso";
		// String sPalabra = "murcielagos";
		String sPalabra = "JuAn & Pedro";
		
		
		int contador = 0;
		
		for(int x=0;x<sPalabra.length();x++) {			
			if ((Character.isLetter(sPalabra.charAt(x))) && (!esVocal(sPalabra.charAt(x))))
				contador++;
		}
		
		System.out.println("La palabra " + sPalabra + " contiene " + contador + " consonantes");

	}
	
	public static boolean esVocal(char c){
		if ((Character.toLowerCase(c)=='a') || (Character.toLowerCase(c)=='e') || (Character.toLowerCase(c)=='i') || (Character.toLowerCase(c)=='o') || (Character.toLowerCase(c)=='u'))
			return true;
		else
			return false;		
	}

}
