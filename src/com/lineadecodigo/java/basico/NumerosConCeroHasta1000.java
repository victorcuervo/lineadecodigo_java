package com.lineadecodigo.java.basico;

/**
 * @file NumerosConCeroHasta1000.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/octubre/2019
 * @url    http://lineadecodigo.com/java/xxxx/
 * @description Listas los números del 1 al 1000 que contengan, al menos, un cero. Y sin utilizar operciones de cadena
 */

public class NumerosConCeroHasta1000 {
	
		public static void main(String[] args) {
			
			for (int x=1;x<=1000;x++) {
				if ((x%10 == 0) || ((x>100) && (x/10%10 == 0)))
					System.out.println(x);
			}
			
		}

}
