package com.lineadecodigo.java.basico.arrays;

import java.util.Arrays;

/**
 * @file BusquedaBinariaImplementada.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/febrero/2020
 * @url    http://lineadecodigo.com/java/implementar-una-busqueda-binaria-con-java/
 * @description Implementación en Java de una búsqueda binaria.
 * 
 * 	Dado un array ordenado se busca el número desde la primera posición.
 * 	si no coincide con el número búscado se búsca en la mitad en la que puede estar.
 * 	Buscando nuevamente desde el elemento del medio.
 */

public class BusquedaBinariaImplementada {

	public static boolean binarySearch(int[] numbers, int numberToSearch) {
		
		int size = numbers.length;  // Número de elementos
		int middle = size/2;		// Mitad del array
		
		System.out.println("Size: " + size);
		System.out.println("Middle: " + middle);
		System.out.println("Array: " + Arrays.toString(numbers));
		
		if (numbers[middle] == numberToSearch)
			return true;
		else if (size == 1)
			return false;
		else if (numbers[middle] > numberToSearch)
			return binarySearch(Arrays.copyOfRange(numbers,0,middle),numberToSearch);
 		else
			return binarySearch(Arrays.copyOfRange(numbers,middle+1,size),numberToSearch);		
	}
	
	
	public static void main(String[] args) {
		
		int[] numeros = {12,45,67,27,89,84,65,21,44};
		int numberToSearch = 12;
		
		Arrays.sort(numeros);
		
		/* Si está en el array la respuesta es la posición del número en un array ordenado
		 * si no devuelve el número de elementos que ha tenido que recorrer hasta buscarlo 
		 */
		
		if (binarySearch(numeros, numberToSearch))
			System.out.println("El número " + numberToSearch + " está en el Array");
		else 
			System.out.println("El número " + numberToSearch + " NO está en el Array");

	}

}
