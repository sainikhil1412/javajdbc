package com.scb.cmswithjdbc.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection conn = null;
	public static Connection getDBConnection() {
		
		
	
				try {
					// step1 : register the driver
					Class.forName("org.postgresql.Driver");
					//step2:Establish Connection
					conn =	DriverManager.getConnection("jdbc:postgresql://localhost:5432/cms?ssl=false", "postgres", "postgres");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return conn;
				
				
		
	}

}
