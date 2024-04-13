package library;

import java.util.Scanner;

public class LibrarySystem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		int option = 0;
		
		while (option != 4) {
			System.out.println("1. Add book");
			System.out.println("2. list books");
			System.out.println("3. Book Details");
			System.out.println("4. Quit");
			
			option = sc.nextInt();
		
			switch(option) {
			case 1:
				int id;
				String title;
				String author;
				String releaseYear;
				String publisher;
				
				System.out.println("ID: ");
				id = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Title: ");
				title = sc.nextLine();
				
				System.out.println("Author: ");
				author = sc.nextLine();
				
				System.out.println("Release Year: ");
				releaseYear = sc.nextLine();
				
				System.out.println("Publisher: ");
				publisher = sc.nextLine();
				System.out.println();
				
				Book book = new Book(id, title, author, releaseYear, publisher);
				
				library.addBook(book);
				
				break;
			case 2:
				System.out.println("Listing");
				System.out.println(library.listBooks());
				System.out.println();
				break;
			case 3:
				System.out.println("Detailing");
				int detailId;
				System.out.println("ID: ");
				detailId = sc.nextInt();
				sc.nextLine();
				
				Book detailBook = library.detailBooks(detailId);
				System.out.println("ID: " + detailBook.id);	
				System.out.println("Title: " + detailBook.title);
				System.out.println("Author: " + detailBook.author);
				System.out.println("Release Year: " + detailBook.releaseYear);
				System.out.println("Published by: " + detailBook.publisher);
				System.out.println();
				break;
			case 4:
				System.out.println("Done");
				break;
			}
		}
		sc.close();		
	}
}
