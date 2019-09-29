package com.lineadecodigo.java.math;

/**
 * @file NumeroAzarDeUnConjunto.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   7/septiembre/2007
 * @url    http://lineadecodigo.com/java/numero-aleatorio-de-un-conjunto-con-javamath/
 * @description Obtener un numero aleatorio de un conjunto acotado.  
 */

public class NumeroAzarDeUnConjunto {
	
	public static void main(String[] args) {
	
	
		int numeros[] = {2,4,6,8,10};
		
		for (int x=0;x<100;x++){
			int cual = numeroAleatorio(0,numeros.length);
			System.out.println(numeros[cual]);
		}
		
		

	}
	
	public static int numeroAleatorio(int inicio,int cantidadNumeros){
		return (int) (Math.random()*cantidadNumeros+inicio);
	}

}
