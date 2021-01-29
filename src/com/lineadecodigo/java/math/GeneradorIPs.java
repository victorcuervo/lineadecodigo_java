package com.lineadecodigo.java.math;

import java.util.logging.Logger;

/**
 * @file AreaTriangulo.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   12/septiembre/2020
 * @url    http://lineadecodigo.com/java/generar-ips-con-java/
 * @description Programa que genera IPs de forma aleatoria.
 */

public class GeneradorIPs {
    

    public static int numeroAleatorio() {
        // Método que devuelve un número aleatorio entre 0 y 255
        return (int) (Math.random()*256);
    }

    public static String ipAleatoria() {
        StringBuilder sbIP = new StringBuilder();
        for (int x=0; x<3; x++) {
            sbIP.append(String.valueOf(numeroAleatorio())).append(".");
        }
        sbIP.append(String.valueOf(numeroAleatorio()));

        return sbIP.toString();

    }

    public static void main(String[] args){

       /*
            Una IP está configurada por 4 dígitos que van desde el 1 al 255.
            Así una IP podría ser 192.168.1.1

       */

       for (int x=0;x<100;x++) {
           System.out.println(ipAleatoria());
       }

    }
    
}
