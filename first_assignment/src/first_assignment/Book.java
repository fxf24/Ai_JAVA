package first_assignment;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc = "";
	
	
	Book(String isbn, String title, String author, String publisher, int price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}


	Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return isbn + "\t| " + title + "\t| " + author + "\t| "
				+ publisher + "\t| " + price  + "\t| " + desc;
	}
}
