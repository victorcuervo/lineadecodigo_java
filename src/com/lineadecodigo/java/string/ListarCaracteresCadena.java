package com.lineadecodigo.java.string;

/**
 * @file ListarCaracteresCadena.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/octubre/2007
 * @url    http://lineadecodigo.com/java/listar-caracteres-de-una-cadena-con-java/
 * @description Listar caracter a caracter de una cadena de texto.  
 */


public class ListarCaracteresCadena {

	public static void main(String[] args) {

	   String s = "En un lugar de la Mancha...";
	   
	   System.out.println("Vamos a desglosar la siguiente cadena de texto en caracteres");
	   System.out.println("Cadena de texto: " + s);
	   System.out.println("Caracteres");
	   
	   for (int x=0;x<s.length();x++)
	      System.out.println("Caracter " + x + ": " + s.charAt(x));	
		
	}

}
