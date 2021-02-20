package com.lineadecodigo.java.basico.arrays;

/**
 * @file NumerosMismaPosicion.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2021
 * @url    http://lineadecodigo.com/java/numeros-en-la-misma-posicion-de-dos-arrays/
 * @description Ver que números están en la misma posición de 2 arrays
 */

public class NumerosMismaPosicion {

	public static void main(String[] args) {

		int[] a1 = {1,2,3,4,5,7,9};
        int[] a2 = {1,1,3,1,5,6};

        int tamanio = (a1.length<a2.length)?a1.length:a2.length;
        
        for (int x=0;x<tamanio;x++) {
            if (a1[x] == a2[x]) {
                System.out.println("El número " + a1[x] + " en la posición " + x);
            }
        }	
	
	}

}
