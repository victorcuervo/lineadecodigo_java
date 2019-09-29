package com.lineadecodigo.java.net;

/**
 * @file DescargarArchivo.java
 * @version 1.0
 * @author  Feffo Calendino (http://lineadecodigo.com)
 * @date   21/marzo/2012
 * @url    http://lineadecodigo.com/java/como-descargar-un-archivo-en-java/
 * @description Lectura del contenido de una URL  
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class DescargarArchivo {

	public static void main(String[] args) {

		String url = "http://i.imgur.com/HZ1hq.jpg";
		String name = "lineadecodigo.jpg";

		// datos basicos para una descarga
		String folder = "descargas/";
		
		// crea el directorio de destino en caso de que no exista
		File dir = new File(folder);

		if (!dir.exists())
			if (!dir.mkdir())
				return; // no se pudo crear la carpeta de destino

		// Crea el archivo destino
		File file = new File(folder + name);

		try {

			// establece la conexion con la url
			URLConnection conn = new URL(url).openConnection();
			conn.connect();

			System.out.println("\nempezando descarga: \n");
			System.out.println(">> URL: " + url);
			System.out.println(">> Nombre: " + name);
			System.out.println(">> tamaño: " + conn.getContentLength()
					+ " bytes");

			// Abre los streams
			InputStream in = conn.getInputStream();
			OutputStream out = new FileOutputStream(file);

			int b = 0;

			// este ciclo lee de a un byte por vez y los escribe en un archivo
			// el -1 significa que se llego al final
			while (b != -1) {
				b = in.read();

				if (b != -1)
					out.write(b);
			}

			// Cierra los streams
			out.close();
			in.close();

			System.out.println("\ndescarga finalizada\n");
		} catch (MalformedURLException e) {
			System.out.println("la url: " + url + " no es valida!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	

