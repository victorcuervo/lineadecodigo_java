package com.lineadecodigo.java.mail;

/**
 * @file Autentificacion.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26.marzo.2011
 * @url    http://lineadecodigo.com/java/mandar-emails-con-javamail/
 * @description Clase que nos permite autentificarnos con el servidor de mail para poder enviar emails con Java Mail  
 */

import javax.mail.*;

public class Autentificacion extends javax.mail.Authenticator {
	public Autentificacion() {
		super();
	}

	public javax.mail.PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("yo@lineadecodigo.com","mipassword");
	}
}
