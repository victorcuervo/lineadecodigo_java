package com.lineadecodigo.java.basico.arrays;

/**
 * @file NumerosMismaPosicion.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/febrero/2021
 * @url    http://lineadecodigo.com/java/pdte/
 * @description Ver que números están en la misma posición de 2 arrays
 */

public class NumerosMismaPosicion {

	public static void main(String[] args) {

		int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,1,3,1,5};
        
        for (int x=0;x<a1.length;x++) {
            if (a1[x] == a2[x]) {
                System.out.println("El número " + a1[x] + " en la posición " + x);
            }
        }	
	
	}

}
