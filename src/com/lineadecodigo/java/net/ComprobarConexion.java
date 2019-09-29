package com.lineadecodigo.java.net;

/**
 * @file ComprobarConexion.java
 * @version 1.0
 * @author  Christian G. Gimenez(http://lineadecodigo.com)
 * @date   27/junio/2012
 * @url    http://lineadecodigo.com/java/comprobar-conexion-a-internet-con-java/
 * @description Código que comprueba si hay una conexión.  
 */

import java.net.Socket;

public class ComprobarConexion {

public static void main(String[] args) {

	String dirWeb = "www.lineadecodigo.com";
	int puerto = 80;

		try{
			Socket s = new Socket(dirWeb, puerto);
			if(s.isConnected()){
			System.out.println("Conexión establecida con la dirección: " + dirWeb + " a través del puerto: " + puerto);
			}
	} catch(Exception e) {
		System.err.println("No se pudo establecer conexión con: " + dirWeb + " a travez del puerto: " + puerto);
	}
}
}
