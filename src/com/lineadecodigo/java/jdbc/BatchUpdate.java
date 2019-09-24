package com.lineadecodigo.java.jdbc;

/**
 * @file ConexionMySQL.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   15/octubre/2016
 * @url  http://lineadecodigo.com/java/jdbc-batch-update/
 * @description Realizar una inserción batch sobre una base de datos
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
	    
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";

	    try {

	      con = DriverManager.getConnection(sURL,"root","");

	      con.setAutoCommit(false);
	      
	      Statement carga = con.createStatement();
	      carga.addBatch("INSERT INTO Country(country) VALUES ('Spain')");
	      carga.addBatch("INSERT INTO Country(country) VALUES ('France')");
	      carga.addBatch("INSERT INTO Country(country) VALUES ('United States')");
	      carga.addBatch("INSERT INTO Country(country) VALUES ('Brazil')");
	      carga.addBatch("INSERT INTO Country(country) VALUES ('Japan')");	     
	      carga.executeBatch();
	      
	      con.commit();	     	     
	   
	    } catch (SQLException sqle) { 
	      System.out.println(sqle.getMessage());
	      con.rollback();	      
	    } finally {
	        if (con!=null) con.close();    	      
	    } 

	}

}
