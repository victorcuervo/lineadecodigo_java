package com.lineadecodigo.java.file;

/**
 * @file NumeroDeFilasStream.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/septiembre/2015
 * @url    http://lineadecodigo.com/java/numero-de-lineas-de-un-fichero-con-un-stream/
 * @description Uso de la programación funcional y de un Stream para calcular el número de filas de un fichero.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumeroDeFilasStream {

	public static void main(String[] args) {
				
		try {
			FileReader fr = new FileReader("resources/fichero.txt");
		
			BufferedReader bf = new BufferedReader(fr);
		
			System.out.println("El fichero tiene " + bf.lines().count() + " lineas");
			
			bf.close();
			
		} catch (FileNotFoundException fnfe){
			  fnfe.printStackTrace();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}
		
		
	}

}
