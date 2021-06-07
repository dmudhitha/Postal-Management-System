package com.postal.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SelectOpertaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgreSQLJDBCConnection con=new PostgreSQLJDBCConnection();
		con.DBConnection();
	      Statement stmt = null;
	      try {
	         stmt = con.c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  name = rs.getString("name");
	            int age  = rs.getInt("age");
	            String  address = rs.getString("address");
	            float salary = rs.getFloat("salary");
	            System.out.println( "ID = " + id );
	            System.out.println( "NAME = " + name );
	            System.out.println( "AGE = " + age );
	            System.out.println( "ADDRESS = " + address );
	            System.out.println( "SALARY = " + salary );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	         con.c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Operation done successfully");
	}

}