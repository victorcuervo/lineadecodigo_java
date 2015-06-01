package com.lineadecodigo.java.basico.arrays;

import java.util.Scanner;

/**
 * @file RellenarMatriz.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   01/abril/2010
 * @url    http://lineadecodigo.com/java/cargar-una-matriz-por-teclado-en-java/
 * @description Programa que nos permite cargar una matriz con Java por teclado
 */

public class RellenarMatriz {

	public static void main(String[] args) {

		// Creamos una matriz de 3x3
		int matriz[][] = new int[3][3];		
		Scanner consola = new Scanner(System.in);	
		
		// Recorremos la matriz para cargarla
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println("Introduzca el elemento [" + x + "," + y + "]");
				matriz[x][y] = consola.nextInt();
			}
		}
				
		// Listamos la matriz
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
			}
		}
		
		
	}

}
