package com.lineadecodigo.java.basico;

/**
 * @file LanzarGarbageCollector.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/marzo/2011
 * @url    http://lineadecodigo.com/java/lanzar-el-garbage-collector-en-java/
 * @description Código que ejecuta el Garbage Collector
 */

public class LanzarGarbageCollector {

	public static void main(String[] args) {
				
		LanzarGarbageCollector lgc = new LanzarGarbageCollector();
		System.out.println(lgc.toString());
		lgc = null;
		System.gc();				
	}

	protected void finalize() throws Throwable{
	      System.out.println("Finalizando el Objeto");
	      super.finalize();
	}			
	
}
