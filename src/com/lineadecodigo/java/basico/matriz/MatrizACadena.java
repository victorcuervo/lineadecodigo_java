package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatricesACadena.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/convertir-matriz-en-cadena-con-java/
 * @description Convertir el contenido de una matriz en una cadena Java.
 */

import java.util.Arrays;

public class MatrizACadena {

	public static void main(String[] args) {
		
		
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

		System.out.println("Volcado normal con toString");
		System.out.println(matriz.toString());
		
		System.out.println("Volcado mediante un deepToString");
		System.out.println(Arrays.deepToString(matriz));
		
		
	}

}
