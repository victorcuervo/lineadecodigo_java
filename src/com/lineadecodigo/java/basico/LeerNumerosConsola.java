package com.lineadecodigo.java.basico;

/**
 * @file LeerNumerosConsola.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   18/octubre/2016
 * @url    http://lineadecodigo.com/java/leer-numeros-teclado-java/
 * @description Lee números por consola y genera una suma.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LeerNumerosConsola {

	public static void main(String[] args) {
		
		
		List<Integer> lista = new ArrayList<Integer>();
				
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce números. El cero para salir");			
		
		int numero = 0;
		
		do {			
			
			try {
				numero = reader.nextInt();
				lista.add(numero);
			} catch (InputMismatchException ime){
				System.out.println("¡Cuidado! Solo puedes insertar números. ");
				// Eliminamos el valor que no queríamos
				reader.next();
			}
						
			
		} while (numero!=0);	
		
		int suma = 0;
		for(int num:lista){
			suma += num;
		}
		
		System.out.println("La suma de los números es " + suma);
		
		reader.close();

	}

}
