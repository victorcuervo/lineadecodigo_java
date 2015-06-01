package com.lineadecodigo.java.util.collections.lista;

/**
 * @file AddElementosFinalLista.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   20-octubre-2014
 * @url    http://lineadecodigo.com/java/anadir-elementos-al-final-de-un-arraylist/
 * @description C—digo que a–ade una colecci—n al final de un ArrayList.
 */

import java.util.ArrayList;
import java.util.Vector;

public class AddElementosFinalLista {


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
		
		
		Vector<String> vector = new Vector<String>();
		vector.add("Irene");
		vector.add("Mar’a");
		
		// A–adir elementos al final del ArrayList
		// Es una colecci—n
		al.addAll(vector);


		System.out.println("--- ArrayList tras insertar elementos ---");
		for(int x=0;x<al.size();x++) {
			System.out.println(al.get(x));
		}
		
	}

}
