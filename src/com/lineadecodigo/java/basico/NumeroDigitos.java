package com.lineadecodigo.java.basico;

/**
 * @file NumeroDigitos.java
 * @version 2.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date  14-mayo-2011
 * @url    http://lineadecodigo.com/java/digitos-de-un-numero/
 * @description Código que nos dice cuántos dígitos tiene un número
 * 					v2	-	Incluido el calculo mediante un bucle. 
 */

public class NumeroDigitos {

	public static void main(String[] args) {			
		int iNumero = 123458;
		String x = Integer.toString(iNumero);
		System.out.println(iNumero + " tiene " + x.length() + " dígitos");
		
		int iCantidad = 0;
		int iTemp = iNumero;
		
		while (iTemp>0){
			iTemp = iTemp/10;
			iCantidad++;
		}
		
		System.out.println(iNumero + " tiene " + iCantidad + " dígitos");
		
	}
	
}
