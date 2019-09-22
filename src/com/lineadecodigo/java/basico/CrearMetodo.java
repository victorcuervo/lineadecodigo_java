package com.lineadecodigo.java.basico;

/**
 * @file MesEnTexto.java
 * @version 1.0
 * @author Christian Portilla Pauca (http://lineadecodigo.com/author/xhrist14n/)
 * @date   14.Enero.2012
 * @url    http://lineadecodigo.com/java/crear-un-metodo-en-java/
 * @description Código de la explicación para crear un método en Java.
 */



public class CrearMetodo {

	   public static int sumarNumeros(int numero1, int numero2) {
	        return numero1 + numero2;
	   }
	   
	public static void main(String[] args) {
		  // TODO code application logic here
        System.out.println("Programa de Suma de numeros iniciando");
        //iniciamos sumando 1
        int sumando1=4234;
        System.out.println("Sumando 1: "+sumando1);
        //iniciamos sumando 2
        int sumando2=64782;        
        System.out.println("Sumando 2: "+sumando1);
        // obtenemos el resultado de la suma de los dos sumandos
        int resultado= sumarNumeros(sumando1, sumando2);
        System.out.println("Resultado: "+resultado);
        //fin de ejecucion
        System.out.println("Programa de Suma de numeros finalizando");

	}

}
