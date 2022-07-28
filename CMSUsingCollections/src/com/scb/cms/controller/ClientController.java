package com.scb.cms.controller;

import java.util.Scanner;

import com.scb.cms.dao.ClientDao;

public class ClientController {
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice;
	ClientDao cdao = new ClientDao();
	public void selectClientCRUD() {
		
		while(ch == 'y') {
			System.out.println("Select the CRUD operation");
			System.out.println("1. Create");
			System.out.println("2. Update");
			System.out.println("3. Select");
			System.out.println("4. SelectAll");
			System.out.println("5. Delete");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				cdao.saveClient();
				break;
			case 2:
				//cdao.updateClientById();
				break;
			case 3:
				//cdao.selectClientById();
				break;
			case 4:
				cdao.displayClients();
				break;
			case 5:
				//cdao.deleteClientById();
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
