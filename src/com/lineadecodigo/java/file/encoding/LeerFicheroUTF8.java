package com.lineadecodigo.java.file.encoding;

/**
 * @file LeerFicheroutf8.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   14/septiembre/2011
 * @url    http://lineadecodigo.com/java/leer-un-fichero-utf-8/
 * @description Programa que lee un fichero con encoding utf-8
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class LeerFicheroUTF8 {

	
	public static void main(String[] args) {
		
		
		try {
		    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("FicheroUTF8.txt"), "utf-8"));
						    
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
