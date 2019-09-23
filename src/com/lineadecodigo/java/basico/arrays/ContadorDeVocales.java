package com.lineadecodigo.java.basico.arrays;

/**
 * @file ContadorDeVocales.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/septiembre/2015
 * @url    http://lineadecodigo.com/java/metodo-contador-de-vocales/
 * @description Crear un método que cuente vocales de una palabra y devuelva el resultado en un array
 */

public class ContadorDeVocales {

	
	public static int[] contadorVocales(String sPalabra) {
		
		int[] contador = {0,0,0,0,0};
		
		sPalabra = sPalabra.toLowerCase();
		
		for(int x=0;x<sPalabra.length();x++) {
				
			switch (sPalabra.charAt(x)) {
				case 'a': case 'á':
					contador[0]++;
					break;
				case 'e': case 'é':
					contador[1]++;
					break;
					case 'i': case 'í':
					contador[2]++;
					break;
				case 'o': case 'ó':
					contador[3]++;
					break;
				case 'u': case 'ú':
					contador[4]++;
					break;					
			}
				
		}	
			
		return contador;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] vocales = contadorVocales("Murciélago");
		
		for (int x=0;x<vocales.length;x++) {
			System.out.println(vocales[x]);
		}

	}

}
