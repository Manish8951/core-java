package com.xworkz.collectionapp.casino;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class CasinoTester {
	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(new CasinoDTO(22));
		s.add(new CasinoDTO(14));
		s.add(new CasinoDTO(54));
		s.add(new CasinoDTO(66));
		
		for (Object object : s) {
			System.out.println(object);
		}
		
	}

}
