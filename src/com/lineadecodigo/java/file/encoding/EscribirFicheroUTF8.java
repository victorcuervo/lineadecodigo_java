package com.lineadecodigo.java.file.encoding;

/**
 * @file EscribirFicheroUTF8.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   19/septiembre/2011
 * @url    http://lineadecodigo.com/java/escribir-un-fichero-utf-8/
 * @description Programa que escribe un fichero con encoding UTF-8
 */

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EscribirFicheroUTF8 {

	public static void main(String[] args) {

		try {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("FicheroSalidaUTF8.txt"), "utf-8"));
			out.write("Esto es un fichero UTF8");
			out.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}