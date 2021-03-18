package day7;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> set = new HashSet<>();
//		set.add(100);
//		set.add(3.14);
//		set.add("java");
		Employee e1 = new Employee(400, "박부장", 88000.99);
		set.add(e1);
//		set.add(new Employee(400, "박부장", 88000.99));
		System.out.println(set.size());
			
		Iterator<Employee> it = set.iterator(); // 반복자(set 저장 데이터들을 순서없이 모은 객체
		while(it.hasNext()) {// 다음 데이터 존재 여부
			Employee o = it.next();// 다음 데이터 조회
			System.out.println(o.name);
		}
		
		System.out.println("===========================");
		HashSet<Integer> lotto = new HashSet<Integer>();
		// 1-45 난수 생성하여 lotto 저장하여
		// lotto 출력하면 6개 정수 나오도록 처리(저장 - 조회 출력 순서 일치하지 않아도 된다)
		
		while(true) {
			int num = (int)(Math.random()*45) +1;
			lotto.add(num);
			System.out.println(num);
			if(lotto.size() == 6) {break;}
		}
		
//		Iterator<Integer> it2 = lotto.iterator();
//		while(it2.hasNext()) {
//			System.out.print( it2.next() + "\t");
//		}
		for(int i : lotto) {
			System.out.print(i + "\t");
		}
	}

}
