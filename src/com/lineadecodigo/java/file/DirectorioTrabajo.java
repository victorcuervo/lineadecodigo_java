package com.lineadecodigo.java.file;

/**
 * @file DirectorioTrabajo.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   12/septiembre/2011
 * @url    http://lineadecodigo.com/java/conocer-el-directorio-de-trabajo-de-java/
 * @description Como saber en qué directorio se está ejecutando el programa Java
 */

public class DirectorioTrabajo {

	public static void main(String[] args) {		
		String sDirectorioTrabajo = System.getProperty("user.dir");
		System.out.println("El directorio de trabajo es " + sDirectorioTrabajo);

	}

}
