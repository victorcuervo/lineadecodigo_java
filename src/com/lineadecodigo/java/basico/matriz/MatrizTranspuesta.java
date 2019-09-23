package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatrizTranspuesta.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/transponer-una-matriz-en-java/
 * @description Clase que realiza la transposición de una matriz. Es decir convierte sus filas en columnas
 */

public class MatrizTranspuesta {

	public static void imprimir(int[][] matriz) {
		for (int x=0; x < matriz.length; x++) {
            System.out.print("|");
            for (int y=0; y < matriz[x].length; y++) {
                    System.out.print (matriz[x][y]);
                    if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
		}
	}
	
	public static int[][] transponer(int[][] matriz) {
		
		int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];
		
		for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            		nuevaMatriz[y][x] = matriz[x][y];
            }
		}
		
		return nuevaMatriz;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definimos una matriz de 3x3
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("Matriz Inicial");
		imprimir(matriz);
		
		System.out.println("Matriz Invertida");
		int [][] nMatriz = transponer(matriz);
		imprimir(nMatriz);

	}

}
