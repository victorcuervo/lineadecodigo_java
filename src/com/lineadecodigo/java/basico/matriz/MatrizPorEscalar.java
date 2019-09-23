package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatrizPorEscalar.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/multiplicar-una-matriz-por-un-escalar-en-java/
 * @description Clase que realiza una multiplicación de una matriz por un escalar
 */


public class MatrizPorEscalar {
	public static void main(String[] args) {

		int[][] m1 = {{1,0,2},{-1,3,1}};
		int n = 2;
		
		int [][] resultado = new int[m1.length][m1[0].length];
		
		for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
            	resultado[x][y] = n * m1[x][y];
            }
		}
		
		Matriz.imprimir(resultado);
		
	}

}
