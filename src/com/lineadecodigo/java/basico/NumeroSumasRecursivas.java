package com.lineadecodigo.java.basico;

/**
 * @file NumeroSumasRecursivas.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  18/febrero/2016
 * @url    http://lineadecodigo.com/java/numero-en-sumas-de-unidades-recursivo/
 * @description Sacar las sumas de un número mediante recursividad
 */

public class NumeroSumasRecursivas {
	
	public static void suma(int numero, int operador) {
		
		int resta = numero-operador;
			
		if (resta>=operador) {
			System.out.println(numero + " = " + resta + " + " + operador);
			suma(numero,++operador);
		}
		
	}

	public static void main(String[] args) {
		
		// Con un bucle
		int numero = 12;
		int unidad = 0;
		int resta = numero;
		
		while (resta>unidad) {
			resta = numero-unidad;
			System.out.println (numero + " = " + resta + " + " + unidad);
			unidad++;					
		}
			
		
		// Recursivo
		suma(12,0);

	}

}
