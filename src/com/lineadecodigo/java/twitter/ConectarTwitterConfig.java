package com.lineadecodigo.java.twitter;

/**
 * @file ConectarTwitterConfig.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/octubre/2019
 * @url    http://lineadecodigo.com/java/configurar-la-conexion-de-twitter4j/
 * @description Conectarte a Twitter utilizando una clase de configuración
 */

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

public class ConectarTwitterConfig {

	public static void main(String[] args) {
				
	 try {
		 ConfigurationBuilder cb = new ConfigurationBuilder();
		 cb.setDebugEnabled(true)
		   .setOAuthConsumerKey("bwMEjAH340")
		   .setOAuthConsumerSecret("nYnIMrqk5QYjguY3BH4CS8yoUPb8VdJz")
		   .setOAuthAccessToken("VmtrDacTJUl1M7lUyRAzL7BaqVCOVotr")
		   .setOAuthAccessTokenSecret("tM6CfOKzfUbWpXY5QqGWDnN0aHDtyS");
		 
		 Twitter twitter = new TwitterFactory(cb.build()).getInstance();		

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
