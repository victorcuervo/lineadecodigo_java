package com.lineadecodigo.java.file;

/**
 * @file NumeroDeFilasVaciasStream.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/septiembre/2015
 * @url    http://lineadecodigo.com/java/lineas-vacias-de-un-fichero-con-un-stream/
 * @description Calcular el número de filas que hay en un fichero mediante programación funcional y un Stream.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumeroDeFilasVaciasStream {

	public static void main(String[] args) {
		
		long lNumeroLineasVacias = 0;
		
		try {
			FileReader fr = new FileReader("resources/fichero.txt");
		
			BufferedReader bf = new BufferedReader(fr);
			
			long vacias = bf.lines().filter(l -> l.isEmpty()).count();
			
			
			
			System.out.println(vacias);
			
			/*
			
			String sCadena = "";
			
			
			
			
			while ((sCadena = bf.readLine())!=null) {
				if (sCadena.isEmpty())
					lNumeroLineasVacias++;
			}
			
			*/
			
			bf.close();
			
		} catch (FileNotFoundException fnfe){
			  fnfe.printStackTrace();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}
		
		System.out.println("El fichero tiene " + lNumeroLineasVacias + " lineas vacías");
		
	}

}
