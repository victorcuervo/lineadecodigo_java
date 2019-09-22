package com.lineadecodigo.java.basico;

/**
 * @file EjecutarUnComando.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   8/abril/2012
 * @url    http://lineadecodigo.com/java/convertir-un-numero-a-texto/
 * @description Convertir un número a formato texto. De 234 a "doscientos treinta y cuatro".
 */

public class NumerosEnTexto {


	public static String unidadEnTexto(int iNumero){
		// Método que dado un número me lo devuelve en texto
		
		switch(iNumero){
			case 1:
				return "uno";
			case 2:
				return "dos";
			case 3:
				return "tres";
			case 4:
				return "cuatro";
			case 5:
				return "cinco";
			case 6:
				return "seis";
			case 7:
				return "siete";
			case 8:
				return "ocho";
			case 9:
				return "nueve";
			case 0:
				return "cero";
			default:
				return "";
		}
		
	}
	
	public static String decenaEnTexto(int iDecena){

		// 	Método que devuelve las decenas
		
		switch (iDecena){
			case 1:
				return "diez";
			case 2:
				return "veinte";
			case 3:
				return "treinta";
			case 4:
				return "cuarenta";
			case 5:
				return "cincuenta";
			case 6:
				return "sesenta";
			case 7:
				return "setenta";
			case 8:
				return "ochenta";
			case 9:
				return "noventa";		
			default:
				return "";
		}
	}
	
	
	public static String decenas(int iDecena){
		
		// Las decenas del 10 no se pueden crear con una decena y la unidad. Cada uno es diferente.
		
		switch (iDecena){
			case 11:
				return "once";
			case 12:
				return "doce";
			case 13:
				return "trece";
			case 14:
				return "catorce";
			case 15:
				return "quince";
			case 16:
				return "dieciseis";
			case 17:
				return "diecisiete";
			case 18:
				return "dieciocho";
			case 19:
				return "diecinueve";		
			default:
				return "";
		}
	}
	
	public static String centenaEnTexto(int iCentena){
		
		/*	Centenas
			Ciento, doscientos, trescientos, cuatrocientos,...
			Hay un factor común en dos,tres,cuatro,seis,siete,ocho,
			Ciento, novecientos y quinientos no tinen nada en común.
		*/
		
		switch (iCentena){
			case 1:
				return "ciento";
			case 5:
				return "quinientos";
			case 9:
				return "novecientos";				
			default:
				return "";
		}
	}
	
	public static String numeroEnTexto(int iNumero){

		String sTexto = "";
						
		int iUnidad = iNumero%10;
		iNumero = iNumero/10;
		
		sTexto = unidadEnTexto(iUnidad);
		
		int iDecena = iNumero%10;
		iNumero = iNumero/10;
		
		if ((iUnidad==0) && (iDecena>0))
			sTexto = decenaEnTexto(iDecena);
		else if (iDecena==1)
				sTexto = decenas(10+iUnidad);
		else if (iDecena > 1)
		 		sTexto = decenaEnTexto(iDecena) + " y " + sTexto;
		
		int iCentena = iNumero%10;
		
		if ((iCentena!=1) && (iCentena!=5) && (iCentena!=9) && (iCentena!=0))
			sTexto = unidadEnTexto(iCentena) + "cientos" + " " + sTexto;
		else if ((iCentena==1) || (iCentena==5) || (iCentena==9))
			sTexto = centenaEnTexto(iCentena) + " " + sTexto;
		
		return sTexto;
	}
	
	
	public static void main(String[] args) {
		
		for (int x=0;x<1000;x++){
			System.out.println(x + " - " + numeroEnTexto(x));
		}

	}

}
