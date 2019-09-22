package com.lineadecodigo.java.basico;

/**
 * @file UltimoDigitoIgualSinString.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   21/septiembre/2015
 * @url    http://lineadecodigo.com/java/ultimo-digito-igual-con-operaciones-matematicas/
 * @description Comprobar si dados dos números estos tienen el último dígito igual mediante operaciones matemáticas.
 */


public class UltimoDigitoIgualSinString {
	
	public static void main(String[] args) {
		
		int in1 = 12348;
		int in2 = 138;
		
		int digito1 = in1%10;
		int digito2 = in2%10;		
				
		if (digito1 == digito2)			
			System.out.println("Acaban en el mismo dígito");
		else
			System.out.println("El último dígito es diferente");
		
		
	}

}
