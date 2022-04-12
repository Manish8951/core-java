package com.xworkz.collectionapp.dream11;

import java.util.Set;
import java.util.TreeSet;

public class Dream11Tester {
	
	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(new Dream11DTO(14));
		s.add(new Dream11DTO(65));
		s.add(new Dream11DTO(85));
		s.add(new Dream11DTO(652));
		
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
