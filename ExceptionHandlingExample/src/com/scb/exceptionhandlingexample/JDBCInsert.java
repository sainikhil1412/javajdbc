package com.scb.exceptionhandlingexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws Exception {
		// step1 : register the driver
		Class.forName("org.postgresql.Driver");
		
		//step2:Establish Connection
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/scb2022?ssl=false", "postgres", "postgres");

	    //step3 : create statement
		Statement stmt = conn.createStatement();
		
		//insert data in to database
		/*
		 * Executes the given SQL statement, which may be an INSERT, UPDATE, 
		 * or DELETE statement or an 
		 * SQL statement that returns nothing, such as an SQL DDL statement. 		
		 */
	  int i = stmt.executeUpdate("INSERT INTO public.customer(customerid, customername, customeremail) VALUES (155, 'Rima', 'Rima@gmail.com');"); 
	  
		if (i != 0) {
			System.out.println("data inserted");
		} else {
			System.out.println("data not inserted");
		}
				 
	}
		
}
