package com.lineadecodigo.java.basico;


/**
 * @file Binario2Decimal.java
 * @version 1.0
 * @author Pablo Ruiz (http://lineadecodigo.com)
 * @date   02/octubre/2010
 * @url    http://lineadecodigo.com/java/transformar-codigo-binario-a-decimal/
 * @description Convertir un código binario en decimal
 */

public class Binario2Decimal {
	    
	int decimal;

	public void escribirBinario(String digitoBinario){

	  	if(digitoBinario != null){
	   		System.out.println("El binario ingresado es: "+digitoBinario);
	   		try{
	   			this.decimal =  Integer.parseInt(digitoBinario,2);
	   		}catch(Exception ex){
	   			System.out.print("Se a generado el siguiente error: "+ex.getMessage());
	   		}
	   	}else{
	   		System.out.print("Ingresar un String");
	   	}
	}

	public int getDecimal(){
		return decimal;
	}

	public static void main(String args[]){
		Binario2Decimal btd = new Binario2Decimal();
		btd.escribirBinario("10101010");
		System.out.println("Decimal: "+btd.getDecimal());
	}
}
