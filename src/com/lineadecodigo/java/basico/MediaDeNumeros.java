package com.lineadecodigo.java.basico;

/**
 * @file MediaDeNumeros.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/abril/2007
 * @url    http://lineadecodigo.com/java/calcular-media-de-numeros-con-java/
 * @description Utilización de arrays para el calculo de la media de una secuencia de numeros  
 */


public class MediaDeNumeros {

	public static void main(String[] args) {
		// Declaramos el Array de 10 elementos.
		int array[] = {12,34,56,4,3,2,1,8,9,10};
		double media = 0.0;
		   
		// Presentamos por pantalla los caracteres introducidos
		for (int i=0; i < array.length; i++) {
		  media = media + array[i];
		}
		   
		media = media / array.length;
		System.out.println("La media de los numeros es " + media);   
		
	}

}
