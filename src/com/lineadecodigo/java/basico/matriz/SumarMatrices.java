package com.lineadecodigo.java.basico.matriz;

/**
 * @file SumarMatrices.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   28/julio/2010
 * @url    http://lineadecodigo.com/java/sumar-matrices-en-java/
 * @description Programa que suma dos matrices en Java
 */

public class SumarMatrices {

	
	public static void pintarmatriz(int[][] matriz){
		for (int x=0; x < matriz.length; x++) {
			for (int y=0; y < matriz[x].length; y++) {
				System.out.println (matriz[x][y]);
			}
		}	
	}
	
	public static int[][] sumarmatrices (int[][] m1,int[][] m2) throws Exception {
		
		// Comprobamos que las matrices son de la misma dimensión
		if ((m1.length == m2.length) && (m1[0].length==m2[0].length)){
				
			int[][] suma = new int[m1.length][m1[0].length];
			
			for (int x=0; x < m1.length; x++) {
				for (int y=0; y < m1[x].length; y++) {				
					suma[x][y]=m1[x][y]+m2[x][y];								
				}
			}			
			return suma;
		} else
			throw new Exception();
		
	}
	
	
	
	public static void main(String[] args) {

		// Matrices
		int [][] matriz1 = {{2,4,4},{6,6,9}};
		int [][] matriz2 = {{2,4,4},{6,6,9}};
		int [][] matriz = new int[3][3];
		
		try {
			matriz = sumarmatrices(matriz1,matriz2);
			pintarmatriz(matriz);
		} catch(Exception e){
			System.out.println("Matrices de diferente dimensión");
		}
		
		
	}

}
