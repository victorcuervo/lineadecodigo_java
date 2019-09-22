package com.lineadecodigo.java.basico;

/**
 * @file UltimoDigitoIgual.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   21/septiembre/2015
 * @url    http://lineadecodigo.com/java/ultimo-digito-igual/
 * @description Comprobar si dados dos números estos tienen el último dígito igual.
 */

public class UltimoDigitoIgual {
	
	public static void main(String[] args) {
		
		int in1 = 1543;
		int in2 = 13;
		
		String n1 = Integer.toString(in1);
		String n2 = Integer.toString(in2);
		
		if (n1.charAt(n1.length()-1) == n2.charAt(n2.length()-1))			
			System.out.println("Acaban en el mismo dígito");
		else
			System.out.println("El último dígito es diferente");
			
		
	}

}
