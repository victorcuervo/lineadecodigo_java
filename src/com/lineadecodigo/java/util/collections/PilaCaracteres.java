package com.lineadecodigo.java.util.collections;

/**
 * @file PilaCaracteres.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/marzo/2016
 * @url     http://lineadecodigo.com/java/pila-de-caracteres/
 * @description Clase que crea una pila de carácteres con un StringBuilder
 */

import java.util.Stack;

public class PilaCaracteres {
	
    final StringBuilder sb = new StringBuilder();

    public void push(char ch) {
        sb.append(ch);
    }

    public char pop() {
        int last = sb.length() -1;
        char ch= sb.charAt(last);
        sb.setLength(last);
        return ch;
    }

    public int size() {
        return sb.length();
    }


	public static void main(String[] args) {
		
		Stack<Character> pila = new Stack<Character>();
		pila.push('a');
		pila.push('b');
		pila.push('c');
		System.out.println(pila.pop());
		
		
		PilaCaracteres pila2 = new PilaCaracteres();
		pila2.push('a');
		pila2.push('b');
		pila2.push('c');
		System.out.println(pila2.pop());
		

	}

}
