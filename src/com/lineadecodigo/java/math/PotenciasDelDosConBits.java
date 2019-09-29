package com.lineadecodigo.java.math;

/**
 * @file PotenciasDelDosConBits.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/enero/2009
 * @url    http://lineadecodigo.com/2009/01/27/potencias-del-dos-con-desplazamiento-de-bits/
 * @description Listado de potencias del 2 mediante el desplazamiento de bits 
 */

public class PotenciasDelDosConBits {

	public static void main(String[] args) {
	
		int iNumeroPotencias = 10;
		
		System.out.println("Potencias del dos");
		
		for (int x=0;x<=iNumeroPotencias;x++)
			System.out.println("2 elevado a " + x + " igual a " + (1 << x));

		
	}

}
