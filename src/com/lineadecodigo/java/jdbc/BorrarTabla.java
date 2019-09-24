package com.lineadecodigo.java.jdbc;

/**
 * @file BorrarTabla.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/octubre/2016
 * @url  http://lineadecodigo.com/java/borrar-tabla-con-java-jdbc/
 * @description Borrar una tabla con JDBC.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class BorrarTabla {

	public static void main(String[] args) {
	
		Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;

	    String sDriver = "com.mysql.jdbc.Driver";
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";
	    
	    Properties p = new Properties();
	    p.put("user", "root");
	    p.put("password","");

	    try {

	      Class.forName(sDriver).newInstance();    
	      con = DriverManager.getConnection(sURL,p);
	      
	      try {
	        	      
	        stmt = con.prepareStatement("DROP TABLE mitabla ");  
	    	stmt.execute(); 
	    	stmt.close();
	        	        
	   
	      } catch (SQLException sqle) { 
	           System.out.println("Error en la ejecución: " 
	             + sqle.getErrorCode() + " " + sqle.getMessage());    
	      }
	   
	    } catch (Exception e) { 
	      System.out.println("Error en la conexión: " + e.toString() );
	    } finally {
	      try {
	        // Cerramos posibles conexiones abiertas
	        if (rs!=null) rs.close();
	        if (stmt!=null) stmt.close();
	        if (con!=null) con.close();    
	      } catch (Exception e) {
	        System.out.println("Error cerrando conexiones: " + e.toString());
	      } 
	    } 

	}
	
	
}
