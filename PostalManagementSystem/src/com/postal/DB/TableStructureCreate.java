package com.postal.DB;

import java.sql.*;
public class TableStructureCreate {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgreSQLJDBCConnection con=new PostgreSQLJDBCConnection();
		con.DBConnection();
	      Statement stmt = null;
	      try {
	         stmt = con.c.createStatement();
	         String sql = "CREATE TABLE COMPANY " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " +
	            " AGE            INT     NOT NULL, " +
	            " ADDRESS        CHAR(50), " +
	            " SALARY         REAL)";
	         stmt.executeUpdate(sql);
	         stmt.close();
	         con.c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Table created successfully");
	}

}
