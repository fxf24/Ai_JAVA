package template;

import java.util.Scanner;

public class InsertProcess {
	void process() {
		Scanner s = new Scanner(System.in);
		//사원등록 추가 입력 - InsertProcess
		System.out.print("사번 입력 : ");
		int id = s.nextInt();
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("급여 입력 : ");
		double salary = s.nextDouble();
		
		//Controller 클래스 입력 내용 전달
		//EmployeeVO e = new EmployeeVO(id, name, salary);
		//EmployeeDAO ??? 메소드 호출
		Controller c = Controller.getInstance();
		c.insert(id, name, salary);
		
		s.close();
	}
}
