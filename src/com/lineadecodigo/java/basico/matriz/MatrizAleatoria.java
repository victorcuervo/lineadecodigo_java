package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatricesAleatoria.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/matriz-aleatoria-en-java/
 * @description Código que genera una matriz de tamaño y contenido aleatorio
 */

public class MatrizAleatoria {
	
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

	public static void main(String[] args) {
		
		
		// Matriz de 5x5
		//int matriz[][] = new int[5][5];
		
		// Matriz de tamaño aleatorio
		int matriz[][] = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];
		
		
		for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            		matriz[x][y] = (int) (Math.random()*9+1);
            }
		}
		
		imprimir(matriz);

	}

}
