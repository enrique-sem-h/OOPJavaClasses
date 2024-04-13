package library;

import java.util.ArrayList;
import java.util.Iterator;

import javax.print.attribute.standard.JobKOctets;

public class Library {
	
	public ArrayList<Book> books;
	
	public Library() {
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public String listBooks() {
		String booksList = "";
		
		for (Book bk : this.books) {
			booksList += bk.id + "-" + bk.title + "\n";
		}
		return booksList;
	}
	
	public Book detailBooks(int id) {
		 for (Book bk : this.books) {
			 if (bk.id == id){
				 return bk;
			 }
		 }
		 return null;
	}
}
