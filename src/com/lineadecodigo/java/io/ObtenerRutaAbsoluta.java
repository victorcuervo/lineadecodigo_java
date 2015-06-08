package com.lineadecodigo.java.io;

/**
 * @file ObtenerRutaAbsoluta.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/noviembre/2006
 * @url  http://lineadecodigo.com/java/obtener-ruta-absoluta-de-un-fichero/
 * @description Ejemplo que muestra la ruta absoluta de un fichero con Java 
 */

import java.io.File;

public class ObtenerRutaAbsoluta {
	
	public static void main(String[] args) {
	
		File fichero = new File("fichero.txt");
		System.out.println(fichero.getAbsolutePath());
		
	}

}
