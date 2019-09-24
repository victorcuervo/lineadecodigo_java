package com.lineadecodigo.java.jdbc;

/**
 * @file ConsultarTablaSinConocerCampos.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   9/septiembre/2007
 * @url  http://lineadecodigo.com/java/consulta-jdbc-sin-conocer-los-campos/
 * @description Realizar una select sobre una base de datos, sin conocer los campos
 */

import java.sql.*;

public class ConsultarTablaSinConocerCampos {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		
		String sDriver = "com.mysql.jdbc.Driver";
	    String sURL = "jdbc:mysql://localhost:3306/lineadecodigo";

	    try{
	      Class.forName(sDriver).newInstance();    
	      con = DriverManager.getConnection(sURL,"root","victor");
	      
	      stmt = con.prepareStatement("SELECT * FROM personas");
	      
	      rs = stmt.executeQuery();
	      
	      // Desconocemos el número de columnas y filas que tiene la tabla
	      // Primero pintamos los nombres de las columnas
	      for (int x=1;x<=rs.getMetaData().getColumnCount();x++)
    		  System.out.print(rs.getMetaData().getColumnName(x)+ "\t");
	      
	      System.out.println("");
	      
	      // Ahora volcamos los datos
	      while(rs.next()) {
	    	  for (int x=1;x<=rs.getMetaData().getColumnCount();x++)
	    		  System.out.print(rs.getString(x)+ "\t");
	      
	      	System.out.println("");
	      }

	      
	      
	    } catch (SQLException sqle){
	    	sqle.printStackTrace();
	    } catch (Exception e){
	    	e.printStackTrace();
	    } finally {
	    	if (con != null) {
	    		try{
	    			rs.close();	    		
	  	      		stmt.close();
	  	      		con.close();
	    		} catch(Exception e){
	    			e.printStackTrace();
	    		}
	    	}
	    }				
	}

}