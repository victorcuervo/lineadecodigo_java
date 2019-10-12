package com.lineadecodigo.java.string;

/**
 * @file ExtraerCadena.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   26/mayo/2010
 * @url    http://lineadecodigo.com/java/extraer-una-parte-de-una-cadena/
 * @description Pasos para extraer una parte de una cadena 
 */

public class ExtraerCadena {

	public static void main(String[] args) {
		
		String sCadena = "Hola Mundo";
		String sSubCadena = sCadena.substring(5,10);
		System.out.println(sSubCadena);
		
	}
}
