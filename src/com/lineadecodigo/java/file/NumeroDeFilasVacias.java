package com.lineadecodigo.java.file;

/**
 * @file NumeroDeFilasVacias.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/septiembre/2015
 * @url    http://lineadecodigo.com/java/numero-de-lineas-vacias-de-un-fichero/
 * @description Código que recorre un fichero y lee sus filas para contablizar las que están vacías.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumeroDeFilasVacias {

	public static void main(String[] args) {
		
		
		
		try {
			FileReader fr = new FileReader("resources/fichero.txt");
		
			BufferedReader bf = new BufferedReader(fr);
			
			String sCadena = "";
			long lNumeroLineasVacias = 0;
			
			while ((sCadena = bf.readLine())!=null) {
				if (sCadena.isEmpty())
					lNumeroLineasVacias++;
			}
			
			System.out.println("El fichero tiene " + lNumeroLineasVacias + " lineas vacías");
			
			bf.close();
			
		} catch (FileNotFoundException fnfe){
			  fnfe.printStackTrace();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}
		
		
		
	}

}
