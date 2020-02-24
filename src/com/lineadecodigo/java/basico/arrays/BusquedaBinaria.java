package com.lineadecodigo.java.basico.arrays;

import java.util.Arrays;

/**
 * @file BusquedaBinaria.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/febrero/2020
 * @url    http://lineadecodigo.com/java/busqueda-binaria-con-java/
 * @description Buscar un número en mediante una búsqueda binaria de .binarySearch()
 */

public class BusquedaBinaria {

	public static void main(String[] args) {
		
		int[] numeros = {12,45,67,27,89,84,65,21,44};
		int numberToSearch = 44;
		
		Arrays.sort(numeros);
		
		/* Si está en el array la respuesta es la posición del número en un array ordenado
		 * si no devuelve el número de elementos que ha tenido que recorrer hasta buscarlo 
		 */
		
		if (Arrays.binarySearch(numeros, numberToSearch)>0)
			System.out.println("El número " + numberToSearch + " está en el Array");
		else 
			System.out.println("El número " + numberToSearch + " NO está en el Array");

	}

}
