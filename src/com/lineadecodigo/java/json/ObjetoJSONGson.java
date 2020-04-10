package com.lineadecodigo.java.json;

/**
 * @file ObjetoJSONGson.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/marzo/2020
 * @url    http://lineadecodigo.com/java/crear-objeto-json-con-gson/
 * @description Convertir un objeto a JSON con la librería Gson de Google  
 */

import com.google.gson.Gson;
import com.lineadecodigo.base.Persona;

public class ObjetoJSONGson {

	public static void main(String[] args) {

		Persona persona = new Persona("Mari Cielo",32);
	
		Gson g = new Gson();	
		System.out.println(g.toJson(persona));
		
	}

}