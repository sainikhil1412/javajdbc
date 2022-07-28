package com.scb.cmswithjdbc;

import java.util.Scanner;

import com.scb.cmswithjdbc.controller.ClientController;
import com.scb.cmswithjdbc.controller.ManagerController;
import com.scb.cmswithjdbc.exception.ClientNotFoundException;
import com.scb.cmswithjdbc.exception.ManagerNotFoundException;

public class CMSMain {

	public static void main(String[] args) throws ClientNotFoundException, ManagerNotFoundException {

		CMSMain cmsOp = new CMSMain();
		cmsOp.selectOperation();

	}

	ClientController cc = new ClientController();

	ManagerController mc = new ManagerController();
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice;

	public void selectOperation() throws ClientNotFoundException, ManagerNotFoundException {

		while (ch == 'y') {
			System.out.println("Select the option");
			System.out.println("1. Client");
			System.out.println("2. Manager");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				cc.selectClientCRUD();
				break;
			case 2:
				mc.selectManagerCRUD();
				break;
			default:
				System.out.println("Not a right option");
			}

		}
	}

}
