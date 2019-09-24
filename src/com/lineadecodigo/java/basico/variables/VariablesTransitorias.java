package com.lineadecodigo.java.basico.variables;

/**
 * @file VariablesTransitorias.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/variables-java-transient/
 * @description Explicación sobre el funcionamiento del argumento transient
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import com.lineadecodigo.base.Usuario;

public class VariablesTransitorias {
	
	public static void main(String[] args) throws Exception {
	    Usuario miusuario = new Usuario("Victor", "1234");
	    System.out.println(miusuario);
	    ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("user.out"));
	    o.writeObject(miusuario);
	    o.close();

	    Thread.sleep(1000); // esperamos un segundo

	    ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.out"));
	    System.out.println("Recupero el objeto " + new Date());
	    miusuario = (Usuario) in.readObject();
	    System.out.println(miusuario);
	    in.close();
	    
	  }
	


}

	
	