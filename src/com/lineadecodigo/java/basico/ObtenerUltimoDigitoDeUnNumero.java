package com.lineadecodigo.java.basico;

/**
 * @file ObtenerPrimerDigitoDeUnNumero.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  10/enero/2009
 * @url   http://lineadecodigo.com/2009/01/11/ultimo-digito-de-un-numero-con-java/
 * @description Solicitar un número por consola y devolver el primer dígito. 
 */

import java.util.Scanner;

public class ObtenerUltimoDigitoDeUnNumero {


	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int iNumero,iUltimoDigito;
		
		System.out.println("Introduce un número por pantalla: ");
		iNumero = reader.nextInt();
		
		iUltimoDigito = iNumero%10;
		
		System.out.println("El último dígito de " + iNumero + " es " + iUltimoDigito);

		reader.close();

	}

}
