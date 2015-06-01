package com.lineadecodigo.java.basico.system;

/**
 * @file SistemaOperativo.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   17-febrero-2009
 * @url    http://lineadecodigo.com/2009/02/18/conocer-el-sistema-operativo-con-java/
 * @description Saber el sistema operativo en el que se ejecuta el código java
 */

public class SistemaOperativo {

	public static void main(String[] args) {
		String sSistemaOperativo = System.getProperty("os.name");
		System.out.println(sSistemaOperativo);
	}

}
