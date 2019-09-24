package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file BorrarDirectorio.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   26/diciembre/08
 * @url    http://lineadecodigo.com/2008/12/28/borrar-un-directorio-con-java/
 * @description Borrar un directorio desde un programa en Java
 */

public class BorrarDirectorio {
	
	public static void borrarDirectorio (File directorio){
		
		File[] ficheros = directorio.listFiles();
		
		for (int x=0;x<ficheros.length;x++){
			if (ficheros[x].isDirectory()) {
				borrarDirectorio(ficheros[x]);
			}
			ficheros[x].delete();
		}		
	}

	
	public static void main(String[] args) {
		
		String sDirectorio = "c:\\prueba";
		File f = new File(sDirectorio);
		
		borrarDirectorio(f);
		
		if (f.delete())
			System.out.println("El directorio " + sDirectorio + " ha sido borrado correctamente");
		else
			System.out.println("El directorio " + sDirectorio + " no se ha podido borrar");

	}

}
