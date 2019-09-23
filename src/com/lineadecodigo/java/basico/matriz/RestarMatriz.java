package com.lineadecodigo.java.basico.matriz;

/**
 * @file RestarMatriz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   19/julio/2015
 * @url    http://lineadecodigo.com/java/restar-matrices-en-java/
 * @description Clase que realiza una resta de matrices.
 */


public class RestarMatriz {

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
		
		int[][] matriz1 = {{1,2,3},{4,5,6}};
		int[][] matriz2 = {{6,5,4},{3,2,1}};
		
		
		int[][] resultado = new int[matriz1.length][matriz1[0].length];
		
		for (int x=0; x < resultado.length; x++) {
            for (int y=0; y < resultado[x].length; y++) {
            		resultado [x][y] = matriz1[x][y] - matriz2[x][y];
            }
		}
		
		imprimir(resultado);
		

	}

}
