package com.lineadecodigo.java.jdbc;

/**
 * @file TruncarCampos.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/octubre/2016
 * @url  http://lineadecodigo.com/java/truncar-campos-sql/
 * @description Activar para realizar truncado de datos a la hora de hacer un insert.  
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TruncarCampos {

	public static void main(String[] args) {
		Connection con = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;

	    String sDriver = "com.mysql.jdbc.Driver";
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";
	    
	    Properties p = new Properties();
	    p.put("user", "root");
	    p.put("password","");
	    p.put("jdbcCompliantTruncation","false");

	    try {

	      Class.forName(sDriver).newInstance();    
	      con = DriverManager.getConnection(sURL,p);
	      
	      try {

	        // Creamos una tabla	    	  
	    	stmt = con.prepareStatement("CREATE TABLE temporal (campo CHAR(4))");  
	    	stmt.execute(); 
	    	stmt.close();
	    	  
	    	// Ejecutamos una sentencia que va a tener truncado  
	        stmt = con.prepareStatement("INSERT INTO temporal VALUES ('Java'), ('Angular'), ('NodeJS'),('Clojure'),('Polymer')");
	        stmt.execute();	       	        
	        stmt.close();
	        
	        stmt = con.prepareStatement("SELECT campo FROM temporal");
	        rs = stmt.executeQuery();
	   
	        while (rs.next())
	        	System.out.println (rs.getString("campo"));
	        stmt.close();
	        	        
	        stmt = con.prepareStatement("DROP TABLE temporal");  
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
