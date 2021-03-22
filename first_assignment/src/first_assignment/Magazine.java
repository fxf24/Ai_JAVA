package first_assignment;

public class Magazine {
	String isbn;
	String title;
	String author;
	String publisher;
	int year;
	int month;
	int price;
	String desc = "";
	
	
	
	Magazine(String isbn, String title, String author, String publisher, int year, int month, int price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.month = month;
		this.price = price;
	}


	Magazine(String isbn, String title, String author, String publisher, int year, int month, int price,
			String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.month = month;
		this.price = price;
		this.desc = desc;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  isbn + "\t| " + title + "\t| " + author + "\t| "
				+ publisher + "\t| " + price  + "\t| " + desc  + "\t| " + year + "." + month;
	}
}
