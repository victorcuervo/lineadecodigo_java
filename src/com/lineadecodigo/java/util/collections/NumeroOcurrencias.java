package com.lineadecodigo.java.util.collections;

/**
 * @file RecorrerListaHaciaAtras.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   29-marzo-2011
 * @url    http://lineadecodigo.com/java/numero-de-ocurrencias-en-un-array/
 * @description Clase que calcula el número de ocurrencias en los que aparece un número dentro de un array
 */



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NumeroOcurrencias {

	public static void main(String[] args) {
	
		int[] listaNumeros = {1,4,7,8,9,2,7,15,4,6,9,9,8};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int clave;
		
		for (int x=0;x<listaNumeros.length;x++) {			
			clave = listaNumeros[x];
			if (hm.containsKey(clave))
				hm.put(clave, hm.get(clave)+1);
			else
				hm.put(clave,1);			
		}
		
		Iterator<Entry<Integer,Integer>> it = hm.entrySet().iterator();
		String vez;
		
		while (it.hasNext()) {
			Entry<Integer,Integer> e = it.next();
			vez = (e.getValue()>1)?" veces":" vez";
			System.out.println("El número " + e.getKey() + " aparece " + e.getValue() + vez);
		}	
	}		
}
