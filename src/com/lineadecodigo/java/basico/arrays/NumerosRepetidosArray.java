package com.lineadecodigo.java.basico.arrays;

/**
 * @file NumerosRepetidosArrayy.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   29/enero/2014
 * @url    http://lineadecodigo.com/java/numeros-repetidos-en-un-array-java/
 * @description Localizar los nœmeros repetidos de un array en otro. 
 */

public class NumerosRepetidosArray {

	public static void main(String[] args) {

	int numeros[] = {1,2,3,4};
	int lista[]= {2,4,5,2,4,4,4,3,4,2,3};
	boolean encontrado;
	int iter;

	
	for (int x=0;x<numeros.length;x++) {
		
		encontrado = false;
		iter = 0; // Iterador
		
		while ((!encontrado) && (iter < lista.length)) {
			if (lista[iter] == numeros[x])
				encontrado = true;
			iter++;
		}
	
		if (encontrado)
			System.out.println (numeros[x] + " es un nœmero repetido. Encontrado en " + iter + " bœsquedas");
		else
			System.out.println (numeros[x] + " no est‡ en la lista. No encontrado en " + iter + " bœsquedas");
			
	}
	
	
	}

}
