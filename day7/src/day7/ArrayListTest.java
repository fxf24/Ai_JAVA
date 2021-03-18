package day7;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "-" + name + "-" + salary;
	}
	
}
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 조회 자주 효율
		//LinkedList 저장 수정 삭제 자주 효율
		
		//ArrayList = 여려 타입 데이터 저장 가능/ 동일타입 데이터만 저장하되 갯수 변경 의도
		/* 1> 컴파일러 컴파일 시점 타입 체크
		 * 2> 형변환 필요없다
		 * 3> 타입 정적 유지
		 * 4> 타입 지정 x ==> add(Object o) / Object <-- get(0)
		 * 5> 타입 지정 o ==> add(? o) / ? <-- get(0)
		 * */
//		ArrayList list = new ArrayList(5);
		ArrayList<Employee> list = new ArrayList<Employee>(5);
//		list.add(100);
//		list.add(new Integer(200));
//		list.add(2.55);
//		list.add(new Double(32.14));
//		list.add(300);
//		list.add(9.99);
//		list.add("자바프로그램"); //6번인덱스에 저장
//		list.add("멀티캠퍼스");
//		list.add(0, "변경"); //0번 인덱스에 "변경" 저장,
//		list.set(0, "변경확인"); //0번 인덱스 데이터 수정
//		list.remove(0);
		
		Employee e1 = new Employee(100, "이사원", 56000.55);
		Employee e2 = new Employee(200, "최대리", 66000.55);
		Employee e3 = new Employee(300, "박과장", 76000.55);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list.size());
		
		if(list.contains("멀티캠퍼스")) {
			System.out.println(list.indexOf("멀티캠퍼스"));
			list.remove("멀티캠퍼스");
		}
		for(int i = 0; i < list.size(); i++) {
			Employee o = list.get(i);
			System.out.println(i + "번 인덱스= " + o/*.toString()*/);
			//만약 조회 데이터가 Employee 객체의 name 변수 출력
			//Integer, Double, String, Employee
			System.out.println(o.name);
		}
		
//		auto boxing / unboxing
//		int i = new Integer(500);
		
//		Integer in =100;
	}
	

}
