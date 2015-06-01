package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file BorrarFichero.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26/febrero/08
 * @url    http://lineadecodigo.com/java/borrar-un-fichero-con-java/
 * @description Borrar un fichero desde un programa Java
 */


public class BorrarFichero {

	public static void main(String[] args) {
		
		String sFichero = "c:\\prueba\\prueba.txt";
		File f = new File(sFichero);
		
		if (f.delete())
			System.out.println("El fichero " + sFichero + " ha sido borrado correctamente");
		else
			System.out.println("El fichero " + sFichero + " no se ha podido borrar");

	}

}
