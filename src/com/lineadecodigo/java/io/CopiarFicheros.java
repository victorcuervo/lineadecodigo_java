package com.lineadecodigo.java.io;

/**
 * @file CopiarFicheros.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   10/noviembre/2010
 * @url    http://lineadecodigo.com/java/copiar-un-fichero-con-java/
 * @description Copiar el contenido de un fichero en otro
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiarFicheros {
	
	public static void main(String[] args) {

		
		File origen = new File("origen.txt");
		File destino = new File("destino.txt");

		try {
			InputStream in = new FileInputStream(origen);
			OutputStream out = new FileOutputStream(destino);
				
			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		
			in.close();
			out.close();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
		

	}

}
