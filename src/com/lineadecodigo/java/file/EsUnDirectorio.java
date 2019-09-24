package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file EsUnDirectorio.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31-enero-2009
 * @url    http://lineadecodigo.com/2009/02/01/saber-si-una-ruta-es-un-directorio-con-java/
 * @description Saber si una ruta introducida por teclado es un directorio
 */


public class EsUnDirectorio {

	public static void main(String[] args) {

		String sRuta1 = "c:\\prueba";
		String sRuta2 = "c:\\prueba.txt";
		
		File fRuta1 = new File(sRuta1);
		File fRuta2 = new File(sRuta2);
		
		if (fRuta1.isDirectory())
			System.out.println(sRuta1 + " es un directorio");
		else
			System.out.println(sRuta1 + " NO es un directorio");
		
		if (fRuta2.isDirectory())
			System.out.println(sRuta2 + " es un directorio");
		else
			System.out.println(sRuta2 + " NO es un directorio");
		
	}

}
