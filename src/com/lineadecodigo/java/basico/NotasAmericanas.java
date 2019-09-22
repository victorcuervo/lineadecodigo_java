package com.lineadecodigo.java.basico;

/**
 * @file NotasAmericanas.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/abril/2007
 * @url    http://lineadecodigo.com/java/notas-americanas/
 * @description Programa de aprendizaje que muestra como convertir las notas americanas en las españolas. Utilización de bucles do-while y estructuras selectivas switch. 
 */

import java.io.IOException;

public class NotasAmericanas {


	public static void main(String[] args) throws IOException {		   
		char caracter;
		long nota;
		
		System.out.println("Introduce tu nota americana: ");

		do{
	    
			nota=System.in.read();
			System.in.skip (2);
	                   
			caracter=(char)nota;
	   
			switch (caracter){
				case 'A': System.out.println ("sobresaliente");
							break;
				case 'B': System.out.println ("notable");
							break;
				case 'C': System.out.println ("aprobado");
							break;
				case 'D': System.out.println ("insuficiente");
							break;
				case 'E': System.out.println ("muy deficiente");
							break;
				default:  System.out.println ("esta puntuación no existe");
			}                                                      
		} while (caracter!='0');
	}

}
