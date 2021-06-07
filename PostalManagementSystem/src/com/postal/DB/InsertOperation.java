package com.postal.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgreSQLJDBCConnection con=new PostgreSQLJDBCConnection();
		con.DBConnection();
		Statement stmt = null;
	      try {
	    
	         stmt = con.c.createStatement();
	         String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (1, 'Paul', 32, 'California', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
	         stmt.executeUpdate(sql);

	         sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
	            + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
	         stmt.executeUpdate(sql);

	         stmt.close();
	         con.c.setAutoCommit(false);
	         con.c.commit();
	         con.c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Records created successfully");
	}

}
