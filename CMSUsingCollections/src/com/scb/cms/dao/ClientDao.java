package com.scb.cms.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.scb.cms.model.Client;



public class ClientDao {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Client> clientList = new ArrayList<Client>();
	
	public void saveClient() {
	System.out.print("Enter the number of clients");
	int noOfClients = sc.nextInt();
	Client cl; //= new Client();
	
	for(int i =0;i<noOfClients;i++) {
		System.out.println("Enter Client " + i + " data...");
		cl = new Client();
		System.out.println("Enter Client Id");
		cl.setClientId(sc.nextInt());
		System.out.println("Enter Client Name");
		cl.setClientName(sc.next());
		System.out.println("Enter Client Email");
		cl.setClientEmail(sc.next());
		clientList.add(cl);
	}
	
	}
	
	public void displayClients() {
	System.out.println("Enter Client Data...");
	System.out.println("Client Id" + "\t" + "Client Name" + "\t" + "Client Email");
	for(Client cli : clientList) {
		System.out.println(cli.getClientId() + "\t" + cli.getClientName() + "\t" + cli.getClientEmail());
	}
	}
}
