package com.lineadecodigo.java.basico;

/**
 * @file Comunes.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/marzo/2009
 * @url  
 * @description Clase con un conjunto de operaciones comunes
 */

public final class Comunes {
	
	// Validación de si una cadena es un número
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){		
			return false;
		}
	}
}
