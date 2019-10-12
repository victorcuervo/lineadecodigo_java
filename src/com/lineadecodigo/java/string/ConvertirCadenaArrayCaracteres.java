package com.lineadecodigo.java.string;

/**
 * @file ConvertirCadenaArrayCaracteres.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date 14/febrero/2009   
 * @url  http://lineadecodigo.com/2009/02/14/convertir-una-cadena-en-un-array-de-caracteres-con-java/
 * @description Convierte una cadena de texto en un array de caracteres  
 */

public class ConvertirCadenaArrayCaracteres {

	public static void main(String[] args) {
		
		String sCadena = "Esto es una cadena de texto";
		
		char[] aCaracteres = sCadena.toCharArray();
		
		for (int x=0;x<aCaracteres.length;x++)
			System.out.println("[" + x + "] " + aCaracteres[x]);

	}

}
