package com.lineadecodigo.java.json;

import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lineadecodigo.base.Persona;

/**
 * @file ObjetoJSONJackson.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/marzo/2020
 * @url    http://lineadecodigo.com/java/convertir-un-objeto-a-json-con-jackson/
 * @description Objeto a JSON mediante Jackson
 */

public class ObjetoJSONJackson {

	public static void main(String[] args) throws IOException {

		Persona p = new Persona("Marta",34);
		
		ObjectMapper mapper = new ObjectMapper();		 
	    String jsonStr = mapper.writeValueAsString(p);
	    
	    System.out.println(jsonStr);	   
		
	}

}
