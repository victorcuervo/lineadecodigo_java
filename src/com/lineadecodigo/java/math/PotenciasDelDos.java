package com.lineadecodigo.java.math;

/**
 * @file PotenciasDelDos.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/enero/2009
 * @url    http://lineadecodigo.com/java/potencias-del-dos-con-java/
 * @description Listado de potencias del 2. 
 */

public class PotenciasDelDos {

	public static void main(String[] args) {

		int iNumeroPotencias = 10;
		
		System.out.println("Potencias del dos");
		
		for (int x=0;x<=iNumeroPotencias;x++)
			System.out.println("2 elevado a " + x + " igual a " + (int)Math.pow(2,x));

	}

}
