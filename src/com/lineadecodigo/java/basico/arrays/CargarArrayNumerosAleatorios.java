package com.lineadecodigo.java.basico.arrays;

/**
 * @file CargarArrayNumerosAleatorios.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/junio/2015
 * @url    http://lineadecodigo.com/java/llenar-un-array-con-numeros-aleatorios-en-java/
 * @description Cargar un array con números aleatorios
 */

public class CargarArrayNumerosAleatorios {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		// Cargamos el array con los números aleatorios
		for (int x=0;x<numeros.length;x++)
			numeros[x] = (int) (Math.random()*20)+1;
		
		// Listar el array
		for (int x=0;x<numeros.length;x++)
			System.out.println(numeros[x]);		

	}

}
