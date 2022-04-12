package com.xworkz.collectionapp.Politician;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class PoliticianTester {
	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(new PoliticianDTO(7854));
		s.add(new PoliticianDTO(4563));
		s.add(new PoliticianDTO(9685));
		s.add(new PoliticianDTO(5874));
		
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
