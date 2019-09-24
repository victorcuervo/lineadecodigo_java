package com.lineadecodigo.java.jdbc;

/**
 * @file ListarDrivers.java
 * @version 1.1
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   5/agosto/2007
 * @url  http://lineadecodigo.com/java/listar-los-drivers-con-jdbc/
 * @description Utilización de la clase DriverManager para listar los drivers cargados en el sistema, así como la información relativa a los mismos.  
 */

import java.sql.*;
import java.util.Enumeration;

public class ListarDrivers {

	public static void main(String[] args) {
	   // Precargamos algunos drivers
	   String sDriver = "com.mysql.jdbc.Driver";
	   String sDriver2 = "sun.jdbc.odbc.JdbcOdbcDriver";
	   
	   try {
	     Class.forName(sDriver).newInstance();
	     Class.forName(sDriver2).newInstance();
	   } catch (Exception e){
	     e.printStackTrace();
	   }
	   
	   for (Enumeration<Driver> e = DriverManager.getDrivers(); e.hasMoreElements() ;) {
	   
	     Driver driver = e.nextElement();
	     System.out.println("Nombre: " + driver.getClass().getName());
	     System.out.println("Version: " + driver.getMajorVersion());
	     System.out.println("Release: " + driver.getMinorVersion());
	   
	     if (driver.jdbcCompliant())
	       System.out.println("Es un dirver JDBC Compliant");
	     else
	       System.out.println("NO es un driver JDBC Compliant");
	   
	   }		

	}

}
