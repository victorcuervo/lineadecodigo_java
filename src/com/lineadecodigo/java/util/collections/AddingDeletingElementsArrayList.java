package com.lineadecodigo.java.util.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @file AddingDeletingElementsArrayList.java
* @version 1.0
* @author Víctor Cuervo (http://lineadecodigo.com)
* @date   8/agosto/2021
* @url    http://lineadecodigo.com/java/anadir-y-eliminar-elementos-de-un-arraylist/
* @description Añadir y eliminar elementos de un ArrayList. Hay que controlar que no está vacía.
*/

public class AddingDeletingElementsArrayList {

	  public static void main(java.lang.String[] args) {

	    // Definimos una ArrayList
	    ArrayList<String> list = new ArrayList<String>();
	  
		// Lectura por consola
		Scanner reader = new Scanner(System.in);
		String sTexto = "";

	    // Añadimos elementos
	    list.add("Elemento");
	    list.add("Elemento");
	    list.add("Elemento");
	   
		System.out.println("Escriba ADD para añadir un elemento o DEL para borrarlo. END para terminar");
		
		do {
			sTexto = reader.next();
			
			if (sTexto.equals("ADD"))
				list.add("Elemento");
			else if (sTexto.equals("DEL"))
				if (!list.isEmpty())
					list.remove(list.size()-1);
				else
					System.out.println("La lista está vacía. No puedes borrar más elementos.");
			
			System.out.println("Hay " + list.size() + " elementos en la lista");

		} while(!sTexto.equals("END"));

		reader.close();
	   
	  }

}
