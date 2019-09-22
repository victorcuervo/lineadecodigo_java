package com.lineadecodigo.java.basico;

/**
 * @file NumeroAzar.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  8/abril/2007
 * @url    http://lineadecodigo.com/2007/04/08/numero-al-azar-en-java/
 * @description Juego que consiste en acertar un número aleatorio generado al azar. 
 */

import java.io.IOException;

public class NumeroAzar {

	public static void main(String[] args) throws IOException {

	    int numeroAleatorio,numeroTeclado;
	    int cero = (int)'0';
	    numeroAleatorio = (int) (Math.random()*10+1);
	    
	    do {

	      System.out.println("Dame un numero entre 1 y 10: ");
	      numeroTeclado = System.in.read();
	      System.in.skip(2);

	      numeroTeclado = numeroTeclado - cero;

	      if (numeroTeclado > numeroAleatorio) {
	         System.out.println ("El número buscado es menor");
	      }

	      if (numeroTeclado < numeroAleatorio) {
	         System.out.println ("El número buscado es mayor");
	      }

	    } while (numeroTeclado != numeroAleatorio);

	    System.out.println ("Felicidades, acertaste el número");
		
		
	}

}
