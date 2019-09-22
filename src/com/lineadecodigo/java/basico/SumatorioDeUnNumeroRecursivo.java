package com.lineadecodigo.java.basico;

/**
 * @file SumatorioDeUnNumeroRecursivo.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/junio/2007
 * @url    http://lineadecodigo.com/2007/06/24/sumatorio-de-un-numero-de-forma-recursiva/
 * @description Utilización de programación recursiva para calcular el sumatorio de un número en Java.  
 */

public class SumatorioDeUnNumeroRecursivo {

	public static void main(String[] args) {
		System.out.println(Sumatorio(10));
	}
		   
	private static int Sumatorio(int iNumero){

	  if (iNumero==0)
	    return 0;
	  else
	    return iNumero + Sumatorio(iNumero-1);

	}


}
