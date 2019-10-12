package com.lineadecodigo.java.string;

/**
 * @file Palindromo.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  19/septiembre/2007
 * @url    http://lineadecodigo.com/java/saber-si-una-palabra-es-un-palindromo-con-java/
 * @description Una palabra es un palindromo si se lee igual de izquierda a derecha
 * que de derecha a izquierda 
 */

public class Palindromo {

	public static void main(String[] args) {
		
		//String sPalabra = "anilina";
		String sPalabra = "dabale arroz a la zorra el abad";
		
		// Si queremos saber si es palíndromo una frase
		// deberemos de borrar los espacios
		// sPalabra = sPalabra.replace(" ", "");
		
		int inc = 0;
		int des = sPalabra.length()-1;
		boolean bError = false;		
		
		while ((inc<des) && (!bError)){
			
			if (sPalabra.charAt(inc)==sPalabra.charAt(des)){				
				inc++;
				des--;
			} else {
				bError = true;
			}		
		}
		
		if (!bError)
			System.out.println(sPalabra + " es un PALINDROMO");
		else
			System.out.println(sPalabra + " NO es un palindromo");
		
	}

}
