package com.lineadecodigo.java.math;

/**
 * @file NumeroPI.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/julio/2007
 * @url    http://lineadecodigo.com/java/numero-pi-en-java/
 * @description Uso de la constante PI mediante la librería Java Math 
 */

public class NumeroPI {

	public static void main(String[] args) {

		double radio = 5.0;
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área del círculo con radio " + radio + " es: " + area);

		System.out.println("El valor del número PI es " + Math.PI);
	}

}
