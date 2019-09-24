package com.lineadecodigo.java.jdbc;

/**
 * @file ErrorBatchUpdate.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/octubre/2016
 * @url  http://lineadecodigo.com/java/ejemplo-batchupdateexception/
 * @description Como controlar un error en un Java Batch Update
 */

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ErrorBatchUpdate {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
	    
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";

	    try {

	      con = DriverManager.getConnection(sURL,"root","");
	      con.setAutoCommit(false);
	      
	      
	      PreparedStatement stmt = con.prepareStatement("CREATE TABLE temporal (numero TINYINT(1) NOT NULL)");  
	      stmt.execute(); 
	      stmt.close();
	      
	      stmt = con.prepareStatement("CREATE UNIQUE INDEX indicenumero ON temporal(numero)");  
	      stmt.execute(); 
	      stmt.close();	     

	      
	      // Valores  cargar en la base de datos
	      int[] valores = {1,2,2,3,1,4,1,2};	      
	      
	      try {
	       
	    	  PreparedStatement carga = con.prepareStatement("INSERT INTO temporal VALUES (?)");	    	 
	    	  
	    	  for (int x=0;x<valores.length;x++) {
	    		  carga.setInt(1, valores[x]);
	    		  carga.addBatch();
	    	  }
	    	  carga.executeBatch();
	    	  
	      } catch (BatchUpdateException bue) {
	    	  int[] errores = bue.getUpdateCounts();
	    	  System.out.println("--Errores en el Batch--\n");
	    	  
	    	  for (int x=0;x<errores.length;x++) {
	    		  if (errores[x] < 0) 
	    			  System.out.print("Error insertando el valor " + valores[x] + " de la posición " + x + "\n");
	    	  }
		    	  	    	 	    	  
	      }
	      
	      con.commit();	    
	      
	 
	      stmt = con.prepareStatement("DROP TABLE temporal");  
	      stmt.execute(); 
	      stmt.close();
	      
	   
	    } catch (SQLException sqle) { 
	      System.out.println(sqle.getMessage());
	      con.rollback();	      
	    } finally {
	        if (con!=null) con.close();    	      
	    } 

	}
	
}
