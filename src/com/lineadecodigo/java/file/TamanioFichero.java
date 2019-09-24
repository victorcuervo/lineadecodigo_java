package com.lineadecodigo.java.file;

/**
 * @file TamanioFichero.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   7-julio-07
 * @url    http://lineadecodigo.com/2007/07/07/conocer-el-tamano-de-un-fichero-con-java/
 * @description Conocer el tamño de un fichero, en bytes, mediante la librería java.io.  
 */

import java.io.File;

public class TamanioFichero {

	public static void main(String[] args) {
		
	  String sFichero = "c:\\prueba.xml";
	  File fichero = new File(sFichero);
	  System.out.println("El tamaño del fichero " + sFichero +
	    " es: " + Long.toString(fichero.length()) + " bytes");

	}

}
