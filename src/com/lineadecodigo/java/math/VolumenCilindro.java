package com.lineadecodigo.java.math;

/*
* @file VolumenCilindro.java
* @version 1.0
* @author Ariel Carraro
* @date   19/diciembre/2013
* @url    http://lineadecodigo.com/java/calcular-el-volumen-de-un-cilindro-en-java/
* @description Programa que calcula el volumen de un cilindro usando interfaces
*/

public class VolumenCilindro{
	
	public static void main(String[] args) {
		Servicios cilindro=new Cilindro(2,6);
		cilindro.ver();
	}
}

interface Servicios{
	public abstract double volumen();
	public abstract void ver(); 
}

class Cilindro implements Servicios{
	private double radio;
	private double altura;

	public Cilindro(){}

	public Cilindro(double _radio,double _altura){
		this.radio=_radio;
		this.altura=_altura;
	}

	@Override
	public void ver(){
		System.out.println(toString());
	}

	public String toString(){
		return String.format("volumen obtenido : %f",volumen());
	}

	@Override
	public double volumen(){
		return Math.PI*(radio*radio)*altura;
	}
}