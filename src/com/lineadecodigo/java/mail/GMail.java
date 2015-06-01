package com.lineadecodigo.java.mail;

/**
 * @file Gmail.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Dec 27, 2012
 * @url http://lineadecodigo.com/java/obtener-cantidad-de-email-sin-leer-en-gmail-con-java/
 * @description Obtiene la cantidad de mensajes leidos y no leidos de una casilla de gmail  
 */

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;

public class Gmail {

	protected String user; // Usuario
	protected String pass; // Contraseña
	protected String host; // Servidor
	protected Folder inbox; // Carpeta a analizar

	public Gmail(String user, String pass) {
		this.user = user + "@gmail.com";
		this.pass = pass;
		this.host = "imap.gmail.com";
	}

	// Crea la conexion con la bandeja de entrada de gmail
	// Mediante un boolean indica si la conexion se puedo realizar
	public boolean connect() {
		try {
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps"); // Protocolo a
															   // usar

			Session session = Session.getDefaultInstance(props, null); // Obtenemos
																	   // una
																	   // session
			Store store = session.getStore("imaps");
			store.connect(host, user, pass); // Hacemos la conexion con
											 // elementos mencionados

			inbox = store.getFolder("Inbox"); // Obtenemos la casilla de entrada
											  // como carpeta a analizar

			return true; // Se puso hacer la conexión! :)
		} catch (Exception e) {
			e.printStackTrace();
			return false; // Hubo un error :(
		}
	}

	// Obtiene la cantidad de mails en la carpeta INBOX de gmail
	// En caso de haber una falla retorna -1
	public int getMessageCount() {
		try {
			inbox.open(Folder.READ_ONLY);
			int count = inbox.getMessageCount();
			inbox.close(false);

			return count;
		} catch (Exception e) {
			System.out.println(e);
			return -1;
		}
	}

	// Obtiene la cantidad de mails sin leer en la carpeta INBOX de gmail
	// En caso de haber una falla retorna -1
	public int getUnreadMessageCount() {
		try {
			inbox.open(Folder.READ_ONLY);
			// Indicamos que solo vamos a leer la carpeta

			int count = inbox.getUnreadMessageCount();
			// Obtenemos la cantidad de mensajes sin leer

			inbox.close(false);
			// Cerramos la carpeta, el false se debe a que le indicamos que no
			// debe hacerse
			// ningún cambio en gmail

			return count;
		} catch (Exception e) {
			System.out.println(e);
			return -1;
			// En caso de una excepción retornamos -1
		}
	}

	public static void main(String[] args) {
		Gmail gmail = new Gmail("USER", "PASS");

		gmail.connect();

		System.out.println("Mails: " + gmail.getMessageCount());
		System.out.println("Unread: " + gmail.getUnreadMessageCount());
	}
}