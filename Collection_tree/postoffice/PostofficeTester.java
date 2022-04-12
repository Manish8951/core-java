package com.xworkz.collectionapp.postoffice;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class PostofficeTester {
	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(new PostOfficeDTO(987));
		s.add(new PostOfficeDTO(3698));
		s.add(new PostOfficeDTO(7854));
		s.add(new PostOfficeDTO(24156));
		s.add(new PostOfficeDTO(67456));
		
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
