package com.lineadecodigo.java.io;

/**
 * @file CrearUnFichero.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/julio/2007
 * @url    http://lineadecodigo.com/2007/07/21/crear-un-fichero-en-java/
 * @description Pasos para crear un fichero con la librería Java IO y la clase File
 */

import java.io.*;

public class CrearUnFichero {

	public static void main(String[] args) {
	   // Creamos el objeto que encapsula el fichero
	   File fichero = new File("c:\\temp\\miFichero.txt");

	   try {
	      // A partir del objeto File creamos el fichero físicamente
	      if (fichero.createNewFile())
	        System.out.println("El fichero se ha creado correctamente");
	      else
	        System.out.println("No ha podido ser creado el fichero");
	    } catch (IOException ioe) {
	      ioe.printStackTrace();
	    }

	}

}
