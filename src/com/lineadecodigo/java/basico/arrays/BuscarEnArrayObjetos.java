package com.lineadecodigo.java.basico.arrays;

/**
 * @file BuscarEnArrayObjetos.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   09/febrero/2020
 * @url    http://lineadecodigo.com/java/buscar-un-objeto-en-un-array/
 * @description Buscar un objeto en un array
 */

import java.util.Arrays;
import com.lineadecodigo.base.Persona;

public class BuscarEnArrayObjetos {
	
	// El objeto debe de tener implementado el método equals
	
	private static boolean searchPerson(Persona[] personas, Persona p) {
	    return Arrays.asList(personas)
	      .contains(p);
	}
	

	public static void main(String[] args) {

		Persona p0 = new Persona("Víctor",42);
		Persona p1 = new Persona("Marta",34);
		
		Persona[] personas = new Persona[2];
		personas[0] = p0;
		personas[1] = p1;
		
		Persona ps = new Persona("Marta",34);
				
		if (searchPerson(personas,ps))
			System.out.println("Valor en la lista");
		else
			System.out.println("Valor no encontrado");
		
	}

}
