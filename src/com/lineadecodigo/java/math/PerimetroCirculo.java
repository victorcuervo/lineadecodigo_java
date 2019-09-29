package com.lineadecodigo.java.math;

/**
 * @file PerimetroCirculo.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date 18/septiembre/2010
 * @url   http://lineadecodigo.com/java/calcular-el-perimetro-de-un-circulo-con-java/
 * @description Programa que calcula el perímetro de un círculo
 */

import java.util.Scanner;

public class PerimetroCirculo {

	public static void main(String[] args) {

		double perimetro,radio;
		
		System.out.println("Introduce el rádio del círculo: ");
		Scanner reader = new Scanner(System.in);
		radio = reader.nextDouble();
		
		perimetro = 2*Math.PI*radio;
		
		System.out.println("Un círculo de rádio " + radio + "tiene un perímetro de " + perimetro);
		
		reader.close();

	}

}
