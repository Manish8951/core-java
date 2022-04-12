package com.xworkz.collectionapp.ship;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class ShipTester {
	
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		set.add(new ShipDTO(21));
		set.add(new ShipDTO(42));
		set.add(new ShipDTO(56));
		set.add(new ShipDTO(87));
		
		
		for (Object object : set) {
			System.out.println(object);
		}
		
		
	}

}
