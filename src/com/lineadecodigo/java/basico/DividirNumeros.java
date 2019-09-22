package com.lineadecodigo.java.basico;

import java.util.Scanner;

/**
 * @file DividirNumeros.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/junio/2010
 * @url    http://lineadecodigo.com/java/dividir-dos-numeros-con-java/
 * @description Dividir dos números insertados por teclado 
 */

public class DividirNumeros {

	public static void main(String[] args) {
		
		float numero1 = 0;
		float numero2 = 0;
		float resultado;

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");			
		numero1 = reader.nextFloat();
			
		System.out.println("Introduce el segundo número:");
		numero2 = reader.nextFloat();
			
		// Dividimos
		resultado = numero1/numero2;
		
		System.out.println("La división es " + numero1 + " / " + numero2 + " = " + resultado);
		
		// Cerramos el stream de lectura
		reader.close();
			
	}

}
