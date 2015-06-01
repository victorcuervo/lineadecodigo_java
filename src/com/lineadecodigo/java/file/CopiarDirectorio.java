package com.lineadecodigo.java.file;

/**
 * @file CopiarDirectorio.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   11/septiembre/2011
 * @url    http://lineadecodigo.com/java/copiar-directorio-con-java/
 * @description Copia del contenido de un directorio sobre otro. Para ello se trabaja de forma recursiva.  
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiarDirectorio {
	
	public static void copiarFicheros(File f1, File f2){
		
		try {
			InputStream in = new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);
				
			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		
			in.close();
			out.close();
			
			System.out.println("Copiando fichero " + f1.toString());
			
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
	

	public static void copiarDirectorios(File d1, File d2){
		
		// Comprobamos que es un directorio
		if (d1.isDirectory()){
			//Comprobamos si existe el directorio destino, si no lo creamos
			if (!d2.exists()){				
				d2.mkdir();
				System.out.println("Creando directorio " + d2.toString());
			}

			// Sacamos todos los ficheros del directorio
			String[] ficheros = d1.list();
			for (int x=0;x<ficheros.length;x++) {
				// Por cada fichero volvemos a llamar recursivamente a la copa de directorios
				copiarDirectorios(new File(d1,ficheros[x]),new File(d2,ficheros[x]));				
			}
			
			
		} else {
			copiarFicheros(d1,d2);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File d1 = new File("c:\\temp");
		File d2 = new File("c:\\temp2");
		
		System.out.println("--Inicio de la copia--");
		copiarDirectorios(d1,d2);
		System.out.println("--Fin de la copia--");
		

	}

}
