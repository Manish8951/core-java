package com.xworkz.collectionapp.vaccine;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class VaccineTester {
	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(new VaccineDTO(78965));
		s.add(new VaccineDTO(45632));
		s.add(new VaccineDTO(98563));
		s.add(new VaccineDTO(45896));
		
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
