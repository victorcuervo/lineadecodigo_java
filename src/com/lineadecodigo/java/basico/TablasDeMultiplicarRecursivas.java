package com.lineadecodigo.java.basico;

/**
 * @file TablasMultiplicarRecursivas.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/febrero/2008
 * @url  http://lineadecodigo.com/java/tablas-de-multiplicar-recursivas-en-java/  
 * @description  Utilización de programación recursiva para generar las tablas de multiplicar
 */

public class TablasDeMultiplicarRecursivas {


	public static void multiplicar(int iTabla, int iNumero){
		
		if (iNumero>1)
			multiplicar(iTabla,iNumero-1);		
		
		System.out.println(iTabla + "x" + iNumero + "=" + iTabla*iNumero);
	}
	
	
	public static void main(String[] args) {
		multiplicar(3,10);

	}

}
