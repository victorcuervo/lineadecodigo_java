package com.lineadecodigo.java.util;

/**
 * @file CerosALaIzquierda.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date 27/octubre/2009   
 * @url  http://lineadecodigo.com/java/anadir-ceros-a-la-izquierda/
 * @description Añade ceros a la izquierda de un número hasta completar su tamaño.  
 */

import java.util.Formatter;

public class CerosALaIzquierda {

	public static void main(String[] args) {

		int numero = 425;
		int numero2 = 893;
		
		Formatter fmt = new Formatter();
		fmt.format("%08d",numero);
		System.out.println("El numero formateado " + fmt);
		
		fmt.format("Primer número %1$08d - Segundo número %2$08d ",numero,numero2);
		System.out.println(fmt);
		

	}

}
