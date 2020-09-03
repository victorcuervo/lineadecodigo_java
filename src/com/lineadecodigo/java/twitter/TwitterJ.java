package com.lineadecodigo.java.twitter;

/**
 * @file TwitterJ.java
 * @version 1.0
 * @author Pablo Ruiz (http://lineadecodigo.com)
 * @date   25/abril/2010
 * @url    http://lineadecodigo.com/java/usando-la-api-de-twitter4j-en-java/
 * @description Uso de la librería Twitter4J para comunicarnos con el API de Twitter
 */


// import java.util.List;
// import twitter4j.*;

public class TwitterJ {
	
	// Las cases han sido deprecadas y ahora está explicado en ConectarTwitter
	
	/*

    private Twitter mi_twitter;

    public TwitterJ(String userName, String password) {
        try {
            mi_twitter = new Twitter(userName, password);
            mi_twitter.verifyCredentials();
        } catch (TwitterException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
    public void nuevoTweet(String tweet) {
        try {
            this.mi_twitter.update(tweet);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String getEstado(){
        String estadoActual = "";
        try {
            List<Status> statusList = mi_twitter.getUserTimeline();
            estadoActual = String.valueOf(statusList.get(0).getText());
        } catch (TwitterException ex) {
            System.out.println("Error:"+ex.getMessage());
        }
        return "Mi Estado es: "+estadoActual;
    }

    public void listaDeContactos() {
        try {
            List<User> friends = mi_twitter.getFriends();
            System.out.println("Lista de Contactos\n");
            for (User f : friends) {
                String[] datos = {f.getScreenName(), f.getStatusText()};
                System.out.println("Usuario: "+f.getScreenName());
                System.out.println("Estado: "+f.getStatusText()+"\n");
            }
        } catch (Exception e) {
        }
    }

    public static void main(String args[]){
        TwitterJ mi_twitter = new TwitterJ("usuario", "password");
        System.out.println("Estado: "+mi_twitter.getEstado());
        mi_twitter.listaDeContactos();
        mi_twitter.nuevoTweet("Tweet para lineadeCodigo.com");
    }
    
    */
}
