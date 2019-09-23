package com.lineadecodigo.java.basico.matriz;

/**
 * @file MultiplicarMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/multiplicar-matrices-en-java/
 * @description Clase que realiza una multiplicación de matrices en Java
 */

public class MultiplicarMatriz {

	public static void main(String[] args) {
		
		int[][] m1 = {{1,0,2},{-1,3,1}};
		int[][] m2 = {{3,1},{2,1},{1,0}};
		
		// Para multiplicar deben de coincidir las columnas de la m1 con las filas de la m2
		
		int fil_m1 = m1.length;
		int col_m1 = m1[0].length;
		
		int fil_m2 = m2.length;
		int col_m2 = m2[0].length;
		
		if (col_m1 != fil_m2)
			throw new RuntimeException("No se pueden multiplicar las matrices");
		
		// La nueva matriz es de filas de M1 y columnas de M2
		int[][] multiplicacion = new int[fil_m1][col_m2];
		
		for (int x=0; x < multiplicacion.length; x++) {
            for (int y=0; y < multiplicacion[x].length; y++) {
            		
            		// El nuevo bucle suma la multiplicación de la fila por la columna
            		for (int z=0; z<col_m1; z++) {
            			multiplicacion [x][y] += m1[x][z]*m2[z][y];            			
            		}
            }
		}
		
		Matriz.imprimir(multiplicacion);
		

	}

}
