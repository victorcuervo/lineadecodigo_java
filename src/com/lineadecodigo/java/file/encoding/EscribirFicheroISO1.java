package com.lineadecodigo.java.file.encoding;

/**
 * @file EscribirFicheroISO1.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   19/septiembre/2011
 * @url    http://lineadecodigo.com/java/escribir-un-fichero-iso-latin-1/
 * @description Programa que escribe un fichero con encoding ISO 8859-1, Latin Alphabet No. 1
 */

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EscribirFicheroISO1 {

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("FicheroSalidaISO1.txt"), "8859_1"));
			out.write("Esto es un fichero ISO Latin 1");
			out.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}