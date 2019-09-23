package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatrizPorVector.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/multiplicar-matriz-por-vector-columna-en-java/
 * @description Ejemplo que realiza una multiplicación de una matríz por un vector columna.
 */


public class MatrizPorVector {

	public static void main(String[] args) {
		
		
		// A la hora de crear una multiplicación de Matriz por Vector Columna
		// Puedo realmente crear un vector Columna
		int[][] m1 = {{1,0,2},{-1,3,1}};
		int[][] m2 = {{3},{2},{1}};
		
		int[][] resultado = new int[m1.length][m2[0].length];
		
		resultado = Matriz.multiplicar(m1, m2);
		Matriz.imprimir(resultado);
		
		
		// O bien que el vector sea eso, un vector
		int[] v = {3,2,1};
		
		
		int fil_m1 = m1.length;
		int col_m1 = m1[0].length;
		
		int fil_m2 = v.length;
		int col_m2 = 1;
		
		if (col_m1 != fil_m2)
			throw new RuntimeException("No se pueden multiplicar las matrices");
		
		// La nueva matriz es de filas de M1 y columnas de M2
		int[][] multiplicacion = new int[fil_m1][col_m2];
		
		for (int x=0; x < multiplicacion.length; x++) {
            for (int y=0; y < multiplicacion[x].length; y++) {
            		
            		// El nuevo bucle suma la multiplicación de la fila por la columna
            		for (int z=0; z<col_m1; z++) {
            			multiplicacion [x][y] += m1[x][z]*v[z];
            		}
            }
		}
		
		Matriz.imprimir(multiplicacion);

	}

}
