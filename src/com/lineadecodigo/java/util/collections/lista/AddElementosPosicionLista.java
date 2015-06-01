package com.lineadecodigo.java.util.collections.lista;

/**
 * @file AddElementosPosicionLista.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   10-octubre-2014
 * @url    http://lineadecodigo.com/java/insertar-un-elemento-dentro-de-un-arraylist/
 * @description Como insertar un elemento dentro de una posici—n de un ArrayList
 */

import java.util.ArrayList;

public class AddElementosPosicionLista {

	public static void main(String[] args) {
		
		// ArrayList con tama–o
		ArrayList<String> al = new ArrayList<String>();
		
		// A–adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		System.out.println("--- ArrayList Inicial ---");
		for(int x=0;x<al.size();x++) {
			System.out.println(al.get(x));
		}
		
		System.out.println("--- ArrayList tras insertar elementos ---");
		// A–adir elementos a una posici—n espec’fica
		al.add(1,"Fernando");
		al.add(0,"Virginia");
		
		for(int x=0;x<al.size();x++) {
			System.out.println(al.get(x));
		}
		

	}

}
