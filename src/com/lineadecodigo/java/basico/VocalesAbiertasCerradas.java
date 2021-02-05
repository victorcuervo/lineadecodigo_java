package com.lineadecodigo.java.basico;

/**
 * @file VocalesAbiertasCerradas.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   31/enero/2021
 * @url  http://lineadecodigo.com/java/vocales-abiertas-y-cerradas-con-java/
 * @description Código que dada una frase cuenta las vocales abiertas (a,e y o) y las cerradas ()
 */

import java.util.Scanner;

public class VocalesAbiertasCerradas {


    public static void main(String[] args) {
        
        System.out.println("Introduce una frase y pulsa intro.");
        Scanner reader = new Scanner(System.in);
        String frase = reader.nextLine();
        int[] abiertaCerrada = contadorAbiertasCerradas(frase);
        System.out.println("La frase tiene " + abiertaCerrada[0] + " vocales abiertas y " + abiertaCerrada[1] + " vocales cerradas.");
        reader.close();
    }

    private static int[] contadorAbiertasCerradas(String s) {
        
        int[] abiertaCerrada = {0,0};
        // todo a minúsculas
        s = s.toLowerCase();

        for (int x=0;x<s.length();x++) {
            if ((s.charAt(x)=='a') || (s.charAt(x)=='e') || (s.charAt(x)=='o'))
                abiertaCerrada[0] = abiertaCerrada[0] + 1;
            else if ((s.charAt(x)=='i') || (s.charAt(x)=='u'))
                abiertaCerrada[1] = abiertaCerrada[1] + 1;
        }

        return abiertaCerrada;
        
    }
    

}
