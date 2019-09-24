package com.lineadecodigo.java.io;

/**
 * @file RenombrarFicheros.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/noviembre/2006
 * @url  http://lineadecodigo.com/java/renombrar-un-fichero-con-java-io/
 * @description Uso de la clase File para renombrar ficheros con Java.
 */

import java.io.File;

public class RenombrarFicheros {

	public static void main(String[] args) {

		File f1 = new File("fichero1.txt");
		File f2 = new File("fichero2.txt");
		
		boolean correcto = f1.renameTo(f2);
		
		if (correcto)
		  System.out.println("El renombrado ha sido correcto");
		else
		  System.out.println("El renombrado no se ha podido realizar");

	}

}
