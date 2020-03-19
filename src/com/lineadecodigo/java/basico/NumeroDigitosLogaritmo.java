package com.lineadecodigo.java.basico;

/**
 * @file NumeroDigitosLogaritmo.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  08/febrero/2020
 * @url    http://lineadecodigo.com/java/digitos-de-un-numero-con-logaritmos/
 * @description Número de dígitos de un número mediante el uso de un Logaritmo
 */

public class NumeroDigitosLogaritmo {

	public static void main(String[] args) {			
		int iNumero = 1234589;
		int length = (int) (Math.log10(iNumero) + 1);
		System.out.println("El número " + iNumero + " cuenta con " + length + " dígitos");
		
	}
	
}
