package com.lineadecodigo.base;

/**
 * @file Web.java
 * @version 1.2
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   4/marzo/2007
 * @url		No Aplica
 * @description Clase de ejemplo que representa a una web (titulo + url)
 */


public class Web {
	
	private String titulo ="LocalHost";
	private String URL = "http://localhost";
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String url) {
		URL = url;
	}
	
	

}
