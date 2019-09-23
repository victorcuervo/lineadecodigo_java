package com.lineadecodigo.java.basico.arrays;

/**
 * @file CopiarDosArraysEnUno.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/octubre/2007
 * @url    http://lineadecodigo.com/java/copiar-dos-arrays-en-uno-con-java
 * @description Uso del método .arrayCopy para copiar dos arrays sobre uno.  
 */

public class CopiarDosArraysEnUno {


	public static void main(String[] args) {

		int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,10};
		int a[] = new int[a1.length+a2.length];
	
		System.arraycopy(a1, 0, a, 0, a1.length);
		
		// Listamos el array y vemos que los últimos 5 elementos están a 0
		System.out.println("Array tras la primera copia");
		listarArray(a);
				
		System.arraycopy(a2, 0, a, a1.length, a2.length);
		
		System.out.println("Array tras la segunda copia");
		listarArray(a);
	}

	 public static void listarArray (int[] a){ 
	   for (int x=0;x<a.length;x++){
	     System.out.println(a[x]);
	   } 
	 }
	
	
}
