package com.scb.exceptionhandlingexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {
	private static  Connection conn = null;
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Step1 : Register the Driver
		Class.forName("org.postgresql.Driver");
		
		//Step2: Establish the Connection
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/scb2022?ssl=false", "postgres", "postgres");
			//Step3: Create Statement
			Statement stmt = conn.createStatement();
			//Step4: Execute Statement
			String selectCustomer = "select * from customer";
			ResultSet rs = stmt.executeQuery(selectCustomer);
			//Step 5: Fetch Result
			System.out.println("customerid" + "\t" + "customername" + "\t" + "customeremail");
			System.out.println("=============================================================");
			while(rs.next()) {
				System.out.println(rs.getInt("customerid")+ "\t\t" + rs.getString("customername")+ "\t\t" + rs.getString("customeremail"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
