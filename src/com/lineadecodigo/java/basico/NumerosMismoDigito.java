package com.lineadecodigo.java.basico;

/**
 * @file NumerosMismoDigito.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date  09/octubre/2022
 * @url   http://lineadecodigo.com/java/xxx/
 * @description Comprobar que dos números comparte al menos un mismo dígito
 */

public class NumerosMismoDigito {

    public static void main(String[] args) {
        
        int n1 = 12345;
        int n2 = 67890;

        String sn1 = Integer.toString(n1);
        String sn2 = Integer.toString(n2);

        int n1size = sn1.length();
        int n2size = sn2.length();

        boolean bMismoDigito = false;

        int iContador1 = 0;
        int iContador2 = 0;

        while ((!bMismoDigito) && (iContador1<n1size)) {

            while ((!bMismoDigito) && (iContador2<n2size)) {

                if (sn1.charAt(iContador1) == sn2.charAt(iContador2))
                    bMismoDigito = true;

                iContador2++;                
            }
            iContador2 = 0;
            iContador1++;
        }

        if (bMismoDigito)
            System.out.println("Comparte un dígito");
        else
            System.out.println("NO comparten un dígito");

    }
    
}
