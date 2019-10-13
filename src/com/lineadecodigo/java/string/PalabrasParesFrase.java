package com.lineadecodigo.java.string;

import java.util.StringTokenizer;

/**
 * @file PalabrasPares.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/octubre/2019
 * @url    http://lineadecodigo.com/java/palabras-pares-de-una-frase-con-java/
 * @description Extraer las palabras pares de una cadena
 */

public class PalabrasParesFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sCadena = "Esto es una cadena que contiene palabras y de las que quiero extraer las palabras pares";
		StringTokenizer st = new StringTokenizer(sCadena);
		int iContador = 1;
		
		while (st.hasMoreElements()) {
			if (iContador%2 == 0)
				System.out.println(st.nextElement());
			else
				st.nextElement();
			
			iContador++;
		}
		

	}

}
