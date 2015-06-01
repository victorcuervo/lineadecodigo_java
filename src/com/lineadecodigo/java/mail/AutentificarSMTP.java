package com.lineadecodigo.java.mail;

/**
 * @file AutentificarSMTP.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26.marzo.2011
 * @url    http://lineadecodigo.com/java/autentificandose-con-smtp/
 * @description Clase que autentifica contra un servidor SMTP  
 */

import java.util.*;
import javax.mail.*;

public class AutentificarSMTP {

	
	public static void main(java.lang.String[] args) {
		
		try {

			// Configuramos las propiedades
			Properties props = new Properties();
			props.put("mail.transport.protocol","smtp");
			props.put("mail.smtp.host","mail.lineadecodigo.com");
	
			// Creo la sesión y un nuevo mensaje de correo
			Autentificacion pwd = new Autentificacion();
			Session mailSession = Session.getInstance(props,pwd);
			
			System.out.println(mailSession.toString());
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
