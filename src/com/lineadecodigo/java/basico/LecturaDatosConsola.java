package com.lineadecodigo.java.basico;


/**
 * @file LecturaDatosConsola.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   7/octubre/2007
 * @url    http://lineadecodigo.com/java/lectura-de-datos-por-consola-en-java/
 * @description Utilización de un buffer para leer datos del usuario por consola.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaDatosConsola {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		String sTexto = "";
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			do {
			  sTexto = br.readLine();
			  System.out.println(sTexto);
			} while(!sTexto.equals("FIN"));
		} catch (IOException io){
			io.printStackTrace();
		}


	}

}
