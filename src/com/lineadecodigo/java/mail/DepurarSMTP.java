package com.lineadecodigo.java.mail;

/**
 * @file DepurarSMTP.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   28.marzo.2011
 * @url    http://lineadecodigo.com/java/depurar-una-conexion-smtp-con-java-mail/
 * @description Como depurar una conexión SMTP con Java Mail  
 */

import java.util.*;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class DepurarSMTP {

	
	public static void main(java.lang.String[] args) {
		
		try {

			// Configuramos las propiedades
			Properties props = new Properties();
			props.put("mail.transport.protocol","smtp");
			props.put("mail.smtp.host","mail.lineadecodigo.com");
	
			// Creo la sesión y un nuevo mensaje de correo
			Autentificacion pwd = new Autentificacion();
			Session mailSession = Session.getInstance(props,pwd);

			// Activamos la depuración
			mailSession.setDebug(true);
			
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
