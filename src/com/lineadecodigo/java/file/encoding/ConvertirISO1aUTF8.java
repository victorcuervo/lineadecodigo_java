package com.lineadecodigo.java.file.encoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 * @file LeerFicheroISO1.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   14/septiembre/2011
 * @url    http://lineadecodigo.com/java/convertir-un-fichero-iso-en-utf-8/
 * @description Programa que lee un fichero con encoding ISO 8859-1, Latin Alphabet No. 1
 */

public class ConvertirISO1aUTF8 {

	
	public static void main(String[] args) {
		
		
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("FicheroISO1.txt"), "8859_1"));
		    Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("FicheroSalidaUTF8"), "utf-8"));
			    
			String sCadena;
			while ((sCadena = in.readLine())!=null) {
				System.out.println(sCadena);
				out.write(sCadena);
			} 
			
			in.close();
			out.close();
		    
		    
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
