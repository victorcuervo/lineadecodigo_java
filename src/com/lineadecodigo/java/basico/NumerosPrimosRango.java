package com.lineadecodigo.java.basico;

/**
 * @file NumerosPrimosRango.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  17/septiembre/2017
 * @url    http://lineadecodigo.com/java/numeros-primos-rango-java/
 * @description Listar los números primos de un rango
 */

public class NumerosPrimosRango {

	public static boolean esPrimo(int numero){
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero)){
		  if (numero % contador == 0)
		    primo = false;
		  contador++;
		}
		return primo;
	}	
	
	public static void main(String[] args) {
		
		int iInicioRango = 50;
		int iFinRango = 97;
		
		for (int x=iInicioRango;x<=iFinRango;x++) {
			if (esPrimo(x))
				System.out.print(x + " ");				
		}		
		
	}

}
