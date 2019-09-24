package com.lineadecodigo.java.crypto;

/**
 * @file Digestion.java
 * @version 1.0
 * @author Feffo Calendino (http://lineadecodigo.com/author/feffon/)
 * @date 29/diciembre/2012
 * @url http://lineadecodigo.com/java/criptografia-algoritmos-de-digestion-de-mensajes/
 * @description Ejemplos sobre criptografia con digestion de mensajes
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Digestion {

	/**
	 * Prueba de los distintos algoritmos de digestion soportados por java
	 */
	public static void algoritmos() {
		System.out.println("lineadecodigo con MD2:" + digest("lineadecodigo", "MD2"));
		System.out.println();
		System.out.println("lineadecodigo con MD5:" + digest("lineadecodigo", "MD5"));
		System.out.println();
		System.out.println("lineadecodigo con SHA-1:" + digest("lineadecodigo", "SHA-1"));
		System.out.println();
		System.out.println("lineadecodigo con SHA-256:" + digest("lineadecodigo", "SHA-256"));
		System.out.println();
		System.out.println("lineadecodigo con SHA-384:" + digest("lineadecodigo", "SHA-384"));
		System.out.println();
		System.out.println("lineadecodigo con SHA-512:" + digest("lineadecodigo", "SHA-512"));
	}

	/**
	 * Permite digerir un mensaje mediante un algoritmo
	 * 
	 * @param str
	 *            mensaje a digerir
	 * @param alg
	 *            algoritmo de digestion
	 * @return null, si el algoritmo no existe alg(str) digerido en caso
	 *         contrario
	 */
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
	
	public static void main(String[] args){
		algoritmos();
	}
}

