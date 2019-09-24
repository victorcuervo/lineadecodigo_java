package com.lineadecodigo.java.basico.system;

/**
 * @file SistemaOperativo.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   17/febrero/2009
 * @url    http://lineadecodigo.com/java/conocer-el-sistema-operativo-con-java/
 * @description Saber el sistema operativo en el que se ejecuta el código java
 */

public class SistemaOperativo {

	public static void main(String[] args) {
		String sSistemaOperativo = System.getProperty("os.name");
		System.out.println(sSistemaOperativo);
	}

}
