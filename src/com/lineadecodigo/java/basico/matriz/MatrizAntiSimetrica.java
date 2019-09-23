package com.lineadecodigo.java.basico.matriz;

/**
 * @file MatrizAnsiSimetrica.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/matriz-antisimetrica-en-java/
 * @description Código que calcula si una matriz es antisimetrica. Es decir que su transpuesta coincida con la negativa.
 */


import java.util.Arrays;

public class MatrizAntiSimetrica {


	public static void main(String[] args) {

		int[][] m = {{0,-2,4},{2,0,2},{-4,-2,0}};
		
		//int[][] m = Matriz.aleatoria(2, 2);
		
		System.out.println("Matriz");
		Matriz.imprimir(m);

		System.out.println("Matriz Inversa");
		int[][] mn = Matriz.negativa(m);
		Matriz.imprimir(mn);
		
		System.out.println("Matriz Transpuesta");
		int[][] mt = Matriz.transponer(m);
		Matriz.imprimir(mt);
		
		if (Arrays.deepEquals(mn, mt))
			System.out.println("Es una Matriz Antisimétrica");
		else
			System.out.println("No es una Matriz Antisimétrica");
		
		
		if (Matriz.esAntiSimetrica(m))
			System.out.println("Es una Matriz Antisimétrica");
		else
			System.out.println("No es una Matriz Antisimétrica");
		
		

	}

}
