package com.lineadecodigo.java.basico;

/**
 * @file FactorialDeUnNumeroFor.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/septiembre/2017
 * @url    http://lineadecodigo.com/java/factorial-java-bucle-for/
 * @description Calcular un factorial mediante un bucle for
 */

public class FactorialDeUnNumeroFor {


	public static void main(String[] args) {
		
		// Numero del que queremos calcular el factorial
		int iNumero = 4;

		// Variable con el valor del factorial
		int iFactorial = 1;

		
		for (int x=2;x<=iNumero;x++)
			iFactorial = iFactorial * x;
		
		System.out.println("El factorial del número " + Integer.toString(iNumero) +  " es " + Integer.toString(iFactorial));
		
	}	
}
