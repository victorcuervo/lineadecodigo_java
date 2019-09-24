package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file RaicesSistemaFicheros.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   13/septiembre/2011
 * @url    http://lineadecodigo.com/java/unidades-del-sistema-de-ficheros-con-java/
 * @description Programa que nos permite saber cuantas unidades (raices o root) hay en nuestro sistema
 */

public class UnidadesSistemaFicheros {

	public static void main(String[] args) {
		
		File[] roots = File.listRoots();
		for (int i=0; i<roots.length; i++) {
		    System.out.println(roots[i]);
		}

	}

}
