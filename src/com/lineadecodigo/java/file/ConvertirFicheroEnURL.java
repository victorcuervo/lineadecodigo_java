package com.lineadecodigo.java.file;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @file ConvertirFicheroEnURL.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/septiembre/2011
 * @url    http://lineadecodigo.com/java/convertir-de-fichero-a-url-con-java/
 * @description Convertir la ruta de un fichero en una ruta URL
 * 		v1.1 - El método .toURL está deprecado, se cambia para utilizar el .toURI() 
 */

public class ConvertirFicheroEnURL {

	public static void main(String[] args) {
		
		File fichero = new File("test.txt");		
		URL url = null;
		
		// Mejor trabajar con URLs que con ficheros
		// La idea es acceder a una URL y abrir un stream y así todo es igual
		
		
		try {		    
		    url = fichero.toURI().toURL();
		    System.out.println(url.toString());		
		
		    File fichero2 = new File(url.getFile());
		    System.out.println(fichero2.toString());
		    
		} catch (MalformedURLException e) {}
	}

}
