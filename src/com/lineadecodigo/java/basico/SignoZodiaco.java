package com.lineadecodigo.java.basico;

import java.util.Scanner;


/**
 * @file SignoZodiaco.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   6/agosto/2010
 * @url    http://lineadecodigo.com/java/calcular-signo-del-zodiaco-con-java/
 * @description Programa que dada una fecha nos ayuda a saber cuál es nuestro signo del zodiaco. Utilización de swith. 
 */

public class SignoZodiaco {

	public static void main(String[] args) {


		int dia = 1;
		int mes = 1;
		
		Scanner reader = new Scanner(System.in);

		System.out.println("Qué díaa naciste");
		dia = reader.nextInt();
	
		System.out.println("Qué mes naciste");
		mes = reader.nextInt();
		
		switch(mes) {		
			case 1: 
				if (dia>=21)
					System.out.println("Acuario");
				else
					System.out.println("Capricornio");				
				break;
			case 2:
				if (dia>=20)
					System.out.println("Piscis");
				else
					System.out.println("Acuario");
				break;
			case 3:
				if (dia>=21)
					System.out.println("Aries");
				else
					System.out.println("Piscis");
				break;
			case 4:
				if (dia>=21)
					System.out.println("Tauro");
				else
					System.out.println("Aries");
				break;
			case 5:
				if (dia>=21)
					System.out.println("Geminis");
				else
					System.out.println("Tauro");
				break;
			case 6:
				if (dia>=21)
					System.out.println("Cancer");
				else
					System.out.println("Geminis");
				break;
			case 7:
				if (dia>=23)
					System.out.println("Leo");
				else
					System.out.println("Cancer");
				break;
			case 8:
				if (dia>=23)
					System.out.println("Virgo");
				else
					System.out.println("Leo");
				break;
			case 9:
				if (dia>=23)
					System.out.println("Libra");
				else
					System.out.println("Virgo");
				break;
			case 10:
				if (dia>=23)
					System.out.println("Escorpio");
				else
					System.out.println("Libra");
				break;
			case 11:
				if (dia>=23)
					System.out.println("Sagitario");
				else
					System.out.println("Escorpio");
				break;
			case 12:
				if (dia>=22)
					System.out.println("Capricornio");
				else
					System.out.println("Sagitario");
				break;	
			default:
				System.out.println("Mes no existente");
		}
		
		reader.close();
		

	}

}
