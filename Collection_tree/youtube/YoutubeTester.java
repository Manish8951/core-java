package com.xworkz.collectionapp.youtube;
import java.text.CollationKey;
import java.util.Set;
import java.util.TreeSet;

public class YoutubeTester {
	
	public static void main(String[] args) {
		
		Set s = new TreeSet();
		s.add(new YoutubeDTO(256));
		s.add(new YoutubeDTO(652));
		s.add(new YoutubeDTO(698));
		s.add(new YoutubeDTO(785));
		
		for (Object object : s) {
			System.out.println(object);
		}
	}

}
