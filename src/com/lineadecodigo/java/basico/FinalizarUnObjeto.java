package com.lineadecodigo.java.basico;

/**
 * @file FinalizarUnObjeto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   03/marzo/2011
 * @url    http://lineadecodigo.com/java/finalizar-un-objeto-en-java/
 * @description Como crear el método finalize en Java e invocarlo para que se ejecute
 */



public class FinalizarUnObjeto {
	
	public static void main(String[] args) {
		
		FinalizarUnObjeto fuo = new FinalizarUnObjeto();
		System.out.println(fuo.toString());
		fuo = null;
		System.runFinalization();				
	}

	protected void finalize() throws Throwable{
	      System.out.println("Finalizando el Objeto");
	      super.finalize();
	}
}
