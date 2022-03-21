package com.xworkz.socialmedia.dto.Atm;
import java.util.Scanner;

public class Atmtest {

	public static void main (String []ar) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cvv no :");
		int Cvv = sc.nextInt();
		
		System.out.println("enter name on the card :");
		String name = sc.next();
		
		System.out.println("enter card number:");
		long number = sc.nextLong();
		
		System.out.println("enter card validity date :");
		String vallidity =sc.next();
		
		
		
		
		Atm card = new Atm();
		card.setCvv(Cvv);
		card.setName(name);
		card.setNumber(number);
		card.setVallidity(vallidity);
		System.out.println(card);
		
		System.out.println(card.hashCode());
		
		
		}
	
}
