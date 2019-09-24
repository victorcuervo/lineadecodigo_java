package com.lineadecodigo.java.jdbc;

/**
 * @file WarningSQL.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/octubre/2016
 * @url  http://lineadecodigo.com/java/jdbc-sqlwarning/
 * @description Cómo gestionar los warning en una ejecución Java JDBC.  
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.Properties;

public class WarningSQL {

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
	    	stmt = con.prepareStatement("CREATE TABLE t1 (a TINYINT NOT NULL, b CHAR(4))");  
	    	stmt.execute(); 
	    	stmt.close();
	    	  
	    	// Ejecutamos una sentencia que va a tener truncado  
	        stmt = con.prepareStatement("INSERT INTO t1 VALUES(10,'mysql'), (NULL,'test'), (300,'xyz')");
	        stmt.execute();	       
	        
	        SQLWarning warning = stmt.getWarnings();
	        while (warning != null) {
	        	System.out.println("Warning");
	        	System.out.println("Message: " + warning.getMessage());
	        	System.out.println("SQLState: " + warning.getSQLState());
	        	System.out.print("Vendor error code: ");
	        	System.out.println(warning.getErrorCode());
	        	System.out.println("");
	        	warning = warning.getNextWarning();
        	}
	        stmt.close();
	        
	        // Borramos la tabla del ejemplo
	        stmt = con.prepareStatement("DROP TABLE t1 ");  
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
