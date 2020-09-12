package com.lineadecodigo.java.basico.arrays;

/**
 * @file BuscarEnArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   09/febrero/2020
 * @url    http://lineadecodigo.com/java/buscar-en-un-array/
 * @description Buscar un elemento en un array
 */

import java.util.Arrays;

public class BuscarEnArray {
	
	private static boolean searchList(String[] strings, String searchString) {
	    return Arrays.asList(strings)
	      .contains(searchString);
	}

	public static void main(String[] args) {

		String[] nombres = {"Marta","Ana","Luis","Rodrigo","Virginia"};

		if (searchList(nombres,"Fernando"))
			System.out.println("Valor en la lista");
		else
			System.out.println("Valor no encontrado");
		
	}

}
