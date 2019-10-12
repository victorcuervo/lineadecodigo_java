package com.lineadecodigo.java.string;

/**
 * @file CadenaMayusMinuscAlternativos.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/marzo/2016
 * @url  http://lineadecodigo.com/java/palabra-mayusculas-minusculas/
 * @description Convierte los caracteres de una cadena a mayúsculas y minúsculas alternativamente
 */

public class CadenaMayusMinuscAlternativos {

	public static void main(String[] args) {
		
		StringBuilder sCadena = new StringBuilder("Esto es una frase muy interesante");
		String caracter;
		System.out.println(sCadena);
		
		for (int x=0;x<sCadena.length();x++) {
			caracter = Character.toString(sCadena.charAt(x));
			if (x%2 == 0)
				sCadena.setCharAt(x,caracter.toUpperCase().charAt(0));
			else
				sCadena.setCharAt(x,caracter.toLowerCase().charAt(0));
				
		}
		
		System.out.println(sCadena);

	}

}
