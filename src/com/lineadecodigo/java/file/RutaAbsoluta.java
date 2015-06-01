package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file RutaAbsoluta.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   21/noviembre/2011
 * @url    http://lineadecodigo.com/java/obtener-la-ruta-absoluta-de-un-fichero-con-java/
 * @description Obtener la ruta absoluta de un fichero
 */

public class RutaAbsoluta {

	public static void main(String[] args) {

		File fichero = new File("test.txt");
		System.out.println("La ruta del fichero es: " + fichero.getAbsolutePath());

	}

}
