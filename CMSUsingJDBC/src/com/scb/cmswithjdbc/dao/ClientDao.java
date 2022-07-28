package com.scb.cmswithjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.scb.cmswithjdbc.helper.DBConnection;
import com.scb.cmswithjdbc.model.Client;

public class ClientDao {
	public static Connection conn = null;

	public ClientDao() {
		conn = DBConnection.getDBConnection();
	}

	public void insertClient(Client cl) {

		// step3 : create statement
		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO public.client(\r\n"
					+ "	clientid, clientname, clientemail, clientmobno)\r\n" + "	VALUES (?, ?, ?, ?);");
			pstmt.setInt(1, cl.getClientId());
			pstmt.setString(2, cl.getClientName());
			pstmt.setString(3, cl.getClientEmail());
			pstmt.setString(4, cl.getClientMobNo());
			int i = pstmt.executeUpdate();
			if (i != 0) {
				System.out.println("Client added Successfully");
			} else {
				System.out.println("Client not added Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateClient(Client cl) {

		// step3 : create statement
		try {
			PreparedStatement pstmt = conn.prepareStatement("UPDATE public.client\r\n"
					+ "	SET  clientmobno=?\r\n" + "	WHERE clientid = ?;");
			pstmt.setInt(2, cl.getClientId());
			pstmt.setString(1, cl.getClientMobNo());
			int i = pstmt.executeUpdate();
			if (i != 0) {
				System.out.println("Client updated Successfully");
			} else {
				System.out.println("Client not updated Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean selectClientById(int clientID) {
		int flag =0;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from client where clientid = ?");
			pstmt.setInt(1, clientID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Client found");
				flag = 1;
			}else {
				flag =0;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(flag == 1) {
			return true;
		}else {
			return false;
		}
	}

	public void selectAllClients() {
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from client");
			ResultSet rs = pstmt.executeQuery();
			System.out.println("Client Id" + "\t" + "Client Name" + "\t" + "Client Email"+ "\t" + "Client MobileNo");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)+ "\t" + rs.getString(4));

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteClientById(int cid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("delete from client where clientid = ?");
			pstmt.setInt(1, cid);
			int i = pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("Client deleted successfully");
			}else {
				System.out.println("Client not deleted");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
