package com.lineadecodigo.java.string;

/**
 * @file InvertirCadena.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25-agosto-2007
 * @url    http://lineadecodigo.com/2007/08/25/invertir-una-cadena-con-java/
 * @description Invertir una cadena de texto en Java. Es decir, si tenemos "Juan", pasar a tener "nauJ".  
 */
	
public class InvertirCadena {

	public static void main(String[] args) {

		String sCadena = "LineaDeCodigo";
		String sCadenaInvertida = "";
		
		for (int x=sCadena.length()-1;x>=0;x--)
			sCadenaInvertida = sCadenaInvertida + sCadena.charAt(x);
		
		System.out.println(sCadenaInvertida);

	}

}
