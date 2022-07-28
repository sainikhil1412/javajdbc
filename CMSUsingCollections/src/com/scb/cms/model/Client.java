package com.scb.cms.model;
/*
 * Entity class or POJO class or Model class
 */
public class Client {
	
	private int clientId;
	private String clientName;
	private String clientEmail;
	private static String bankName = "SCB";
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	
	public Client() {
		super();
	}
	public Client(int clientId) {
		super();
		this.clientId = clientId;
	}
	public Client(int clientId, String clientName) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
	}
	public Client(int clientId, String clientName, String clientEmail) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientEmail = clientEmail;
	}
	
	

}
