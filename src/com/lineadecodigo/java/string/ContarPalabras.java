package com.lineadecodigo.java.string;

/* 
* @file ContarPalabras.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   03/junio/2015
* @url    http://lineadecodigo.com/java/contar-palabras-en-java/
* @description Código que cuenta las palabras que hay en una frase
*/

import java.util.StringTokenizer;

public class ContarPalabras {
	
  public static void main(java.lang.String[] args) {

	    // Cadena de texto
	    String sTexto = "En un lugar de la mancha";

	    // Particionador
	    StringTokenizer stTexto = new StringTokenizer(sTexto);

	    //Volcamos el número de palabras separadas
	    System.out.println ("El numero de palabras de la frase \"" + sTexto + "\" son " +  stTexto.countTokens() );
  }

}
