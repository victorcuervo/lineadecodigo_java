package com.lineadecodigo.java.util.stream;

/**
 * @file MayusculasMinusculasStream.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/marzo/2016
 * @url    http://lineadecodigo.com/java/caracteres-mayusculas-minusculas-stream/
 * @description Código que convierte los caracteres de una cadena a mayúsculas y minúsuclas de forma secuencial utilizando un Stream
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MayusculasMinusculasStream {

	public static void main(String[] args) {
		
		String[] s = "Esto es una frase muy interesante".split("");
		String cadena = IntStream.range(0, s.length)
		         .mapToObj(i -> i%2!=0 ? s[i].toUpperCase():s[i].toLowerCase())
		         .collect(Collectors.joining());		         
		
		System.out.println(cadena);
		
		IntStream.range(0, s.length)
		         .mapToObj(i -> i%2!=0 ? s[i].toUpperCase():s[i].toLowerCase())
		         .forEach(System.out::print);
		
	}

}
