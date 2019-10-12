package com.lineadecodigo.java.string;

/**
 * @file EmailsAcabadosEnDotCom.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/marzo/2010
 * @url    http://lineadecodigo.com/java/detectar-emails-que-finalicen-en-com/
 * @description Utilizar el método .endsWith() para sacar un listado de emails acabados en .com 
 */

public class EmailsAcabadosEnDotCom {
	
	public static void main(String[] args) {

		String emails[] = {"julio@gmail.com","maria@red.es","lucia@hotmail.com","javi@email.it","laura@telecom.fr",
			     "sonia@aulambra.com","luis@hotmail.com","pedro@yahoo.com","enrique@fcbarcelona.cat"};
		
		
		for (String email: emails)
			if (email.endsWith(".com")) System.out.println(email);
		
		
	}

}
