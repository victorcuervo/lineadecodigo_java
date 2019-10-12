package com.lineadecodigo.java.util.collections;

/**
 * @file CalcularModa.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   09/noviembre/2010
 * @url     http://lineadecodigo.com/java/calcular-la-moda-de-una-distribucion-con-java/
 * @description Clase que calcula la moda de una distribución utiliznado Java
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CalcularModa {
	
	public static void main(String[] args) {
	
		// Distribución
		int[] elementos = {1,3,4,5,3,2,1,2,2,1,5,5,8,9,6,6,3,4,3,1,3,5,3};
		// Distribución bipolar
		//int[] elementos = {1,3,4,5,3,2,1,2,2,1,8,9,6,6};
		// Distribución sin moda
		// int[] elementos = {1,2,3,4,5,6,7,8,9};
		
		// Valor que hace que sea el más repetido
		int repeticiones = 0;
		// Lista de valores de la moda
		List<Integer> moda = new ArrayList<Integer>();
		
		
		// Mapas con los el número de valores de la distribución
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();				
		
		for (int elemento: elementos){			
			if (m.containsKey(elemento))					
				m.put(elemento,m.get(elemento)+1);
			else
				m.put(elemento,1);			
		}
				
		// Analizamos los pares clave/valor para ver quien tiene mayor número de repeticiones
		Iterator<Entry<Integer, Integer>> iter = m.entrySet().iterator();		
	    while (iter.hasNext()) {	      
	    	Entry<Integer,Integer> e = iter.next();	    	
	    	if (e.getValue() > repeticiones) {
	    		moda.clear();
	    		moda.add(e.getKey());
	    		repeticiones = e.getValue();
	    	} else if (e.getValue() == repeticiones)
	    		moda.add(e.getKey());	    	
	    }
		
	    if (moda.size() == elementos.length)
	    	System.out.println("No hay moda");
	    else
	    	System.out.println("La moda de la distribución es " + moda);

	}

}
