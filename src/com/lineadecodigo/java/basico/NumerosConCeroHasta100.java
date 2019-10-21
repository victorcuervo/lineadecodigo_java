package com.lineadecodigo.java.basico;

/**
 * @file NumerosConCeroHasta100.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/octubre/2019
 * @url    http://lineadecodigo.com/java/numeros-que-contengan-un-cero/
 * @description Listas los números del 1 al 100 que contengan, al menos, un cero.
 */

public class NumerosConCeroHasta100 {
	
		public static void main(String[] args) {
		
			for (int x=1;x<=100;x++) {
				if (x%10 == 0)
					System.out.println(x);
			}
			
		}

}
