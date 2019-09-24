package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file ListarContenidoDirectorio.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   26/diciembre/2008
 * @url    http://lineadecodigo.com/java/listar-un-directorio-con-java/
 * @description Lista el contenido de un directorio mediante Java
 */


public class ListarContenidoDirectorio {


	public static void main(String[] args) {

		String sDirectorio = "c:\\datos";
		File f = new File(sDirectorio);
		
		if (f.exists()){
			// Recuperamos la lista de ficheros
			File[] ficheros = f.listFiles();
			for (int x=0;x<ficheros.length;x++){
				System.out.println(ficheros[x].getName());
			}
		} else{
			System.out.println("No existe ese directorio");
		}
		
	
	}

}
