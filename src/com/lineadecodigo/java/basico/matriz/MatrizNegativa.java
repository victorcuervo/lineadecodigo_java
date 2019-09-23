package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatrizNegativa.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   1/agosto/2015
 * @url    http://lineadecodigo.com/java/matriz-negativa-con-java/
 * @description Código que genera una matriz negativa cambiado en signo a todos los elementos de la matriz.
 */

public class MatrizNegativa {

	public static void main(String[] args) {
		
		int[][] m = {{0,-2,4},{2,0,2},{-4,-2,0}};
		
		System.out.println("Matriz Inicial");
		Matriz.imprimir(m);
		
		for (int x=0; x < m.length; x++) {
            for (int y=0; y < m[x].length; y++) {
            		m[x][y] = -m[x][y];
            }
		}

		System.out.println("Matriz Negativa");
		Matriz.imprimir(m);
		
	}

}
