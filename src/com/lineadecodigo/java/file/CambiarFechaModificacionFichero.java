package com.lineadecodigo.java.file;

/**
 * @file CambiarFechaModificacionFichero.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   24/febrero/2012
 * @url    http://lineadecodigo.com/java/cambiar-la-fecha-de-modificacion-de-un-fichero-con-java/
 * @description Cambiar la fecha de modificación de un fichero
 */

import java.io.File;

public class CambiarFechaModificacionFichero {

	public static void main(String[] args) {

		File fichero = new File("test.txt");
		long ms = System.currentTimeMillis();
		boolean cambio = fichero.setLastModified(ms);

		if (cambio)
			System.out.println("Se ha cambiado la hora del sistema satisfactoriamente");
		else
			System.out.println("NO se ha podido cambiar la hora");			 
			
	}

}
