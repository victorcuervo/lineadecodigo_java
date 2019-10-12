package com.lineadecodigo.java.util.collections;

/**
 * @file RecorrerListaHaciaAtras.java
 * @version 1.2
 * @author Francisco Meza (http://lineadecodigo.com)
 * @date   01/febrero/2009
 * @url    http://lineadecodigo.com/java/usar-una-hashtable-java/
 * @description Revisión de como poder insertar, obtener y listar los elementos de una Hashtable Java.
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class UsarHashMap {


	public static void main(String[] args) {
		
		Hashtable<String,String> contenedor=new Hashtable<String,String>();
		 
		contenedor.put("101", "Harry");
		contenedor.put("102", "Potter");
		contenedor.put("103", "IRONMAN");
		contenedor.put("104", "IRONMAN");
		contenedor.put("105", "HALLO");
		
		System.out.println(contenedor.get("105"));
		System.out.println(contenedor.get("101"));
		
		Enumeration<String> elementos = contenedor.elements();
		while (elementos.hasMoreElements()) {
		  System.out.println(""+"hashtable valores: " + elementos.nextElement());
		}
		
		Enumeration<String> llaves = contenedor.keys();
		while (llaves.hasMoreElements()) {
		  System.out.println(""+"hashtable llaves: " + llaves.nextElement());
		}
		
		System.out.println("Claves: " +contenedor.keys());
		
		

	}

}
