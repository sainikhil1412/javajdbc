package com.scb.cmswithjdbc.controller;

import java.util.Scanner;

import com.scb.cmswithjdbc.dao.ClientDao;
import com.scb.cmswithjdbc.exception.ClientNotFoundException;
import com.scb.cmswithjdbc.model.Client;



public class ClientController {
	
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice;
	ClientDao cdao = new ClientDao();
	Client cl = new Client();
	
	public void readClientData() {
		System.out.println("Enter Client Details....");
		System.out.println("Enter Client Id");
		cl.setClientId(sc.nextInt());
		System.out.println("Enter Client Name");
		cl.setClientName(sc.next());
		System.out.println("Enter Client Email");
		cl.setClientEmail(sc.next());
		System.out.println("Enter Client Mobno");
		cl.setClientMobNo(sc.next());
	}
	
	public int readClientID() {
		System.out.println("Enter Client Details....");
		System.out.println("Enter Client Id");
		int clientId = sc.nextInt();
		return clientId;
	}
	public void selectClientCRUD() throws ClientNotFoundException {
		
		while(ch == 'y') {
			System.out.println("Select the Client CRUD operation");
			System.out.println("1. Create");
			System.out.println("2. Update");
			System.out.println("3. Select");
			System.out.println("4. SelectAll");
			System.out.println("5. Delete");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				readClientData();
				cdao.insertClient(cl);
				break;
			case 2:
				
				int cid = readClientID();
				if(!cdao.selectClientById(cid)) {
					throw new ClientNotFoundException("Client with id " + cid + " not found");
				}else {
					readClientData();
					cdao.updateClient(cl);
				}
				
				break;
			case 3:
				cdao.selectClientById(readClientID());
				break;
			case 4:
				cdao.selectAllClients();
				break;
			case 5:
				int cid1 = readClientID();
				if(!cdao.selectClientById(cid1)) {
					throw new ClientNotFoundException("Client with id " + cid1 + " not found");
				}else {
					//readClientData();
					cdao.deleteClientById(cid1);
				}
				
				break;
			default:
				System.out.println("Not a right choice");
				break;
			}
			
			System.out.println("do u want to continue...(y-yes/n-no");
			ch = sc.next().charAt(0);
			
		}
	}

}
