package com.lineadecodigo.java.math;

/**
 * @file NaipeBaraja.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/septiembre/2010
 * @url    http://lineadecodigo.com/java/sacar-un-naipe-de-la-baraja/
 * @description Sacar un naipe de la baraja de forma aleatoria.  
 */

public class NaipeBaraja {
	
	public static void main(String[] args) {
		
		String[] palo = {"Picas","Corazones","Diamantes","Tréboles"};
		String[] carta = {"as","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","jota","reina","rey"};
		
		int iPalo = (int)(Math.random()*4);
		int iCarta = (int)(Math.random()*13);
					
		System.out.println("La carta aleatoria es " + carta[iCarta] + " de " + palo[iPalo]);

	}

}
