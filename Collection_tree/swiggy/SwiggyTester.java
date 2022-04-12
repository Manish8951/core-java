package com.xworkz.collectionapp.swiggy;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class SwiggyTester {
	public static void main(String[] args) {
		
		Set s =new TreeSet();
		s.add(new SwiggyDTO(254));
		s.add(new SwiggyDTO(652));
		s.add(new SwiggyDTO(9874));
		s.add(new SwiggyDTO(7458));
		
		for (Object object : s) {
			System.out.println(object);
		}
		
	}

}
