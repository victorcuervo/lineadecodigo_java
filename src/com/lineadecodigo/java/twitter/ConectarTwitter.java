package com.lineadecodigo.java.twitter;

/**
 * @file ConectarTwitter.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/octubre/2019
 * @url    http://lineadecodigo.com/java/conectarse-a-twitter-con-java/
 * @description Conectarte a Twitter con java mediante la librería Twitter4j
 */

import twitter4j.*;

public class ConectarTwitter {

	public static void main(String[] args) {
				
	 try {
		
		 // Asume que hay un twitter4j.properties en la raíz del classpath
		 Twitter twitter = new TwitterFactory().getInstance();				

		 User usuario = twitter.verifyCredentials();
		 
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
