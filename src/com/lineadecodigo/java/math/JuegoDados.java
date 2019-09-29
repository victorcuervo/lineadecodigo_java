package com.lineadecodigo.java.math;

/**
 * @file JuegoDados.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   02/octubre/2010
 * @url    http://lineadecodigo.com/java/juego-de-los-dados/
 * @description Dos personas apuestan a los dados con las siguientes reglas: Cada uno arroja un dado en cada jugada. El que saca mayor puntaje en la jugada aumenta su puntaje en 5 puntos, pero si hay empate en la jugada no se anotan puntos. El partido lo gana el que obtenga una ventaja de 15 puntos. (Las ventajas se comparan después de haber analizado los resultados de ambas jugadas). 
 */

import java.util.Scanner;

public class JuegoDados {
	
	public static void main(String[] args) {
	
		String jugador1, jugador2;
		int puntosj1 = 0;
		int puntosj2 = 0;
		int jugadaj1, jugadaj2;
		Scanner reader = new Scanner(System.in);
		
		// Jugadores
		System.out.println("Como se llama el jugador 1");
		jugador1 = reader.next();
		
		System.out.println("Como se llama el jugador 2");
		jugador2 = reader.next();
		
		// Empezamos a jugar
		
		
		while ((puntosj1-puntosj2 < 15) && (puntosj2-puntosj1 < 15)) {		
			
			jugadaj1 = (int) (Math.random()*6+1);
			jugadaj2 = (int) (Math.random()*6+1);
			
			System.out.println(jugador1 + " ha sacado " + jugadaj1);
			System.out.println(jugador2 + " ha sacado " + jugadaj2);
			
			
			if (jugadaj1>jugadaj2) {
				puntosj1 += 5;
				System.out.println("Gana " + jugador1);
			} else if (jugadaj1<jugadaj2) {
				puntosj2 += 5;
				System.out.println("Gana " + jugador2);
			} else {
				System.out.println("Empate. No se reparten puntos");
			}
			
			System.out.println("Tanteo " + puntosj1 + "-" + puntosj2);
		} 
		
	
		if (puntosj1 > puntosj2)
			System.out.println("Gana " + jugador1 + " con " + puntosj1 + " puntos");
		else
			System.out.println("Gana " + jugador2 + " con " + puntosj2 + " puntos");
		
		reader.close();

	}

}