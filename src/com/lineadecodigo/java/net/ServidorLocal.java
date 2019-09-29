package com.lineadecodigo.java.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @file ServidorLocal.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   3/octubre/2009
 * @url    http://lineadecodigo.com/java/obtener-el-nombre-e-ip-del-servidor-con-java/
 * @description Obtener el nombre e IP del servidor Local
 */

public class ServidorLocal {
	
	public static void main(String[] args) {
		// Convertimos la IP a una cadena del estilo X.X.X.X
		   
	  try {

	    // Obtenemos la InetAddress de dicha URL
	    InetAddress address = InetAddress.getLocalHost();

	    // HostName
	    String sHostName;
	    sHostName = address.getHostName();
	   
	    // Cogemos la IP 
	    byte[] bIPAddress = address.getAddress();
	   
	    // IP en formato String
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

	    System.out.println("Nombre de la maquina local:" + sHostName);
	    System.out.println("IP de la maquina local:" + sIPAddress);
	   
	    } catch (UnknownHostException e) {
	      // Se genera una excepción
	      System.out.println(e.toString());
	    } 
	}

}
