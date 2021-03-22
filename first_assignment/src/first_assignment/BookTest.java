package first_assignment;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bDB = new ArrayList<>();
		ArrayList<Magazine> mDB = new ArrayList<>();
		
		bDB.add(new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "기본문법"));
		bDB.add(new Book("35355", "OOAD 분석,설계", "소나무", "Jaen.kr", 30000));
		mDB.add(new Magazine("35535", "Java World ", "편집부", "androidjava.com", 2013, 2, 7000));
		System.out.println("*********************** 도서목록  **************************");
		for(Book b : bDB) {
			System.out.println(b);
		}
		for(Magazine m : mDB) {
			System.out.println(m);
		}
		
		
	}

}
