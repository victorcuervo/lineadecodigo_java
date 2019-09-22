package com.lineadecodigo.java.basico;

/**
 * @file NumeroImpar.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/diciembre/2006
 * @url  http://lineadecodigo.com/java/numeros-impares-en-java/
 * @description Código que nos ayuda a saber si un número es impar con Java
 */

public class NumeroImpar {
	
	public static boolean esImpar(int iNumero) {
		  if (iNumero%2!=0)
		    return true;
		  else
		    return false;
		}

	public static void main(String[] args) {
		
		for (int x=1;x<=100;x++) {
			  if (esImpar(x))
			    System.out.println(x);
		}
		
		int contador = 0;
		int incremento = 1;

		while (contador !=100) {
		  
			if (esImpar(incremento)) {
				System.out.println(incremento);
				contador++;
			}
			
			incremento++;
		  
		}
		
	}

}
