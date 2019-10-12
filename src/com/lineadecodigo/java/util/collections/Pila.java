package com.lineadecodigo.java.util.collections;

import java.util.Stack;

/**
 * @file Pila.java
 * @version 1.0
 * @author LVíctor Cuervo (http://lineadecodigo.com)
 * @date   06/octubre/2009
 * @url     http://lineadecodigo.com/java/crear-una-pila-en-java/
 * @description Clase que instancia y utiliza una pila
 */

public class Pila {

	public static void main(String[] args) {
		
		Stack<String> pila = new Stack<String>();

		for (int x=1;x<=10;x++)
			pila.push(Integer.toString(x));
		
		while (!pila.empty())
			System.out.println(pila.pop());
		
	}
}
