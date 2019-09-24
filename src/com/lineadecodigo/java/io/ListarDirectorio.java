package com.lineadecodigo.java.io;

/**
 * @file ListarDirectorio.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   8/julio/07
 * @url    http://lineadecodigo.com/java/listar-un-directorio-con-java-io/
 * @description Listar un directorio apoyandonos en la clase File de Java IO.  
 */

import java.io.File;

public class ListarDirectorio {

	
	public static void main(String[] args) {
		File dir = new File("c:\\winnt");
		   
		String[] ficheros = dir.list();
		   
		   
		if (ficheros == null)
			System.out.println("No hay ficheros en el directorio especificado");
		else { 
			for (int x=0;x<ficheros.length;x++){
				System.out.println(ficheros[x]);
			}
		}

	}

}
