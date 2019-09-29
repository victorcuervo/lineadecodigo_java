package com.lineadecodigo.java.net;

/**
 * @file ObtenerIPDelHost.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   8/agosto/2007
 * @url    http://lineadecodigo.com/java/obtener-la-ip-de-un-host/
 * @description Obtener la IP de un determinado host(URL). Convertimos los byte de la IP en una cadena de texto.  
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ObtenerIPDelHost {


	public static void main(String[] args) {

		System.out.println("Linea de Codigo: " + obtenerIP("www.lineadecodigo.com"));
		System.out.println("Google: " + obtenerIP("www.google.com"));
		System.out.println("W3API: " + obtenerIP("www.w3api.com"));
		System.out.println("Error500: " + obtenerIP("www.error500.net"));

	}
	public static String obtenerIP(String sHostName) {

	  try {
	    // Obtenemos la InetAddress de dicha URL
	    InetAddress address = InetAddress.getByName(sHostName);
	    // Cogemos la IP 
	    byte[] bIPAddress = address.getAddress();	    
	    return ip2string(bIPAddress);
	    //return ip2string_v2(bIPAddress);
	   
	  } catch (UnknownHostException e) {
		  // Volcamos la excepci�n e indicamos que no se ha podido resolver
		  // e.printStackTrace();
		  return "No se ha podido resolver";
	  } 
	}
	
	public static String ip2string(byte[] bIPAddress){
		
		String sIPAddress = "";
		
		for (int x=0; x<bIPAddress.length; x++) {
			if (x > 0) {
				// A todos los numeros les anteponemos
		        // un punto menos al primero    
		        sIPAddress += ".";
			}		
		    // Jugamos con los bytes y cambiamos el bit del signo
		    sIPAddress += bIPAddress[x] & 255;
		}
		
		return sIPAddress;
	}

	public static String ip2string_v2(byte[] bIPAddress){
		
		String sIPAddress = "";

		for (int x=0; x < bIPAddress.length; x++) {
		  if (x > 0) {
			  sIPAddress += ".";
		  } 
		  sIPAddress += (bIPAddress[x]<0)?Integer.toString(bIPAddress[x]+256):Integer.toString(bIPAddress[x]);
		}
		
		return sIPAddress;
	}
	
}
