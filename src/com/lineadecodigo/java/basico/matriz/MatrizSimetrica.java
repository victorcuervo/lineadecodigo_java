package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatrizSimétrica.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/matriz-simetrica-con-java/
 * @description Calcular si la matriz es simétrica. Es decir la matríz es igual a la transpuesta
 */


public class MatrizSimetrica {

	public static void main(String[] args) {
		
		int[][] m1 = {{1,2,3},{2,3,1},{3,1,2}};
		
		System.out.println("--Matriz Inicial--");
		Matriz.imprimir(m1);
		
		System.out.println("--Matriz Transpuesta--");
		int[][] m2 = Matriz.transponer(m1);
		Matriz.imprimir(m2);
		
		if (Matriz.equals(m1, m2))
			System.out.println("La matriz es una matriz simétrica");
		else
			System.out.println("La matriz NO es una matriz simétrica");
		

	}

}
