package com.lineadecodigo.java.file.encoding;

/**
 * @file LeerFicheroISO1.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   14/septiembre/2011
 * @url    http://lineadecodigo.com/java/leer-fichero-iso-latin-1/
 * @description Programa que lee un fichero con encoding ISO 8859-1, Latin Alphabet No. 1
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class LeerFicheroISO1 {

	
	public static void main(String[] args) {
		
		
		try {
		    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("FicheroISO1.txt"), "8859_1"));
						    
			String sCadena;
			while ((sCadena = in.readLine())!=null) {
				System.out.println(sCadena);
			} 
		    
		    
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
