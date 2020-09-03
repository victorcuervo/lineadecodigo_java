package com.lineadecodigo.java.basico.arrays;

/**
 * @file BuscarNumeroEnArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/febrero/2020
 * @url    http://lineadecodigo.com/java/buscar-un-numero-en-un-array/
 * @description Buscar un número en un array
 */

import java.util.Arrays;

public class BuscarNumeroEnArray {
	
	private static boolean searchNumber(int[] numbers, int numberToSearch) {
	    return Arrays.asList(numbers)
	      .contains(numberToSearch);
	}

	public static void main(String[] args) {

		int[] numeros = {1,2,3,4,5,6,7,8};
		int numberToSearch = 3;

		if (searchNumber(numeros,numberToSearch))
			System.out.println("El número " + numberToSearch + " está en la lista");
		else
			System.out.println("El número " + numberToSearch + " NO está en la lista");
		
	}

}
