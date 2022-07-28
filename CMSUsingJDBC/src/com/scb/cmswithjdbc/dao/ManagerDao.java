package com.scb.cmswithjdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.scb.cmswithjdbc.helper.DBConnection;
import com.scb.cmswithjdbc.model.Manager;


public class ManagerDao {
	public static Connection conn = null;

	public ManagerDao() {
		conn = DBConnection.getDBConnection();
	}

	public void insertManager(Manager mgr) {

		// step3 : create statement
		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO public.manager(\r\n"
					+ "	managerid, managername, manageremail, managermobno)\r\n" + "	VALUES (?, ?, ?, ?);");
			pstmt.setInt(1, mgr.getManagerId());
			pstmt.setString(2, mgr.getManagerName());
			pstmt.setString(3, mgr.getManagerEmail());
			pstmt.setString(4, mgr.getManagerMobNo());
			int i = pstmt.executeUpdate();
			if (i != 0) {
				System.out.println("manager added Successfully");
			} else {
				System.out.println("manager not added Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateManager(Manager mgr) {

		// step3 : create statement
		try {
			PreparedStatement pstmt = conn.prepareStatement("UPDATE public.manager\r\n"
					+ "	SET  managermobno=?\r\n" + "	WHERE managerid = ?;");
			pstmt.setInt(2, mgr.getManagerId());
			pstmt.setString(1, mgr.getManagerMobNo());
			int i = pstmt.executeUpdate();
			if (i != 0) {
				System.out.println("manager updated Successfully");
			} else {
				System.out.println("manager not updated Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean selectManagerById(int managerID) {
		int flag =0;
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from manager where managerid = ?");
			pstmt.setInt(1, managerID);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("manager found");
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

	public void selectAllManagers() {
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from manager");
			ResultSet rs = pstmt.executeQuery();
			System.out.println("manager Id" + "\t" + "manager Name" + "\t" + "manager Email"+ "\t" + "manager MobileNo");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)+ "\t" + rs.getString(4));

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteManagerById(int cid) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("delete from manager where managerid = ?");
			pstmt.setInt(1, cid);
			int i = pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("manager deleted successfully");
			}else {
				System.out.println("manager not deleted");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
