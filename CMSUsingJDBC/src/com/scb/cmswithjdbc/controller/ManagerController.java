package com.scb.cmswithjdbc.controller;

import java.util.Scanner;

import com.scb.cmswithjdbc.dao.ManagerDao;
import com.scb.cmswithjdbc.exception.ManagerNotFoundException;
import com.scb.cmswithjdbc.model.Manager;

public class ManagerController {

	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	int choice;
	ManagerDao cdao = new ManagerDao();
	Manager cl = new Manager();
	
	public void readManagerData() {
		System.out.println("Enter Manager Details....");
		System.out.println("Enter Manager Id");
		cl.setManagerId(sc.nextInt());
		System.out.println("Enter Manager Name");
		cl.setManagerName(sc.next());
		System.out.println("Enter Manager Email");
		cl.setManagerEmail(sc.next());
		System.out.println("Enter Manager Mobno");
		cl.setManagerMobNo(sc.next());
	}
	
	public int readManagerID() {
		System.out.println("Enter Manager Details....");
		System.out.println("Enter Manager Id");
		int ManagerId = sc.nextInt();
		return ManagerId;
	}
	public void selectManagerCRUD() throws ManagerNotFoundException {
		
		while(ch == 'y') {
			System.out.println("Select the Manager CRUD operation");
			System.out.println("1. Create");
			System.out.println("2. Update");
			System.out.println("3. Select");
			System.out.println("4. SelectAll");
			System.out.println("5. Delete");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				readManagerData();
				cdao.insertManager(cl);
				break;
			case 2:
				
				int cid = readManagerID();
				if(!cdao.selectManagerById(cid)) {
					throw new ManagerNotFoundException("Manager with id " + cid + " not found");
				}else {
					readManagerData();
					cdao.updateManager(cl);
				}
				
				break;
			case 3:
				cdao.selectManagerById(readManagerID());
				break;
			case 4:
				cdao.selectAllManagers();
				break;
			case 5:
				int cid1 = readManagerID();
				if(!cdao.selectManagerById(cid1)) {
					throw new ManagerNotFoundException("Manager with id " + cid1 + " not found");
				}else {
					//readManagerData();
					cdao.deleteManagerById(cid1);
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
