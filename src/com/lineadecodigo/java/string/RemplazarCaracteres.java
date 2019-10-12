package com.lineadecodigo.java.string;

/**
 * @file RemplazarCaracteres.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  16/octubre/2007
 * @url    http://lineadecodigo.com/java/remplazar-caracteres-con-java/
 * @description Utilización de cancioncilla para niños como ejemplo para explicar el reemplazo
 * 					de caracteres en Java.
 */

public class RemplazarCaracteres {

	public static void main(String[] args) {
		String sFernando = "Cuando Fernando Septimo usaba paleto,\r" +
	   "Cuando Fernando Septimo usaba paleto,\r" + 
	   "Cuando Fernando Septimo usaba paleto,\r" +
	   "paleto, usaba paleto. ";
	   
	   // Cantamos la canción
	   System.out.println(sFernando);
	   
	   // Reemplazamos todos los caracteres por a 
	   sFernando = sFernando.replace('e','a').replace('i','a')
	                 .replace('o','a').replace('u','a');
	   
	   // Cantamos con la 'a'
	   System.out.println("\rCantamos con la 'A'");
	   System.out.println(sFernando);
	   
	   // Reemplazamos todos los caracteres por e 
	   sFernando = sFernando.replace('a','e');
	   
	   // Cantamos con la 'e'
	   System.out.println("\rCantamos con la 'E'");
	   System.out.println(sFernando);

	   // Reemplazamos todos los caracteres por i 
	   sFernando = sFernando.replace('e','i');
	   
	   // Cantamos con la 'i'
	   System.out.println("\rCantamos con la 'I'");
	   System.out.println(sFernando);
	   
	   // Reemplazamos todos los caracteres por o 
	   sFernando = sFernando.replace('i','o');
	   
	   // Cantamos con la 'o'
	   System.out.println("\rCantamos con la 'O'");
	   System.out.println(sFernando);
	   
	   // Reemplazamos todos los caracteres por u 
	   sFernando = sFernando.replace('o','u');
	   
	   // Cantamos con la 'e'
	   System.out.println("\rCantamos con la 'U'");
	   System.out.println(sFernando); 
	   
		
	}

}
