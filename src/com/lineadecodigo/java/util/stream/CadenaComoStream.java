package com.lineadecodigo.java.util.stream;

/**
 * @file CadenaComoStream.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/marzo/2016
 * @url    http://lineadecodigo.com/java/string-stream-java/
 * @description Manipular una cadena como si fuese un Stream 
 */

public class CadenaComoStream {

	public static void main(String[] args) {
		
		
		String sCadena = "Esto es una cadena de texto";

	    sCadena.chars()
	    	.forEach(c -> System.out.print(Character.toString((char) c)));
	    
	    System.out.println();
	    
	    sCadena.chars()
	    	.parallel()
	    	.forEach(c -> System.out.print(Character.toString((char) c)));

	    System.out.println();
	    
	    sCadena.chars()
    	.filter(c -> c!='a')
    	.forEach(c -> System.out.print(Character.toString((char) c)));

	}

}
