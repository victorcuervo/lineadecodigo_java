package com.lineadecodigo.java.basico.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @file NumeroEnArray.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/septiembre/2019
 * @url    http://lineadecodigo.com/java/adivinar-numeros-con-java/
 * @description Código que nos permite almacenar 10 números y luego chequear con el usuario si adivina los números introducidos.
 */

public class NumeroEnArray {

	public static void main(String[] args) {
		ArrayList<Integer> misnumeros = new ArrayList<Integer>(10);

		Scanner reader = new Scanner(System.in);  

		for (int x=0;x<10;x++) {
			System.out.println("Inserte un número");
			misnumeros.add(reader.nextInt());
		}

		// Listado

		System.out.println("Has cargado los siguientes números");

		for (int x=0;x<misnumeros.size();x++){
			System.out.println(misnumeros.get(x));
		}

		System.out.println("Busca un número, 0 para salir");

		int numeroBuscar = reader.nextInt();  

		while (numeroBuscar!=0) {
			if (misnumeros.contains(numeroBuscar)) {
				System.out.println("Contiene el número " + numeroBuscar);
			} else {
				System.out.println("No contiene el número " + numeroBuscar);
			}

			System.out.println("Busca un número, 0 para salir");

			numeroBuscar = reader.nextInt();
		}

		System.out.println("Fin del juego");
		
		reader.close();


	}

}
