package com.xworkz.libraryapp.Dto;

public class BookDTO {

     	private String bookName;
		private int bookId;
		private String bookAddition;
		private String bookPublisher;
		private String bookAuthorName;
        private float bookPrice;
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookAddition() {
			return bookAddition;
		}
		public void setBookAddition(String bookAddition) {
			this.bookAddition = bookAddition;
		}
		public String getBookPublisher() {
			return bookPublisher;
		}
		public void setBookPublisher(String bookPublisher) {
			this.bookPublisher = bookPublisher;
		}
		public String getBookAuthorName() {
			return bookAuthorName;
		}
		public void setBookAuthorName(String bookAuthorName) {
			this.bookAuthorName = bookAuthorName;
		}
		public float getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(float bookPrice) {
			this.bookPrice = bookPrice;
		}
		@Override
		public String toString() {
			return "BookDTO [bookName=" + bookName + ", bookId=" + bookId + ", bookAddition=" + bookAddition
					+ ", bookPublisher=" + bookPublisher + ", bookAuthorName=" + bookAuthorName + ", bookPrice="
					+ bookPrice + "]";
		}


}	