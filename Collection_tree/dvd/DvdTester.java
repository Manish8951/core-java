package com.xworkz.collectionapp.dvd;
import java.text.CollationKey;

import java.util.Set;
import java.util.TreeSet;

public class DvdTester {
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		set.add(new DvdDTO(8));
		set.add(new DvdDTO(5));
		set.add(new DvdDTO(7));
		set.add(new DvdDTO(10));
		set.add(new DvdDTO(12));
		
		for (Object object : set) {
			System.out.println(object);
		}
	}

}
