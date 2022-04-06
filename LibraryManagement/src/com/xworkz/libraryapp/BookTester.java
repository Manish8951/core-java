package com.xworkz.libraryapp;

import java.util.Scanner;
import com.xworkz.libraryapp.Dto.*;
import com.xworkz.libraryapp.library.LibraryApp;

public class BookTester {

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a size");
			int size=sc.nextInt();
			
			LibraryApp lib=new LibraryApp(size);
			
			for (int i = 0; i <size; i++) {
				BookDTO book=new BookDTO();
			
				
			System.out.println("Enter book id");
			book.setBookId(sc.nextInt());
			
			
			
			System.out.println("Enter book name");
			book.setBookName(sc.next());
			
			
			
			System.out.println("Enter author name");
			book.setBookAuthorName(sc.next());
			
			
			
			System.out.println("Enter price");
			book.setBookPrice(sc.nextFloat());
			
			
			
			System.out.println("Enter a addition");
			book.setBookAddition(sc.next());;
			
			
			
			System.out.println("Enter publisher name");
			book.setBookPublisher(sc.next());
			
			
			
			System.out.println(lib.createBookDetails(book));
			}
			
			
			
			System.out.println();
			lib.getAllBookDetails();
			
			System.out.println("Enter Author name to update book price");
			lib.updatePriceByAuthor(sc.next(), sc.nextFloat());
			
			System.out.println("Enetr Book name to delete everything....!!!");
			lib.deleteBookDetailsByName(sc.next());
		}
}
