package com.lineadecodigo.java.string;

/**
 * @file MayusculasDespuesDePunto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date 24/septiembre/09
 * @url  http://lineadecodigo.com/java/poner-en-mayusculas-despues-de-punto/
 * @description Convertir a mayúsculas todo carácter que encontremos después de un punto.  
 */



public class MayusculasDespuesDePunto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "hola juan.me ha gustado mucho.hagámonos público.mañana hablamos.luis";		
		String frase2 = "";
		int indice = 0;
		int indicepunto = 0;
		
		
		indicepunto = frase.indexOf('.',indice);
		
		while (indicepunto >=0) {		
			// El primer carácter es en mayúsculas
			frase2 = frase2 + frase.substring(indice,indice+1).toUpperCase();
			// Pegamos el resto hasta el primer punto	
			frase2 = frase2 + frase.substring(indice+1,indicepunto+1);
		
			indice = indicepunto + 1;		
			indicepunto = frase.indexOf('.',indice);						
		}
		
		// Incluimos el final de la frase
		frase2 = frase2 + frase.substring(indice,indice+1).toUpperCase(); 
		frase2 = frase2 + frase.substring(indice+1,frase.length());

		
		System.out.println(frase2);
		
	}

}
