package com.lineadecodigo.java.basico.matriz;

/**
 * @file CrearMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   08/julio/2010
 * @url    http://lineadecodigo.com/java/crear-una-matriz-en-java/
 * @description Programa que nos permite crear una matriz con Java
 */

public class CrearMatriz {

	public static void main(String[] args) {

		// Creamos una matriz de 3x3
		int matriz[][] = new int[3][3];
		
		// Inicializamos los valores de la matriz
		matriz[0][0] = 2;
		matriz[0][1] = 4;
		matriz[0][2] = 4;
		matriz[1][0] = 6;
		matriz[1][1] = 6;
		matriz[1][2] = 9;
		matriz[2][0] = 8;
		matriz[2][1] = 10;
		matriz[2][2] = 12;
		
		// Recorremos la matriz
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println (matriz[x][y]);
			}
		}
		
		
		
	}

}
