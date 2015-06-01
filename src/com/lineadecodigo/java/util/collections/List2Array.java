package com.lineadecodigo.java.util.collections;

/**
 * @file List2Array.java
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   31/enero/2014
 * @url    http://lineadecodigo.com/java/convertir-una-lista-en-un-array/
 * @description Convierte una lista en un array 
 */


import java.util.ArrayList;
import java.util.List;

public class List2Array {


	public static void main(String[] args) {
		List<String> milista = new ArrayList<String>();
		milista.add("Elemento 1");
		milista.add("Elemento 2");

		String[] miarray = new String[milista.size()];
		miarray = milista.toArray(miarray);

		for(String s : miarray)
		  System.out.println(s);

	}

}
