package com.xworkz.collectionapp.paint;
import java.text.CollationKey;

import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.Soundbank;

public class PaintTester {
	
	public static void main(String[] args) {
		
		
		
		Set s = new TreeSet();
		s.add(new PaintDTO(15));
		s.add(new PaintDTO(21));
		s.add(new PaintDTO(45));
		s.add(new PaintDTO(65));
		s.add(new PaintDTO(77));
		s.add(new PaintDTO(99));
		
		for (Object object : s) {
			System.out.println(object);
		}
		
	}

}
