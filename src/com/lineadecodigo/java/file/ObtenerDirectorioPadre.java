package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file ConvertirFicheroEnURL.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26/septiembre/2011
 * @url    http://lineadecodigo.com/java/obtener-directorio-padre-de-un-fichero/
 * @description Obtener el directorio padre de un fichero
 */

public class ObtenerDirectorioPadre {

	public static void main(String[] args) {
		
		File fichero = new File("test.txt");
		File fichero2 = new File(fichero.getAbsolutePath());
		
		System.out.println("La ruta absoluta del fichero es " + fichero.getAbsolutePath());
		System.out.println("El directorio padre del fichero es " + fichero.getParent());
		System.out.println("El directorio padre del fichero es " + fichero2.getParent());		

	}

}
