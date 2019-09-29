package com.lineadecodigo.java.math;

/**
 * @file AreaPentagono.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   2/octubre/2010
 * @url    http://lineadecodigo.com/java/area-de-un-pentagono-en-java/
 * @description Calcular el área de un pentagono con Java  
 */

import java.util.Scanner;

public class AreaPentagono {

	public static void main(String[] args) {

		double lado,radio,apotema,area;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Dame el lado del pentagono. Si no lo conoces teclea 0");
		lado = reader.nextDouble();
		
		System.out.println("Dame el radio del pentagono. Si no lo conoces teclea 0");
		radio = reader.nextDouble();
		
		System.out.println("Dame el apotema del pentagono. Si no lo conoces teclea 0");
		apotema = reader.nextDouble();
		
		if ((radio == 0) && (apotema == 0)){
			area = 1.72048 * Math.pow(lado,2);
		} else if (apotema == 0) {
			apotema = Math.sqrt(Math.pow(radio, 2)-Math.pow(lado/2, 2));
			area = ((lado*5)*apotema)/2;
		} else {
			area = ((lado*5)*apotema)/2;
		}

		System.out.println("El área del pentagono es " + area);
		
		
		reader.close();
		

	}

}
