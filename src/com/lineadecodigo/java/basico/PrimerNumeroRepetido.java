package com.lineadecodigo.java.basico;

/**
 * @file PrimerNumeroRepetido.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  01/noviembre/2007
 * @url   http://lineadecodigo.com/2007/11/01/primer-numero-repetido/
 * @description Calcular cual es el primer número que aparece repetido en un array. 
 */

public class PrimerNumeroRepetido {

	public static void main(String[] args) {

		// Inicializamos un array de números
	   int[] listaNumeros = {1,4,7,8,9,2,7,15,4,6,9,9,8};
	   int[] listaNumerosLeidos = new int[listaNumeros.length];


	   int x=0;
	   int y=0;
	   boolean bEncontrado = false;
	   
	   while((x<listaNumeros.length) && (bEncontrado != true)){ 
	   
	     // Con el numero le busco por la lista de leidos
	     // Si esta me salgo del bucle. Sino, le incluyo en
	     // la lista de leidos y sigo
	   
	     y = 0;
	     while ((y<listaNumerosLeidos.length) && (bEncontrado != true)){
	   
	       if (listaNumeros[x] == listaNumerosLeidos[y])
	         bEncontrado = true; 
	   
	       y++;
	     }
	   
	     if (!bEncontrado)
	       listaNumerosLeidos[x] = listaNumeros[x];
	   
	     x++;
	   }
	   
	   if (bEncontrado)
	     System.out.println("El primer número repetido es el " + listaNumeros[x-1]);
	   else
	     System.out.println("No hay ningún elemento repetido");
	   		
	}

}
