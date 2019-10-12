package com.lineadecodigo.java.string;

/**
 * @file InvertirCadenaConReverse.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   11/diciembre/2010
 * @url    http://lineadecodigo.com/java/invertir-una-cadena-con-reverse-en-java/
 * @description Invertir un String mediante un StringBuffer y el método .reverse()
 */


public class InvertirCadenaConReverse {

	public static void main(String[] args) {
		String sCadena= "abuelita, abuelita";
		StringBuilder builder=new StringBuilder(sCadena);
		String sCadenaInvertida=builder.reverse().toString();
		
		System.out.println(sCadenaInvertida);
	}

}
