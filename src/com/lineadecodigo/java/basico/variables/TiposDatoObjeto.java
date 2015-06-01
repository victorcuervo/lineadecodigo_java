package com.lineadecodigo.java.basico.variables;

/**
 * @file TiposDatoObjeto.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/tipos-de-datos-objeto-en-java/
 * @description Convertir tipos de datos objeto a primitivos y viceversa
 */

public class TiposDatoObjeto {

	public static void main(String[] args) {
		
		 Boolean refBoolean = new Boolean(true);
		 boolean bool = refBoolean.booleanValue();
		    
		    
		 Byte refByte = new Byte((byte) 123);
		 byte b = refByte.byteValue();
		    
		    
		 Character refChar = new Character('x');
		 char c = refChar.charValue();
		    
		    
		 Short refShort = new Short((short) 123);
		 short s = refShort.shortValue();
		    
		    
		 Integer refInt = new Integer(123);
		 int i = refInt.intValue();
		    
		    
		 Long refLong = new Long(123L);
		 long l = refLong.longValue();
		    
		    
		 Float refFloat = new Float(12.3F);
		 float f = refFloat.floatValue();
		    
		    
		 Double refDouble = new Double(12.3D);
		 double d = refDouble.doubleValue();
		 
		 // Por qué no se usan los tipos de datos objeto
		 Integer uno = new Integer(1);
		 Integer dos = new Integer(1);
		 
		 if (uno == dos)
			 System.out.println("Iguales");
		 else
			 System.out.println("Diferentes");
		 
		 Integer tres = uno+dos;
		 System.out.println(tres);
		 
	}

}
