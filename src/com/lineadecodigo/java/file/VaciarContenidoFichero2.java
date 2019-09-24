package com.lineadecodigo.java.file;

import java.io.File;
import java.io.IOException;

/**
 * @file VaciarContenidoFichero2.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31-julio-2010
 * @url    http://lineadecodigo.com/java/vaciar-el-contenido-de-un-fichero-mediante-borrado-y-creacion/
 * @description Vaciar el contenido de un fichero borrandolo y volviéndolo a crear. 
 */

public class VaciarContenidoFichero2 {

	public static void main(String[] args) {

		String sFichero = "fichero1.txt";
		File f = new File(sFichero);
		
		// Borramos el fichero
		f.delete();
		try {
			f.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
		
	}
		

}
