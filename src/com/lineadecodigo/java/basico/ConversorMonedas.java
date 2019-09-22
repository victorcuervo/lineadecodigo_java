package com.lineadecodigo.java.basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @file ConversorMonedas.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   5/agosto/2010
 * @url    http://lineadecodigo.com/java/conversor-de-monedas/
 * @description Programa que nos ayuda a realizar la conversión monetaria entre dos monedas. 
 */

public class ConversorMonedas {

	public static void main(String[] args) {

		float tasa = 485.336F; // 1 dolar son 485,336 pesos chilenos
		float monedaorigen = 0;
		float monedadestino = 0;
		BufferedReader br;			
		
		br = new BufferedReader(new InputStreamReader(System.in));
				
		try{ 
			// Conversor de dolares a pesos
			System.out.println("Cuantos dolares tienes?");			
			monedaorigen = Float.parseFloat(br.readLine());
					
			monedadestino = monedaorigen*tasa;
		
			System.out.println(monedaorigen + " dolares equivalen a " + monedadestino + " pesos chilenos");
			
			
			// Conversor de pesos a dolares
			System.out.println("Cuantos pesos chilenos tienes?");			
			monedaorigen = Float.parseFloat(br.readLine());
					
			monedadestino = monedaorigen/tasa;
		
			System.out.println(monedaorigen + " pesos chilenos equivalen a " + monedadestino + " dolares");
			
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

}
