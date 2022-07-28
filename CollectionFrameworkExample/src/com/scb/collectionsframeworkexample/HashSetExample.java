package com.scb.collectionsframeworkexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> customerNames = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		customerNames.add("Rama");
		customerNames.add("Raja");
		customerNames.add("Rana");
		customerNames.add("Jana");
		customerNames.add("Rana");
		customerNames.add("Jana");
		
		System.out.println(customerNames);
		System.out.println("Customer Names ...");
		for(String cname : customerNames) {
			System.out.println(cname);
		}
		
		System.out.println("Enter the name of customer to remove");
		String st = sc.next();
		for(String cname : customerNames) {
			if(st.equals(cname)) {
				customerNames.remove(st);
			}
		}
		
		System.out.println("Customer after remove");
		
		for(String cname : customerNames) {
			System.out.println(cname);
		}


	}

}
