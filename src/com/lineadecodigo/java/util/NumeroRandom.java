package com.lineadecodigo.java.util;

/**
 * @file NumeroRandom.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/junio/2015
 * @url    http://lineadecodigo.com/java/generar-un-numero-aleatorio/
 * @description Uso de la clase Random para generar números aleatorios.
 */

import java.util.Random;

public class NumeroRandom {

	public static void main(String[] args) {
		
		Random r = new Random();
		int limite=10;
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(limite+1));

	}

}
