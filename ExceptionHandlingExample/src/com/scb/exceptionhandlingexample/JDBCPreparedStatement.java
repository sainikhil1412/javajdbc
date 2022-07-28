package com.scb.exceptionhandlingexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPreparedStatement {

	public static void main(String[] args) {
		// step1 : register the driver
		try {
			Class.forName("org.postgresql.Driver");

			// step2:Establish Connection
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/scb2022?ssl=false",
					"postgres", "postgres");

			// step3 : create statement
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO public.customer(customerid, customername, customeremail) VALUES (?, ?, ?);");

			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the customer details....");
			System.out.println("Enter the customer id");
			int custid = sc.nextInt();
			pstmt.setInt(1, custid);
			
			System.out.println("Enter the customer name");
			sc.nextLine();
			String custname = sc.nextLine();
			pstmt.setString(2, custname);
			
			System.out.println("Enter the customer email");
			//sc.nextLine();
			String custemail = sc.nextLine();
			pstmt.setString(3, custemail);
			// insert data in to database
			/*
			 * Executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE
			 * statement or an SQL statement that returns nothing, such as an SQL DDL
			 * statement.
			 */
			int i = pstmt.executeUpdate();
			if (i != 0) {
				System.out.println("data inserted");
			} else {
				System.out.println("data not inserted");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
