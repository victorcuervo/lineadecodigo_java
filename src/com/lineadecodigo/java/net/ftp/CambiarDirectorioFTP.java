package com.lineadecodigo.java.net.ftp;

import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;

/**
 * @file CambiarDirectorioFTP.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   7/septiembre/2011
 * @url    http://lineadecodigo.com/java/acceder-a-un-directorio-de-un-ftp-con-java/
 * @description Código que nos enseña como cambiar de directorio en un FTP  
 */

public class CambiarDirectorioFTP {

	public static void main(String[] args) {

		FTPClient client = new FTPClient();
		String sFTP = "ftp.servidor.com";
		String sUser = "usuario";
		String sPassword = "pasword";		
		
		try {
		
			// Nos conectamos
			System.out.println("Conectandose a " + sFTP);
		    client.connect(sFTP);
		    client.login(sUser,sPassword);
		    
		    //Conocer el directorio en el que está conectado el FTP		   
		    System.out.println(client.printWorkingDirectory());
		    
		    // Cambiamos el directorio
		    client.changeWorkingDirectory("\\httpdocs");
		    System.out.println(client.printWorkingDirectory());
		    
		    System.out.println("Desconectando.");
		    client.logout();
		    client.disconnect();

		} catch (IOException ioe){
			ioe.printStackTrace();
		}		
	}

}
