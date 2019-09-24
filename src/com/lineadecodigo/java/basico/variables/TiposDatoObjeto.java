package com.lineadecodigo.java.basico.variables;

/**
 * @file TiposDatoObjeto.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/tipos-de-datos-objeto-en-java/
 * @description Convertir tipos de datos objeto a primitivos y viceversa
 */

public class TiposDatoObjeto {

	public static void main(String[] args) {
		
		 Boolean refBoolean = new Boolean(true);
		 boolean bool = refBoolean.booleanValue();
		 System.out.println(bool);
		    
		    
		 Byte refByte = new Byte((byte) 123);
		 byte b = refByte.byteValue();
		 System.out.println(b);
		    
		    
		 Character refChar = new Character('x');
		 char c = refChar.charValue();
		 System.out.println(c);
		    
		    
		 Short refShort = new Short((short) 123);
		 short s = refShort.shortValue();
		 System.out.println(s);
		    
		    
		 Integer refInt = new Integer(123);
		 int i = refInt.intValue();
		 System.out.println(i);
		    
		    
		 Long refLong = new Long(123L);
		 long l = refLong.longValue();
		 System.out.println(l);
		    
		    
		 Float refFloat = new Float(12.3F);
		 float f = refFloat.floatValue();
		 System.out.println(f);
		    
		    
		 Double refDouble = new Double(12.3D);
		 double d = refDouble.doubleValue();
		 System.out.println(d);
		 
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
