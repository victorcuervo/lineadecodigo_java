package com.lineadecodigo.java.util.zip;

/**
 * @file MayusculasMinusculasStream.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/diciembre/2006
 * @url    http://lineadecodigo.com/java/generar-un-fichero-gzip-con-java/
 * @description Código que nos permite comprimir un archivo como fichero zip
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;


public class GenerarFicheroGZIP {

	public static void main(String[] args) {
		
		String inFilename = "fichero.txt";
		FileInputStream in;
		
		try {
			in = new FileInputStream(inFilename);
		
			String outFilename = "fichero.gzip";
			GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outFilename));
			
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
			    out.write(buf, 0, len);
			}
			
			out.finish();
			out.close();
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		

	}

}
