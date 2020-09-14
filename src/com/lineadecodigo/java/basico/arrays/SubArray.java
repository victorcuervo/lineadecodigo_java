package com.lineadecodigo.java.basico.arrays;

import java.util.Arrays;

/**
 * @file SubArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/marzo/2020
 * @url    http://lineadecodigo.com/java/subarray-en-java/
 * @description Obtener una parte de un array en un nuevo array.
 */

public class SubArray {
	
	public static<T> T[] subarray (T[] array, int inicio, int fin) {
		return Arrays.copyOfRange(array,inicio-1,fin);
	}

	public static void main(String[] args) {

		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};		
		Integer[] parcial = subarray(numeros,1,4);
		
		for (int x=0;x<parcial.length;x++){
			System.out.println(parcial[x]);
		}		
		
	}

}
