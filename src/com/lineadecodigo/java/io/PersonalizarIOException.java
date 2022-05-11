package com.lineadecodigo.java.io;

/**
 * @file PersonalizarIOException.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   18/agosto/2021
 * @url    http://lineadecodigo.com/java/personalizar-ioexception/
 * @description Cómo personalizar una IOException 
 */


import java.io.*;

public class PersonalizarIOException {
    
    public static long numeroLineas(String fichero) throws IOException {

        long lNumeroLineas = 0;

        try{
            FileReader file = new FileReader(fichero);
            BufferedReader bf = new BufferedReader(file);
			
			while ((bf.readLine())!=null) {
			  lNumeroLineas++;
			}
			
			bf.close();
        }
        catch(IOException ioe){
            throw new IOException("Error en la lectura del fichero",ioe);
        }        

        return lNumeroLineas;
    }

    public static void main(String[] args) {

        String fichero = "datos.txt";
        try {
            numeroLineas(fichero);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }


    }

}
