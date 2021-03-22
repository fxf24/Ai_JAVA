package second_assignment;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bDB = new ArrayList<>();
		ArrayList<Magazine> mDB = new ArrayList<>();
		
		bDB.add(new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "기본문법"));
		bDB.add(new Book("33455", "JDBC Pro", "김철수", "Jaen.kr", 23000));
		bDB.add(new Book("55355", "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Mode12 기반"));
		bDB.add(new Book("35332", "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework"));
		bDB.add(new Book("35355", "OOAD 분석,설계", "소나무", "Jaen.kr", 30000));
		
		mDB.add(new Magazine("35535", "Java World", "편집부", "Jaen.kr", 2013, 2, 7000));
		mDB.add(new Magazine("33434", "Mobile World ", "편집부", "Jaen.kr", 2013, 8, 8000));
		mDB.add(new Magazine("75342", "Next Web", "편집부", "Jaen.kr", 2012, 10, 10000, "AJAX 소개"));
		mDB.add(new Magazine("76543", "Architecture", "편집부", "Jaen.kr", 2010, 3, 5000, "java 시스템"));
		mDB.add(new Magazine("76534", "Data Moeling", "편집부", "Jaen.kr", 2012, 12, 14000));
		System.out.println("*********************** 도서목록  **************************");
		for(Book b : bDB) {
			System.out.println(b);
		}
		System.out.println();
		System.out.println("*********************** 잡지목록  **************************");
		for(Magazine m : mDB) {
			System.out.println(m);
		}
		
		
	}
}