package com.lineadecodigo.java.file;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @file VaciarContenidoFichero.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31-julio-2010
 * @url    http://lineadecodigo.com/java/vaciar-el-contenido-de-un-fichero-con-java/
 * @description Vaciar el contenido de un fichero mediante la escritura de una cadena vacía.  
 */

public class VaciarContenidoFichero {

	public static void main(String[] args) {

		String sFichero = "fichero1.txt";

		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
			bw.write("");
			bw.close();
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}				
	}
		

}
