package com.lineadecodigo.java.basico;

/**
 * @file ConversorTemperaturas.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   06/enero/2013
 * @url     http://lineadecodigo.com/java/convertir-temperatura-de-grados-centigrados-a-grados-farenheit-en-java/
 * @description Programa que convierte grados cent’grados en grados farenheit y viceversa.  
 */

public class ConversorTemperaturas {

    private double FarenheitDegrees;
    private double CentigradesDegrees;
    
    public void setFarenheit(double c){
        this.FarenheitDegrees=c;
        this.CentigradesDegrees=farenheitToCentigrades(c);
    }
    public void setCentigrades(double c){
        this.CentigradesDegrees=c;
        this.FarenheitDegrees=centigradesToFarenheit(c);
    }
    public double getFarenheit(){
        return this.FarenheitDegrees;
    }
    public double getCentigrades(){
        return this.CentigradesDegrees;
    }
    /*
     Conversion de grados centigrados a farenheit
     */
    public static double centigradesToFarenheit(double degrees){
        double result=degrees;
        result=result*2-result/5;
        result=result+32;
        return result;
    }
    /*
     Conversion de grados celsius a centigrados
     */
    public static double farenheitToCentigrades(double degrees){
        double result=0;
        result=degrees-32;
        result*=5;
        result/=9;
        return result;
    }
	
	
	public static void main(String[] args) {

		ConversorTemperaturas ct = new ConversorTemperaturas();
		
		double centigrados = 32;
		ct.setCentigrades(centigrados);
		
		System.out.println(centigrados + " grados cent’grados son " + ct.getFarenheit() + " grados farenheit");
		
	}

}
