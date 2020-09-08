package com.lineadecodigo.java.basico.arrays;

import java.util.stream.IntStream;

/**
 * @file BusquedaLineal.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/febrero/2020
 * @url    http://lineadecodigo.com/java/busqueda-en-un-array-con-streams/
 * @description Realizar una búsqueda mediante Streams de Java 8
 */

public class BusquedaConStreams {
		
	private static boolean searchNumber(int[] numbers, int numberToSearch) {		
		return IntStream.of(numbers).anyMatch(x -> x == numberToSearch); 	
	}

	public static void main(String[] args) {

		int[] numeros = {12,45,67,27,89,84,65,21,44};
		int numberToSearch = 27;

		if (searchNumber(numeros,numberToSearch))
			System.out.println("El número " + numberToSearch + " está en la lista");
		else
			System.out.println("El número " + numberToSearch + " NO está en la lista");
		
	}

}
