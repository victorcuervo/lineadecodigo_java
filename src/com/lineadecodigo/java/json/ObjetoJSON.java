package com.lineadecodigo.java.json;

/**
 * @file ObjetoJSON.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/marzo/2020
 * @url    http://lineadecodigo.com/java/convertir-un-objeto-a-json-con-json-simple/
 * @description Objeto a JSON mediante JSON-Simple
 */

import com.github.cliftonlabs.json_simple.Jsoner;

public class ObjetoJSON {

	public static void main(String[] args) {		

		Alumno alumno = new Alumno("Mari Cielo",22);
		System.out.println(Jsoner.serialize(alumno));
		
	}

}
