package com.lineadecodigo.java.basico.variables;

/**
 * @file DesbordarVariable.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.con/java/overflow-de-variables-java/
 * @description Explicación sobre qué sucede si hacemos overflow de una variable.
 */

public class DesbordarVariable {
	
	public static void main(String[] args) {
	    
		// Creamos una variable byte y le damos su máximo valor
	    byte b = Byte.MAX_VALUE;
	    System.out.println(b);
	    
	    // Sumamos 1 a la variable y vemos que se rota y no hay overflow
	    b += 1;
	    System.out.println(b);
	    
	    
	    
	  }

}
