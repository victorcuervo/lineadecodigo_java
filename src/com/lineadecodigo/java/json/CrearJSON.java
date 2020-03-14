package com.lineadecodigo.java.json;

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
