package com.lineadecodigo.java.string;

/**
 * @file CodigosASCIICadena.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   4/enero/2010
 * @url  http://lineadecodigo.com/java/obtener-los-codigos-ascii-de-una-cadena-de-texto/
 * @description Extraer los códigos ASCII de una cadena de texto
 */

public class CodigosASCIICadena {


	public static void main(String[] args) {

		String sCadena = "Esto es una cadena de texto";
		
		for (int x=0;x<sCadena.length();x++)
			System.out.println(sCadena.charAt(x) + " = " + sCadena.codePointAt(x));
		

	}

}
