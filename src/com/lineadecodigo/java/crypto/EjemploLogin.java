package com.lineadecodigo.java.crypto;

import java.util.HashMap;
import java.util.Map;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @file EjemploLogin.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date Dec 29, 2012
 * @url http://lineadecodigo.com/java/criptografia-algoritmos-de-digestion-de-mensajes/
 * @description Ejemplos sobre criptografia con digestion de mensajes
 */

class EjemploLogin {
	protected Map<String, String> usuarios;
	
	public static String digest(String str, String alg) {
		try {
			MessageDigest md = MessageDigest.getInstance(alg);
			// Indicamos el algoritmo a usar

			return new String(md.digest(str.getBytes()));
			// 'Digerimos' el mensaje
		} catch (NoSuchAlgorithmException e) {
			System.out.println("el algoritmo " + alg + " no existe");
			return null;
		}
	}

	public EjemploLogin() {
		usuarios = new HashMap<String, String>();

		// Se usara el algoritmo SHA-256 (usuarioX -> passwordX)
		usuarios.put("usuario1", "ï¿½ï¿½ï¿½D*Æ…ï¿½Aï¿½ï¿½ï¿½M=2ï¿½{ï¿½5D/iï¿½ï¿½N");
		usuarios.put("usuario2", "lï¿½Õ¼ï¿½ï¿½x5*ï¿½3`ï¿½?ï¿½Nï¿½ï¿½ï¿½Yï¿½ï¿½ï¿½H]xpï¿½");
		usuarios.put("usuario3", "Yï¿½6~-(deï¿½eï¿½ëµ¬?Zï¿½U");
		usuarios.put("usuario4", "ï¿½xsï¿½sï¿½ï¿½ï¿½Ö…ï¿½ï¿½^_ï¿½ï¿½Ï¸>ï¿½&ï¿½f@ï¿½ï¿½8P+");
	}

	public boolean login(String usuario, String password) {
		// Obtenemos la huella digital de su contraseÃ±a almacenada
		String huella_password = usuarios.get(usuario);

		// Comprobamos que esta existe
		if (huella_password == null)
			return false;
		else {
			// Digerimos la contraseÃ±a ingresada
			String huella = Digestion.digest(password, "SHA-256");

			// En caso de que las huellas sean iguales por la propiedad 3
			// sabemos
			// las contraseÃ±as tambiÃ©n lo son.
			return huella_password.equals(huella);
		}
	}

	public static void main(String[] args) {
		EjemploLogin ejemploLogin = new EjemploLogin();
		boolean b;

		b = ejemploLogin.login("usuario1", "password1");

		if (b)
			System.out.println("usuario1 : acceso concedido");
		else
			System.out.println("usuario1 : acceso denegado");

		b = ejemploLogin.login("usuario2", "123456");

		if (b)
			System.out.println("usuario2 : acceso concedido");
		else
			System.out.println("usuario2 : acceso denegado");
	}
}