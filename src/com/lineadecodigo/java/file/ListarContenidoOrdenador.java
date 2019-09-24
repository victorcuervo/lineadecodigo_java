package com.lineadecodigo.java.file;

/**
 * @file ListarContenidoOrdenador.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   14/septiembre/2011
 * @url    http://lineadecodigo.com/java/listar-contenido-del-ordenador/
 * @description Programa que lista todo el contenido de las unidades del ordenador
 */

import java.io.File;

public class ListarContenidoOrdenador {


	public static void listarDirectorio(File f, String separador){
		File[] ficheros = f.listFiles();
		
		if (ficheros!=null){
			for (int x=0;x<ficheros.length;x++){			
				System.out.println(separador + ficheros[x].getName());
			
				if (ficheros[x].isDirectory()){
					String nuevo_separador;
					nuevo_separador = separador + " ";
					listarDirectorio(ficheros[x],nuevo_separador);
				}
			}
		}
	}

	
	
	public static void main(String[] args) {
			
			File[] roots = File.listRoots();
			for (int i=0; i<roots.length; i++) {			    
				System.out.println("--- LISTANDO UNIDAD " + roots[i] + " ---");
				listarDirectorio(roots[i],"");				
			}
					
	}

}
