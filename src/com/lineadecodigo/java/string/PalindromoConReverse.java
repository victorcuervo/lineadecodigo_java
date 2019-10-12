package com.lineadecodigo.java.string;

/**
 * @file PalindromoConReverse.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  25/enero/2009
 * @url    http://lineadecodigo.com/java/palindromos-en-java-con-reverse/
 * @description Una palabra es un palindromo si se lee igual de izquierda a derecha
 * que de derecha a izquierda. En este caso lo hacemos con un método reverse. 
 */

public class PalindromoConReverse {

	public static void main(String[] args) {

		//String sPalabra = "anilina";
		String sPalabra = "dábale arroz a la zorra el abad";
		String sPalabraSinEspacios;
		
		// Si queremos saber si es palíndromo una frase
		// deberemos de borrar los espacios
		sPalabraSinEspacios = sPalabra.replace(" ", "");
				
		StringBuffer sb = new StringBuffer(sPalabraSinEspacios);
		sb = sb.reverse();
		
		if (sPalabraSinEspacios.equalsIgnoreCase(sb.toString()))		
			System.out.println(sPalabra + " es un PALINDROMO");
		else
			System.out.println(sPalabra + " NO es un palindromo");

		
		
	}

}
