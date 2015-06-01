package com.lineadecodigo.java.util.collections.lista;

/**
 * @file CrearArrayList.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   1-noviembre-2014
 * @url    http://lineadecodigo.com/java/recorrer-un-arraylist/
 * @description Recorrer un ArrayList mediante un bucle for
 */

import java.util.ArrayList;

public class RecorrerArrayList {

	public static void main(String[] args) {

		// ArrayList con tama–o
		ArrayList<String> al = new ArrayList<String>();
		
		// A–adir elementos a un ArrayList
		al.add("Victor");
		al.add("Luis");
		al.add("Elena");
		
		
		// Recorrer un ArrayList
		for(int x=0;x<al.size();x++) {
			System.out.println(al.get(x));
		}
		
	}

}
