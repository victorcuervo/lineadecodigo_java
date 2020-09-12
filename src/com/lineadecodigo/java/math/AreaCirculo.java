package com.lineadecodigo.java.math;

/**
 * @file AreaCirculo.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   21/diciembre/2006
 * @url    http://lineadecodigo.com/java/area-de-un-circulo-en-java/
 * @description Uso de la clase Math para el calculo del area de un circulo  
 */

public class AreaCirculo {

	public static void main(String[] args) {
		
		double radio = 6;
		double area;
		
		area = 3.1416 * Math.pow(radio,2);
		System.out.println("El área de un circulo de radio "+radio+" es "+area);
		
		area = Math.PI * Math.pow(radio,2);
		System.out.println("El área de un circulo de radio "+radio+" es "+area);

	}

}
