package com.xworkz.libraryapp.library;
import com.xworkz.libraryapp.Dto.*;

public class LibraryApp {
	
	
		BookDTO bookDTO[];
		int index;
		
		public LibraryApp(int size) {
			bookDTO =new BookDTO[size];
		}
		
		public boolean createBookDetails(BookDTO dto) {
			System.out.println(" createBookDetails");
			boolean bookAdded=false;
			if(dto != null) {
				bookDTO[index++]=dto;
				bookAdded=true;
			}
			else {
				System.out.println("no book found");
			}
			System.out.println("End of createBookDetails()");
			return bookAdded;
		}
		
		public void getAllBookDetails() {
			for (int i = 0; i < bookDTO.length; i++) {
				System.out.println(bookDTO[i]);
			}
		}
		
		public boolean updatePriceByAuthor(String authorName,float Price) {
			boolean isBookAdditionUpdated=false;
			for (int i = 0; i < bookDTO.length; i++) {
				
				if(bookDTO[i].getBookAuthorName().equals(authorName)) {
					bookDTO[i].setBookPrice(Price);;
					isBookAdditionUpdated=true;
					System.out.println(bookDTO[i]);
				}
				else {
					System.out.println("book addition is now updated");
				}
			}
			return isBookAdditionUpdated;
			
		}
		public boolean deleteBookDetailsByName(String bookName)
		{
			boolean delete=false;
			
				for (int i = 0; i < bookDTO.length; i++) {
					if(bookDTO[i].getBookName().equals(bookName)) {
						bookDTO[i]=null;
						System.out.println("book ddetails are deleted");
						delete=true;
					}
					else {
						System.out.println("book details are not deleted");
					}
				}
			
			
			return delete;
		}

}
