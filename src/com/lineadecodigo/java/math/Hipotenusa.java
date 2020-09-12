package com.lineadecodigo.java.math;

/**
 * @file Hipotenusa.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/febrero/2007
 * @url    http://lineadecodigo.com/java/calcular-la-hipotenusa-con-java/
 * @description Utilización del método hypot para calcular la hipotenusa de un triangulo.  
 */

public class Hipotenusa {


	public static void main(String[] args) {

		// Triangulo de lado 3 y lado 2
		
		// Mediante el teorema de pitagoras "la suma de los cuadrados de los catetos es igual al cuadrado de la hipotenusa:"
		double hypo = 0;
		double cateto1 = 2;
		double cateto2 = 3;
		hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("La hipotenusa de un triangulo de lados "+cateto1+" y "+cateto2+" es " + hypo);
		
		// Con el método hypot
		System.out.println("La hipotenusa de un triangulo de lados "+cateto1+" y "+cateto2+" es " + Math.hypot(cateto1, cateto2));

	}

}
