package com.scb.cmswithjdbc.model;

public class Client {
	
	private int clientId;
	private String clientName;
	private String clientEmail;
	private String clientMobNo;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(int clientId, String clientName, String clientEmail) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
	}
	
	
	public Client(int clientId, String clientName, String clientEmail, String clientMobNo) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.clientMobNo = clientMobNo;
	}
	public int getClientId() {
		return clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientMobNo() {
		return clientMobNo;
	}
	public void setClientMobNo(String clientMobNo) {
		this.clientMobNo = clientMobNo;
	}
	
	

}
