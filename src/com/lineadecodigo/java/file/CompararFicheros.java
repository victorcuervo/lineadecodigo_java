package com.lineadecodigo.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @file CompararFicheros.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   30/julio/2010
 * @url    http://lineadecodigo.com/java/comparar-el-contenido-de-dos-ficheros-con-java/
 * @description Programa que compara el contenido de dos ficheros
 */


public class CompararFicheros {

	public static void main(String[] args) {
			
		try {
			FileReader fr1 = new FileReader("fichero1.txt");
			FileReader fr2 = new FileReader("fichero2.txt");
			
			BufferedReader bf1 = new BufferedReader(fr1);
			BufferedReader bf2 = new BufferedReader(fr2);
			
			String sCadena1,sCadena2;
			boolean iguales = true;		
			
			sCadena1 = bf1.readLine();
			sCadena2 = bf2.readLine();
			
			while ((sCadena1!=null) && (sCadena2!=null) && iguales) {
				
				if (!sCadena1.equals(sCadena2))
					iguales = false;
				
				sCadena1 = bf1.readLine();
				sCadena2 = bf2.readLine();
				
			} 
			
			if ((iguales) && (sCadena1==null) && (sCadena2==null))
				System.out.println("Los ficheros son iguales");
			else
				System.out.println("Los ficheros son diferentes");
			
			bf1.close();
			bf2.close();
				
			 
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}

	}

}
