package com.lineadecodigo.java.basico;

/**
 * @file SumatorioDeUnNumero.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/junio/2007
 * @url    http://lineadecodigo.com/java/sumatorio-de-un-numero-en-java/
 * @description Utilización de un bucle para calcular el sumatorio de un número en Java.  
 */

public class SumatorioDeUnNumero {

	public static void main(String[] args) {
	
		int iNumero = 5;
		int iSumatorio = 0;
		int iContador = iNumero;
		
		while (iContador != 0) {
		   
		  iSumatorio = iSumatorio + iContador;
		  iContador--;
		 
		}
		
		System.out.println("El sumatorio de " + iNumero + " es " + iSumatorio);

	}

}
