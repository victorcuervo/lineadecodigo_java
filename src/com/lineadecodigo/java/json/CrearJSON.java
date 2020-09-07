package com.lineadecodigo.java.json;

/**
 * @file CrearJSON.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/marzo/2020
 * @url    http://lineadecodigo.com/java/crear-objeto-json-con-json-simple/
 * @description Crear un objeto JSON con JSON-Simple  
 */

import com.github.cliftonlabs.json_simple.JsonObject;

public class CrearJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonObject json = new JsonObject();
        json.put("name", "Víctor");
        json.put("age", 42);
        
        System.out.println(json.toString());

	}

}
