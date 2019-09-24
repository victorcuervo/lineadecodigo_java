package com.lineadecodigo.java.file;

/**
 * @file CrearFicheroTemporal.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/noviembre/2011
 * @url    http://lineadecodigo.com/java/crear-fichero-temporal-con-java/
 * @description Código que nos permite crear un fichero temporal.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CrearFicheroTemporal {

	public static void main(String[] args) {

		try {
			// Genera el fichero temporal con prefijos y sufijos. Genera un texto aleatorio.
			// Lo genera el el directorio temporal del sistema
			File tempFile = File.createTempFile("mificherotemporal",null);
			
			// Permite que el fichero se borre al salir del programa
			// tempFile.deleteOnExit();
			
			//Escribimos información en el fichero
			BufferedWriter out = new BufferedWriter(new FileWriter(tempFile));
			out.write("Esto es un fichero temporal");
			out.close();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
