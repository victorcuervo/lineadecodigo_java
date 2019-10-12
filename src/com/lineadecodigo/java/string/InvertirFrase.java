package com.lineadecodigo.java.string;

/**
 * @file InvertirFrase.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  18/octubre/2009
 * @url    http://lineadecodigo.com/java/invertir-una-frase-en-java/
 * @description Uso de una pila para invertir una frase. 
 */

import java.util.Stack;
import java.util.StringTokenizer;

public class InvertirFrase {

	public static void main(String[] args) {

		// Cadena de texto
	    String sTexto = "En un lugar de la mancha de cuyo nombre no quiero acordarme";
	    System.out.println(sTexto);
	    
	    // Particionador
	    StringTokenizer frase = new StringTokenizer(sTexto);
	    
	    // Pila
	    Stack<String> pila = new Stack<String>();
	    
	    while (frase.hasMoreTokens()) {
	    	pila.push(frase.nextToken());
	    }
	    
	    while (!pila.empty())
			System.out.print(pila.pop() + " ");
	    

	}

}
