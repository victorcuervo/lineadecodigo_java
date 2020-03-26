package com.lineadecodigo.java.basico.arrays;

/**
 * @file ArrayTamanioDinamico.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   8/febrero/2020
 * @url    http://lineadecodigo.com/java/arrays-dinamicos-en-java/
 * @description Dar un tamaño al Array atendiendo al dato que nos de el usuario por consola.
 */

import java.util.Scanner;

public class ArrayTamanioDinamico {

	public static void main(String[] args) {
		
		System.out.println("Dime el tamaño del Array");
		Scanner reader = new Scanner(System.in);
		int x= reader.nextInt();
		int[] elementos = new int[x];


		try {
			elementos[4] = 12;
			System.out.println(elementos[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array creado muy pequeño");
		}  finally {
			reader.close();
		}

	}

}
