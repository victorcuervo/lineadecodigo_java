package com.lineadecodigo.java.basico;

/**
 * @file FactorialDeUnNumero.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   27.marzo.2011
 * @url    http://lineadecodigo.com/java/factorial-de-un-numero/
 * @description Calculo de un factorial  
 */

public class FactorialDeUnNumero {

	public static int factorial(int x){
	
		// Factorial recursivo
		if (x==1)
			return 1;
		else
		    return x * factorial(x-1);		
	}	
	
	public static void main(String[] args) {
		
		// Numero del que queremos sacar el factorial
		int iNumero = 4;
		
		int iFactorial = 1;
		int iContador = iNumero;
		
		while (iContador != 0) {			
			iFactorial = iFactorial * iContador;
			iContador--;
		}
		
		System.out.println("El factorial del número " + Integer.toString(iNumero) +  " es " + Integer.toString(iFactorial));		;
		System.out.println("El factorial del número " + Integer.toString(iNumero) +  " es " + Integer.toString(factorial(iNumero)));
		
	}	
}
