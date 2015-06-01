package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file ListarFicherosOcultos.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   4/mayo/2012
 * @url    http://lineadecodigo.com/java/listar-ficheros-ocultos-de-un-directorio-con-java/
 * @description Clase que lista los ficheros ocultos de un directorio
 */

public class ListarFicherosOcultos {

	public static void main(String[] args) {
		
		String sDirectorio = "d:\\test";
		File f = new File(sDirectorio);
		
		System.out.println("Listando ficheros ocultos de " + sDirectorio);
		System.out.println("-----------------------------");
		
		if (f.exists()){
			File[] ficheros = f.listFiles();
			for (int x=0;x<ficheros.length;x++){
				if (ficheros[x].isHidden())
					System.out.println(ficheros[x].getName());
			}
		} else{
			System.out.println("No existe ese directorio");
		}
		
		
		
	}

}
