package com.lineadecodigo.java.net;


/**
 * @file ObtenerNombreDelHost.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   8/agosto/2007
 * @url    http://lineadecodigo.com/java/obtener-el-nombre-de-un-host/
 * @description El nombre de un host a partir de una IP dada con Java.Net  
 */


import java.net.InetAddress;
import java.net.UnknownHostException;

public class ObtenerNombreDelHost {

	public static void main(String[] args) {
		
		System.out.println(obtenerHost("209.85.129.104"));
		System.out.println(obtenerHost("69.89.27.203"));		
		
	}
	
	public static String obtenerHost(String sIP) {
	     
	     try {
	        // Generamos la clase InetAddress 
	        // a partir de una IP en formato texto.
	        InetAddress addr = InetAddress.getByName(sIP);
	   
	        // Obtenemos el nombre del host
	        String hostname = addr.getHostName();

	        return hostname;
	   
	    } catch (UnknownHostException e) { return "Error en la obtención del nombre del host"; }
	  }

}
