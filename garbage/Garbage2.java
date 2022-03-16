package com.xworkz.socialmedia.dto.garbage2;

public class Garbage2 {
	
	public static void main (String []ar) {
		
		Garbage2 garbage =  new Garbage2();
		System.out.println(garbage);
		garbage = null;
		System.out.println(garbage);
		System.gc();
	}

}
