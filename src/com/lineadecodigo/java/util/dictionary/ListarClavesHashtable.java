package com.lineadecodigo.java.util.dictionary;

/**
* @file ListarClavesHashtable.java
* @version 1.0
* @author 	Víctor Cuervo (http://lineadecodigo.com)
* @date   	29/marzo/2011
* @url		http://lineadecodigo.com/java/listar-las-claves-de-una-hashtable/
* @description Lista las claves que tenga una Hashtable
*/

import java.util.Enumeration;
import java.util.Hashtable;

public class ListarClavesHashtable {

	
	public static void main(String[] args) {
	
		Hashtable<String,String> paises = new Hashtable<String,String>();
		paises.put("ES", "España");
		paises.put("UK", "Reino Unido");
		paises.put("US", "Estados Unidos");
		paises.put("FR", "Francia");
				
		 Enumeration<String> e = paises.keys();
		
		 while(e.hasMoreElements())
			 System.out.println(e.nextElement());

	}

}
