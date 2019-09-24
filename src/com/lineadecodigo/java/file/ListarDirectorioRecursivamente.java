package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file ListarDirectorioRecursivamente.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   26/diciembre/2008
 * @url    http://lineadecodigo.com/java/listar-un-directorio-de-forma-recursiva-en-java
 * @description Lista el contenido de un directorio de forma recursiva, de tal forma que vayamos conociendo el contenido de sus directorios anidados.
 */

public class ListarDirectorioRecursivamente {

	
	public static void listarDirectorio(File f, String separador){
		File[] ficheros = f.listFiles();
				
		for (int x=0;x<ficheros.length;x++){			
			System.out.println(separador + ficheros[x].getName());
			
			if (ficheros[x].isDirectory()){
				String nuevo_separador;
				nuevo_separador = separador + " ";
				listarDirectorio(ficheros[x],nuevo_separador);
			}
		}	
	}
	
	
	public static void main(String[] args) {
		
		String sDirectorio = "c:\\windows";
		File directorio = new File(sDirectorio);
		
		listarDirectorio(directorio,"");

	}

}
