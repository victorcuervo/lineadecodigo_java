package com.lineadecodigo.java.util.collections;

/**
 * @file ElementoMaximoMinimoConjunto.java
 * @version 1.2
 * @author 	Víctor Cuervo (http://lineadecodigo.com)
 * @date   	8/julio/2007
 * @url		http://http://lineadecodigo.com/java/elemento-maximo-y-minimo-de-un-conjunto-con-objetos/
 * @description Como utilizar los métodos .max y .min de la clase Collections con objetos. Utilización del interface Comparator.
 */


import java.util.*;
import com.lineadecodigo.base.Persona;

public class ElementoMaximoMinimoConjunto {
	
	  public static void main(java.lang.String[] args) {

	    Set<Persona> hs2 = new HashSet<Persona>();

	    hs2.add(new Persona("Victor",29));
	    hs2.add(new Persona("Amaya",30));
	    hs2.add(new Persona("Jose",57));
	    hs2.add(new Persona("Sonsoles",50));

	    try {

	    	// Definimos el comparador
	    	
	    	Comparator<Persona> comparador = new Comparator<Persona>(){
	    		
	    		public int compare(Persona p1, Persona p2) {
	    			   return (p1.getEdad()-p2.getEdad());

	    			}
	    	};
	    	
	    	// Ejecutamos los métodos .max y .min
	    	System.out.println(Collections.max(hs2,comparador).getNombre());
	    	System.out.println(Collections.min(hs2,comparador).getNombre());
	    	
	    	
	    	
	       } catch (Exception e){
	         System.out.println(e.toString());
	      }
	     }
	
}
