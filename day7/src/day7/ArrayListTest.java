package day7;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(5);
		list.add(100);
		list.add(new Integer(200));
		list.add(2.55);
		list.add(new Double(32.14));
		list.add(300);
		list.add(9.99);
		list.add("자바프로그램"); //6번인덱스에 저장
		list.add(0, "변경"); //0번 인덱스에 "변경" 저장,
		list.set(0, "변경확인"); //0번 인덱스 데이터 수정
		list.remove(0);
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 인덱스= " + list.get(i));
		}
		
//		auto boxing / unboxing
//		int i = new Integer(500);
//		Integer in =100;
	}
	

}
