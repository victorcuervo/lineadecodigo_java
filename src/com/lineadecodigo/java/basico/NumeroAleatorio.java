package com.lineadecodigo.java.basico;

/**
 * @file NumeroAleatorio.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   25/marzo/2007
 * @url    http://lineadecodigo.com/java/numero-aleatorio-en-java/
 * @description Código para generar número aleatorios en Java entre 1 y 25 
 */


public class NumeroAleatorio {

	public static void main(String[] args) {

		int numeroAleatorio = (int) (Math.random()*25+1);
		System.out.println("El número aleatorio entre 1 y 25 es: " + numeroAleatorio);
			
	}

}
