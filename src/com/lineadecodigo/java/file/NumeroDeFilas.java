package com.lineadecodigo.java.file;

/**
 * @file NumeroDeFilas.java
 * @version 1.0
 * @authorVíctor Cuervo (http://lineadecodigo.com)
 * @date   20/noviembre/2006
 * @url    http://lineadecodigo.com/java/numero-de-lineas-de-un-fichero/
 * @description Código que cuenta las filas de un fichero
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumeroDeFilas {

	public static void main(String[] args) {
		
		long lNumeroLineas = 0;
		
		try {
			FileReader fr = new FileReader("resources/fichero.txt");
		
			BufferedReader bf = new BufferedReader(fr);
			
			while ((bf.readLine())!=null) {
			  lNumeroLineas++;
			}
			
			bf.close();
			
		} catch (FileNotFoundException fnfe){
			  fnfe.printStackTrace();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}
		
		System.out.println("El fichero tiene " + lNumeroLineas + " lineas");
		
	}

}
