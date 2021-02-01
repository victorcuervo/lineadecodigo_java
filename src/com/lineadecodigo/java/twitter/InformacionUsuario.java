package com.lineadecodigo.java.twitter;

/**
 * @file InformacionUsuario.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/octubre/2019
 * @url    http://lineadecodigo.com/java/informacion-de-usuario-twitter-con-java/
 * @description Código que nos devuelve la información de un usuario de Twitter
 */

import twitter4j.*;

public class InformacionUsuario {

	public static void main(String[] args) {
				
	 try {
		
		 // Asume que hay un twitter4j.properties en la raíz del classpath
		 Twitter twitter = new TwitterFactory().getInstance();				

		 String username = "victor_cuervo";
		 User usuario = twitter.showUser(username);
		 
		 System.out.println("Nombre: " + usuario.getName());
		 System.out.println("Descripcion: " + usuario.getDescription());
		 System.out.println("Id Usuario: " + usuario.getId());
		 System.out.println("Número Seguidores: " + usuario.getFollowersCount());	
  
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Error en la conexión: " + te.getMessage());            
        }
		
	}

}
