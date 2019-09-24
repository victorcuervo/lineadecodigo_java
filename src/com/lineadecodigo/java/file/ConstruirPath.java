package com.lineadecodigo.java.file;

/**
 * @file ConstruirPath.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/septiembre/2011
 * @url    http://lineadecodigo.com/java/crear-la-ruta-de-un-fichero-con-java/
 * @description Código que nos enseña a construir el path de un fichero independiente del SO en el que ejecutemos
 */

import java.io.File;

public class ConstruirPath {

	public static void main(String[] args) {

		String sFichero = "mifichero.txt";
		String sDirectorio = "midirectorio";
				
		String separador = System.getProperty("file.separator"); 
		
		String sPath = File.separator + sDirectorio + File.separator + sFichero;
		System.out.println(sPath);
		
		sPath = separador + sDirectorio + separador + sFichero;
		System.out.println(sPath);
	

	}

}
