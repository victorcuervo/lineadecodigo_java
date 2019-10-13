package com.lineadecodigo.java.string;

/**
 * @file AlinearAIzquuerda.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  1/noviembre/09
 * @url    http://lineadecodigo.com/java/alinear-cadena-a-la-izquierda/
 * @description Formatear una cadena para que quede alineada a la izquierda
 */

import java.util.Formatter;

public class AlinearAIzquierda {


	public static void main(String[] args) {
		
		int number = 4752;		

		// Con la clase Formatter
		Formatter fmt = null;
				
		try {
			fmt = new Formatter();
			fmt.format("Contenido %-8d unidades", number);
			System.out.println(fmt.toString());
	
			// Sin la clase Formatter
			String formateado = String.format("Contenido %-8d unidades", number);		
			System.out.println(formateado);
		} finally{			
			fmt.close();
		}
		
	}

}
