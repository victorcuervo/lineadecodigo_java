package com.lineadecodigo.java.basico.matriz;

/**
 * @file Matriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19.julio.2015
 * @url    http://lineadecodigo.com/tag/java-array-matriz/
 * @description Clase Estática que nos permite manipular matrices
 * 					- Imprimir Matriz por pantalla
 * 					- Generar Matriz con números aleatorios
 * 					- Invertir una Matriz
 * 					- Transponer una Matriz
 * 					- Ver si dos matrices son iguales
 * 					- Suma de Matrices
 * 					- Resta de Matrices
 * 					- Multiplicación de Matrices
 * 					- Matriz por un Escalar
 * 					- Matriz por Vector Columna
 * 					- Validar si una Matriz es Simétrica
 * 					- Validar si una Matriz es Antisimétrica
 */

import java.util.Arrays;

public class Matriz {
		
	// Imprimir una matriz por pantalla
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
	
	
	// Matriz cargada con números aleatorios
	public static int[][] aleatoria (int filas,int columnas) {
		
		int matriz[][] = new int[filas][columnas];
		
		for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            		matriz[x][y] = (int) (Math.random()*9+1);
            }
		}
		
		return matriz;
	}
	
	// Matriz Negativa
	public static int[][] negativa (int[][] m1) {
		
		int matriz[][] = new int[m1.length][m1[0].length];
		
		for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            		matriz[x][y] = -m1[x][y];
            }
		}
		
		return matriz;
	}
	
	
	
	// Transponer una matriz. Es decir, convertir sus filas en columnas.
	public static int[][] transponer(int[][] matriz) {
		
		int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];
		
		for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
            		nuevaMatriz[y][x] = matriz[x][y];
            }
		}
		
		return nuevaMatriz;
		
	}
	
	// Igualdad de Matrices
	public static boolean equals(int[][] m1, int[][] m2) {
		if (Arrays.deepEquals(m1, m2))
			return true;
		else
			return false;
	
	}
	
	
	// Restar Matrices
	public static int[][] resta (int[][] m1,int[][] m2) {

		int[][] resultado = new int[m1.length][m2[0].length];
		
		for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
            		resultado [x][y] = m1[x][y] - m2[x][y];
            }
		}
		return resultado;
	}
	
	// Suma Matrices
	public static int[][] sumar (int[][] m1,int[][] m2) {

		int[][] resultado = new int[m1.length][m2[0].length];
		
		for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
            		resultado [x][y] = m1[x][y] + m2[x][y];
            }
		}
		return resultado;
	}
	
	
	// Multiplica Matrices
	public static int[][] multiplicar (int[][] m1,int[][] m2) {
		
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
		
		return multiplicacion;
		
	}
	

	// Multiplica una matriz por un vector
	public static int[][] matrizPorVector (int[][] m1,int[] v) {

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
		
		return multiplicacion;
	}
	
	public static int[][] matrizPorEscalar(int[][] m,int escalar) {
		
		
		for (int x=0; x < m.length; x++) {
            for (int y=0; y < m[x].length; y++) {
            	m[x][y] = escalar * m[x][y];
            }
		}
		
		return m;
	}
	
	
	
	// Calcula si una matriz es AtinSimétrica. Es decir que coincidan su inversa con su transpuesta
	public static boolean esAntiSimetrica(int[][] m){
		
		int[][] mi = Matriz.negativa(m);
		int[][] mt = Matriz.transponer(m);
		
		if (Arrays.deepEquals(mi, mt))
			return true;
		else
			return false;	
	
	}
	
	
	// Calcula si una matriz es Simétrica. Es decir que es igual la matriz y su transpuesta
	public static boolean esSimetrica(int[][] m) {
		
		int[][] mt = Matriz.transponer(m);
		
		if (Matriz.equals(m, mt))
			return true;
		else
			return false;
	}
	

}
