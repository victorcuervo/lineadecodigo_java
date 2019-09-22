package com.lineadecodigo.java.basico;

/**
 * @file ParametrosVariables.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   08/septiembre/2015
 * @url  http://lineadecodigo.com/java/parametros-variables-en-java/
 * @description Implementar un método con parámetros variables
 */

public class ParametrosVariables {
	
	public static int sumar(int... numeros) {
		int suma = 0;
		for (int x=0;x<numeros.length;x++)
			suma += numeros[x];
		return suma;
	}

	public static void main(String[] args) {
		
		System.out.println(sumar(2,3,4,5));
		System.out.println(sumar(2,2));

	}

}
