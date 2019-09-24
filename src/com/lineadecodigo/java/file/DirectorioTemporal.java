package com.lineadecodigo.java.file;

/**
 * @file DirectorioTemporal.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/noviembre/2011
 * @url    http://lineadecodigo.com/java/directorio-temporal-del-sistema-en-java/
 * @description Obtener directorio temporal del sistema.
 */


public class DirectorioTemporal {

	public static void main(String[] args) {
		
		 System.out.println("El directorio temporal del sistema es "
				 + System.getProperty("java.io.tmpdir"));

	}

}
