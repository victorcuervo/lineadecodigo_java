package com.lineadecodigo.java.basico;

/**
 * @file ParametrosMain.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   28/febrero/2011
 * @url  http://lineadecodigo.com/java/pasar-parametros-a-una-aplicacion-java/
 * @description Conocer que parámetros se pasan al método main  
 */

public class ParametrosMain {
	
	public static void main(String[] args) {

		System.out.println("Los parámetros de la clase main son:");
		
		for (String arg : args)
			System.out.println(arg);

	}

}
