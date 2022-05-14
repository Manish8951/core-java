package com.xworkz.assign.Pallindrome;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		   String name ="gadag";
		
		   int length = name.length();
		for (int i = 0,j=name.length()-1; i <name.length()-1; i++,j--) {
			
			if((name.charAt(i))==(name.charAt(j))) {
				System.err.println("The String is Pallindrome :-"+name);
				break;
				
			} else {
				System.err.println("String is not a pallindrome :-"+name);
				break;
			}
				
				}
			}

}
