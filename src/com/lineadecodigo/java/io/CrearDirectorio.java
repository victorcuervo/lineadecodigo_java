package com.lineadecodigo.java.io;

/**
 * @file CrearDirectorio.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/julio/2007
 * @url    http://lineadecodigo.com/java/crear-un-directorio-con-java-io/
 * @description Creación de directorios mediante la clase File
 */

import java.io.*;

public class CrearDirectorio {

	public static void main(String[] args) {

		 // Creamos el nombre de un directorio mediante un objeto File
		   // El directorio raiz debe de existir -- mkdir --
		   File directorio = new File("c:\\temp\\directorio");

		   if (directorio.mkdir())
		     System.out.println("Se ha creado directorio");
		   else
		     System.out.println("No se ha podido crear el directorio");

		   // El directorio raiz no tiene pq existir -- mkdirs    --
		   File directorio2 = new File("c:\\temp\\directorio\\lineadecodigo\\java_io\\hola");
		   if (directorio2.mkdirs())
		     System.out.println("Se ha creado directorio");
		   else
		     System.out.println("No se ha podido crear el directorio"); 
		
	}

}
