package com.lineadecodigo.java.net.ftp;

import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;

/**
 * @file ConectarFTP.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   7/septiembre/2011
 * @url    http://lineadecodigo.com/java/conectarse-a-un-ftp-con-java/
 * @description Conectarnos a un FTP mediante Apache Commons  
 */


public class ConectarFTP {

	public static void main(String[] args) {
		
		FTPClient client = new FTPClient();
		String sFTP = "ftp.miservidor.com";
		String sUser = "usuario";
		String sPassword = "password";
		
		try {
			
			System.out.println("Conectandose a " + sFTP);
		    client.connect(sFTP);
		    boolean login = client.login(sUser,sPassword);
	
		    if (login) {
		      System.out.println("Login correcto");
		      boolean logout = client.logout();
		      if (logout) {
		        System.out.println("Logout del servidor FTP");
		      }
		    } else {
		      System.out.println("Error en el login.");
		    }
		    
		    System.out.println("Desconectando.");
		    client.disconnect();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}

	}

}