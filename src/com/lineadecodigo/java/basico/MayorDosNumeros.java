package com.lineadecodigo.java.basico;

/**
 * @file MayorDosNumeros.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date  14-mayo-2011
 * @url    http://lineadecodigo.com/java/mayor-de-dos-numeros/
 * @description Saber cuál es el mayor de dos números 
 */

import java.util.Scanner;

public class MayorDosNumeros {

	public static void main(String[] args) {
		
	
		Scanner reader = new Scanner(System.in);		
		int iNumero1, iNumero2;
		
		System.out.println("Dame el primer nœmero");
		iNumero1 = reader.nextInt();
		
		System.out.println("Dame el segundo nœmero");
		iNumero2 = reader.nextInt();
		
		if (iNumero1>iNumero2)
			System.out.println(iNumero1 + " es mayor que " + iNumero2);
		else
			System.out.println(iNumero2 + " es mayor que " + iNumero1);
		
	}
	
}
