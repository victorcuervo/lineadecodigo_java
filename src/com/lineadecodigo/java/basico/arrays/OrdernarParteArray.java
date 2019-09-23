package com.lineadecodigo.java.basico.arrays;

import java.util.Arrays;

/**
 * @file OrdenarParteArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/marzo/2016
 * @url    http://lineadecodigo.com/java/ordenar-parte-array/
 * @description Código que ordena parte de un array
 */

public class OrdernarParteArray {
	
	public static void main(String[] args) {
		
		int[] numeros = {7,4,5,2,1,10,8};

		imprimir(numeros);
		Arrays.sort(numeros,0,4);	
		imprimir(numeros);
		
	}
	
	
	public static void imprimir(int[] numeros){
		
		for (int numero:numeros)
			System.out.println(numero);
		
		System.out.println("-----");
		
	}

}
