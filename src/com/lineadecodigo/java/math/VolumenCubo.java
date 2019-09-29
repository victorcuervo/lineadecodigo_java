package com.lineadecodigo.java.math;

/**
 * @file VolumenCubo.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   21/septiembre/2009
 * @url    http://lineadecodigo.com/java/calcular-el-volumen-de-un-cubo-con-java/
 * @description Ejemplo que calcula el volumen de un cubo con Java.
 */

import java.util.Scanner;

public class VolumenCubo {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		double iArista;
		double iVolumen;

		System.out.println("Introduce el valor de la arista del cubo");
		iArista = reader.nextDouble();
		
		iVolumen = Math.pow(iArista, 3);
		 
		System.out.println("El volumen de un cubo de arista " + Double.toString(iArista) + " es de " + Double.toString(iVolumen));
		
		reader.close();

	}

}
