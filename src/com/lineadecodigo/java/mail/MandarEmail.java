package com.lineadecodigo.java.mail;

/**
 * @file MandarEmail.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   26/marzo/2011
 * @url    http://lineadecodigo.com/java/mandar-emails-con-javamail/
 * @description Clase que nos permite enviar un email con Java Mail  
 */

import java.util.*;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class MandarEmail {

	
	public static void main(java.lang.String[] args) {
		
		try {

			// Configuramos las propiedades
			Properties props = new Properties();
			props.put("mail.transport.protocol","smtp");
			props.put("mail.smtp.host","mail.lineadecodigo.com");
	
			// Creo la sesión y un nuevo mensaje de correo
			Autentificacion pwd = new Autentificacion();
			Session mailSession = Session.getInstance(props,pwd);
			Message msg = new MimeMessage(mailSession);
			
			// Configuramos los campos del mensaje
			msg.setFrom(new InternetAddress("yo@lineadecodigo.com"));		
			msg.setRecipients(Message.RecipientType.TO,InternetAddress.parse("destinatario@email.com"));
			msg.setSubject("Tema del mensaje");
			String msgBody = "Cuerpo del mensaje";
			DataHandler dh = new DataHandler(msgBody,"text/plain");
			msg.setDataHandler(dh);
			
			// Pedimos a la clase Transport que envie el mensaje de correo
			javax.mail.Transport.send(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
