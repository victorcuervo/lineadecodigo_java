package com.lineadecodigo.java.basico.arrays;

/**
 * @file BusquedaLineal.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/febrero/2020
 * @url    http://lineadecodigo.com/java/pdte/
 * @description Implementación de una búsqueda lineal con Java
 */

public class BusquedaLineal {
		
	private static boolean searchNumber(int[] numbers, int numberToSearch) {
		for (int number:numbers) {
			if (number==numberToSearch) {
				return true;
			}
		}
		return false;

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
