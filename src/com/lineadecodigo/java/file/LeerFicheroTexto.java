package com.lineadecodigo.java.file;

/**
 * @file LeerFichero.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   29-abril-2006
 * @url    http://lineadecodigo.com/2006/12/26/leer-fichero-de-texto-con-java/
 * @descriptio Lectura del contenido de un fichero de texto
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroTexto {

	public static void main(String[] args) {
		
		try {
		
			FileReader fr = new FileReader("fichero.txt");
			BufferedReader bf = new BufferedReader(fr);
			String sCadena;
			while ((sCadena = bf.readLine())!=null) {
				System.out.println(sCadena);
			}
			
			bf.close();
				
			 
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}

		
	}

}
