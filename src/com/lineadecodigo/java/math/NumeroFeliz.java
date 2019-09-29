package com.lineadecodigo.java.math;

/**
 * @file NumeroFeliz.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   5/mayo/2012
 * @url    http://lineadecodigo.com/java/calcular-el-numero-feliz-con-java/
 * @description Calculo sobre si un número es un número feliz.
 */

import java.util.HashSet;
import java.util.Set;

public class NumeroFeliz {

	
	public static int[] digitosNumero(int iNumero){
	
		// Creamos un array del tamaño del número de dígitos del número
		String x = Integer.toString(iNumero);
		int[] iNumeros = new int[x.length()];
		
		// Método que devuelve los dígitos de un número
		int iDigito = 0;
		while (iNumero>0){
			iNumeros[iDigito] = iNumero%10;
            iNumero = iNumero/10;  
            iDigito++;
		}
		
		return iNumeros;
		
	}
	
	public static void main(String[] args) {
		
		int iNumero = 2;
		Set<Integer> iCalculados = new HashSet<Integer>();
		boolean bRepetido = false;
	
		
		int[] iNumeros = digitosNumero(iNumero);
		System.out.println("Calculando si el número" + iNumero + " es un número feliz");
		
		int iSuma = 0;
		
		while ((iSuma!=1) && !(bRepetido)){		
			iSuma = 0;		
			for (int x=0;x<iNumeros.length;x++)
				iSuma += Math.pow(iNumeros[x],2);				
			iNumeros = digitosNumero(iSuma);
			
			System.out.println(iSuma);
			
			// Controlamos si ha salido un número repetido. Para no entrar en el bucle.
			if (iCalculados.contains(new Integer(iSuma)))
				bRepetido = true;				
			else
				iCalculados.add(new Integer(iSuma));			
		}
		
		if (bRepetido)
			System.out.println(iNumero + " NO es un número feliz");
		else
			System.out.println(iNumero + " SI es un número feliz");
	}

}
