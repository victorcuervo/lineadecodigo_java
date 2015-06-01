package com.lineadecodigo.java.basico;

/**
 * @file LecturaDatosConConsole.java
 * @version 1.0
 * @author Christian Portilla (http://lineadecodigo.com)
 * @date   30-diciembre-2012
 * @url    http://lineadecodigo.com/java/lectura-de-datos-mediante-la-clase-console-con-java/
 * @description Lectura de entradas de datos normales y passwords por consola mediante la clase Console.  
 */

import java.io.Console;

public class LecturaDatosConConsole {

	public static String readLine() {

		String answer = "";
		Console console = null;
		try {
			console = System.console();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (console != null) {
			try {
				answer = console.readLine();
			} catch (Exception ex) {
			}
		}
		return answer;
	}

	public static String readLine(String msg) {
		String answer = "";
		Console console = null;
		try {
			console = System.console();
		} catch (Exception ex) {
		}
		if (console != null) {
			try {
				answer = console.readLine(msg);
			} catch (Exception ex) {
			}
		}
		return answer;
	}

	public static String readPassword() {
		char[] answer = { 0 };
		Console console = null;
		try {
			console = System.console();
		} catch (Exception ex) {
		}
		if (console != null) {
			try {
				answer = console.readPassword();
			} catch (Exception ex) {
			}
		}
		return new String(answer);
	}

	public static String readPassword(String msg) {
		char[] answer = { 0 };
		Console console = null;
		try {
			console = System.console();
		} catch (Exception ex) {
		}
		if (console != null) {
			try {
				answer = console.readPassword(msg);
			} catch (Exception ex) {
			}
		}
		return new String(answer);
	}

	public static void main(String[] args) {
		
		System.out.println("Inserta algo por la consola y pulsa enter");
		String answer = "";
		answer = readLine();
		System.out.println(answer);

		answer = readLine("Inserta una l’nea: ");
		System.out.println(answer);

		answer = readPassword("Inserta una Password: ");
		System.out.println(answer);

	}

}
