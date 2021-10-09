package com.lineadecodigo.java.basico;

/**
 * @file FactorialDeUnNumerotexto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/octubre/2021
 * @url    http://lineadecodigo.com/java/factorial-de-un-numero-en-texto/
 * @description Calcular un factorial y poner el resultado como cadena
 */

public class FactorialDeUnNumeroTexto {


	public static void main(String[] args) {
		
		// Numero del que queremos calcular el factorial
		int iNumero = 5;

		// Variable con el valor del factorial
		int iFactorial = 1;

		// Cadena con la salida
		String sCadena = Integer.toString(iNumero) + "! = 1";
		
		for (int x=2;x<=iNumero;x++) {
			iFactorial = iFactorial * x;
			sCadena = sCadena + " x " + Integer.toString(x);
		}
		
		System.out.println(sCadena + " = " + Integer.toString(iFactorial));



		
	}	
}
