package com.lineadecodigo.java.basico;

/**
 * @file Multiplos.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  17/septiembre/2007
 * @url    http://lineadecodigo.com/java/multiplo-de-un-numero-en-java/
 * @description Calcular los múltiplos de un número 
 */

public class Multiplos {


	public static void main(String[] args) {
		
		// Operación básica
		
		int resto;
		int numero1 = 21;
		int numero2 = 3;

		resto = numero1%numero2;

		if (resto==0)
		  System.out.println(numero1 + " es múltiplo de " + numero2);
		else
		  System.out.println(numero1 + " NO es múltiplo de " + numero2);

		
		// Listar los multiplos de un número
		// Multiplos de 21
		int multiplo = 240;
		System.out.print("Los multiplos de " + multiplo + " son");
		for (int x=1;x<multiplo;x++){
			if (esMultiplo(multiplo,x)){
				System.out.print(" " + x);
			}
		}
				
		
		
	}
	
	
	public static boolean esMultiplo(int n1,int n2){
		if (n1%n2==0)
			return true;
		else
			return false;
	}

}
