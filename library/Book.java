package library;

public class Book {
	
	public int id;
	public String title;
	public String author;
	public String releaseYear;
	public String publisher;
	
	public Book(int id, String title, String author, String releaseYear, String publisher) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
		this.publisher = publisher;
	}
}
