package com.scb.cmswithjdbc.model;

public class Manager {
	private int managerId;
	private String managerName;
	private String managerEmail;
	private String managerMobNo;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(int managerId, String managerName, String managerEmail, String managerMobNo) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.managerMobNo = managerMobNo;
	}
	public int getManagerId() {
		return managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public String getManagerEmail() {
		return managerEmail;
	}
	public String getManagerMobNo() {
		return managerMobNo;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	public void setManagerMobNo(String managerMobNo) {
		this.managerMobNo = managerMobNo;
	}
	
}
