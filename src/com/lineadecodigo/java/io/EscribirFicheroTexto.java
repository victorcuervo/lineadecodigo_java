package com.lineadecodigo.java.io;

/**
 * @file EscribirEnFicheroProperties.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date 05/febrero/2007
 * @url   http://lineadecodigo.com/java/escribir-en-un-fichero-de-texto-con-java/
 * @description Escribir contenido sobre un fichero de texto  
 */

import java.io.*;

public class EscribirFicheroTexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Validamos si existe el fichero
		String sFichero = "fichero.txt";
		File fichero = new File(sFichero);

		if (fichero.exists())
  	          System.out.println("El fichero " + sFichero 
			+ " ya existe");
		else {
			try{
			  BufferedWriter bw = 
			    new BufferedWriter(new FileWriter(sFichero));
		
		   	  // Escribimos 10 filas
			  for (int x=0;x<10;x++)
			 	bw.write("Fila numero " + x + "\n");

			  // Hay que cerrar el fichero
			  bw.close();
			} catch (IOException ioe){
				ioe.printStackTrace();
			}
		}

	}

}
