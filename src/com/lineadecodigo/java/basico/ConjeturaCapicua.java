package com.lineadecodigo.java.basico;

/**
 * @file ConjeturaCapicua.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   22/junio/2009
 * @url  http://lineadecodigo.com/java/la-conjetura-capicua-con-java/
 * @description Como aplicar la conjetura capicua con Java. Mediante la suma de números.  
 */

import java.util.Scanner;

public class ConjeturaCapicua {
	
	static public long invertirNumero(long numero){
	
		long falta,numeroInvertido,resto;

		falta=numero;	
		numeroInvertido=0;
		resto=0;
		
		// El código que viene a continuación da la vuelta a un numero
		while(falta!=0)
		{
		 resto=falta%10;
		 numeroInvertido=numeroInvertido*10+resto;
		 falta=falta/10;		 		 
		}

		return numeroInvertido;
	}
	
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		long numero = 0;
		
		while (numero<=0) {
			System.out.println("Dame un número:");
			numero = reader.nextLong();
		}				
		
		long numeroInvertido = invertirNumero(numero);
		
		while ((numero != numeroInvertido) && (numero<1000000000)) {					
			numero+=numeroInvertido;
			numeroInvertido = invertirNumero(numero);						
		}
		
		if (numero == numeroInvertido)
			System.out.println("El número capicua encontrado es " + numero);
		else
			System.out.println("No tenemos capacidad de encontrar el capicua");
		
		reader.close();
		

	}

}
