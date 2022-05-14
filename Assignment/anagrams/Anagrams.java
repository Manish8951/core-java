package com.xworkz.assign.anagrams;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1="ALEC GUINNESS";
		String str2="GENUINE CLASS";
		
		char a[]=str1.toCharArray();
		char b[]= str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean res = Arrays.equals(a, b);
		
		if(res==true) {
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is not Anagram");
		}
	}
}
