package com.postal.DB;

import java.sql.Connection;
import java.sql.DriverManager;
public class PostgreSQLJDBCConnection {
	static Connection c = null;
	static void DBConnection() {
		
		      try {
		         Class.forName("org.postgresql.Driver");
		         c = DriverManager
		            .getConnection("jdbc:postgresql://localhost:5432/postmanpostgresDB",
		            "mudhitha", "d19870503");
		         
		      } catch (Exception e) {
		         e.printStackTrace();
		         System.err.println(e.getClass().getName()+": "+e.getMessage());
		         System.exit(0);
		      }
		      System.out.println("Opened database successfully");
		   
	}

}
