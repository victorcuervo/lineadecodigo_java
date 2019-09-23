package com.lineadecodigo.java.basico.arrays;

/**
 * @file RotarArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   20/septiembre/2010
 * @url    http://lineadecodigo.com/java/rotar-array/
 * @description Código que nos permite rotar los elementos de un array.
 */

public class RotarArray {
	
	public static void main(String[] args) {
		
		int[] numeros = {1,2,3,4,5};
				
		for (int x=0;x<numeros.length;x++) {			
			imprimir(numeros);
			rotar(numeros);		
		}
		

	}
	
	public static int[] rotar(int[] numeros){
		
		int primero = numeros[0];
		int x;
		
		for(x= 0; x<numeros.length-1; x++)
			numeros[x] = numeros[x+1];
		
		numeros[x]= primero;
		
		return numeros;
		
		
	}
	
	public static void imprimir(int[] numeros){
		
		for (int numero:numeros)
			System.out.println(numero);
		
		System.out.println("-----");
		
	}

}
