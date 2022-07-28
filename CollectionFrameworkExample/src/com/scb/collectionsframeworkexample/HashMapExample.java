package com.scb.collectionsframeworkexample;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> empData = new HashMap<Integer, String>();
		
		empData.put(456, "Rama");
		empData.put(556, "Rana");
		empData.put(656, "Raja");
		empData.put(256, "Rita");
		empData.put(156, "Reema");
		
		System.out.println(empData);

		
		TreeMap<Integer, String> empData1 = new TreeMap<Integer, String>();
		
		empData1.put(456, "Rama");
		empData1.put(556, "Rana");
		empData1.put(656, "Raja");
		empData1.put(256, "Rita");
		empData1.put(156, "Reema");
		
		System.out.println(empData1);
	}

}
