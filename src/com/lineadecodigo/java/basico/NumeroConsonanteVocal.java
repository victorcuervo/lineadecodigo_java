package com.lineadecodigo.java.basico;

import java.io.IOException;

/**
 * @file NumeroConsonanteVocal.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  12/septiembre/2020
 * @url    http://lineadecodigo.com/java/numero-consonante-o-vocal-en-java/
 * @description Saber si el carácter introducido por consola es un número, una consonante o una vocal.
 */


public class NumeroConsonanteVocal {

    public static boolean esUn(char[] caracteres, char c) {
        return (new String(caracteres).indexOf(c) >= 0)?true:false;
   }


    public static void main(String[] args) {

        char[] vocales = {'a','e','i','o','u'};
        char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
  
        try {
            System.out.println("Introduce un carácter en la consola y pulsa intro");
            char c = (char) System.in.read();
            
            if (esUn(consonantes,c)) {
                System.out.println("Has insertado una consonante");
            } else if (esUn(numeros,c)) {
                System.out.println("Has insertado un número");
            } else if (esUn(vocales,c)) {
                System.out.println("Has insertado una vocal");
            } else {
                System.out.println("Has insertado algo que no es una consonante, ni un número, ni una vocal");
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        
    }
    
}
