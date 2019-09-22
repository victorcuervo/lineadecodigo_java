package com.lineadecodigo.java.basico;

/**
 * @file DividirSinDividir.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   18/febrero/2016
 * @url    http://lineadecodigo.com/java/dividir-sin-dividir-con-java/
 * @description Calcular el cociente y resto de una división si utilizar el operador de división ni módulo
 */

public class DividirSinDividir {

	public static void main(String[] args) {
		
		int dividendo = 13;
		int divisor = 2;
		int cociente = 0;
		
		dividendo = dividendo-divisor;
		
		while (dividendo >0) {
			cociente++;
			dividendo = dividendo-divisor;								
		} 
		
		System.out.println("Cociente " + cociente);
		System.out.println("Resto " + (-dividendo));
			

	}

}
