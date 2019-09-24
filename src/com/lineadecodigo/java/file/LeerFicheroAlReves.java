package com.lineadecodigo.java.file;

/**
 * @file LeerFicheroAlReves.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   01/septiembre/2015
 * @url    http://lineadecodigo.com/java/leer-fichero-al-reves-con-java/
 * @descriptio Código que realiza la lectura de un fichero y lo muestra de forma inversa.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class LeerFicheroAlReves {

	public static void main(String[] args) {
		
		try {
			
			// Lista para almacenar lo leido
			LinkedList<String> list = new LinkedList<String>();
			
			FileReader fr = new FileReader("resources/fichero_lineas.txt");
			BufferedReader bf = new BufferedReader(fr);
			String sCadena;
			while ((sCadena = bf.readLine())!=null) {
				list.add(sCadena);				
			}		
			
			// Cerramos el Buffer
			bf.close();
			
			Iterator<String> it = list.descendingIterator();
			 while(it.hasNext())
			    	System.out.println(it.next());
				
			 
		} catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}

		
		
	}

}
