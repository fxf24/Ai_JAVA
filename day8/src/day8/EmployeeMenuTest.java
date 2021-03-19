package day8;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " - " + name + " - " + salary;
	}
}
public class EmployeeMenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Employee> eDB = new ArrayList<>();
		int menu_num = 0;
		
		while(menu_num!=5) {
			System.out.println("===다음과 같은 메뉴 이용 가능합니다===");
			System.out.println("1.사원등록");
			System.out.println("2.사원정보조회");
			System.out.println("3.사원정보수정");
			System.out.println("4.사원탈퇴");
			System.out.println("5.프로그램종료");
			System.out.print("번호 입력 : ");
			menu_num = s.nextInt();
			switch(menu_num) {
				case 1:
					System.out.print("사번 입력 : ");
					int id = s.nextInt();
					System.out.print("이름 입력 : ");
					String name = s.next();
					System.out.print("급여 입력 : ");
					double salary = s.nextDouble();
					eDB.add(new Employee(id, name, salary));
					break;
				case 2:
					System.out.println("사원정보 조회를 선택하셨습니다.");
					for(Employee e: eDB) {
						System.out.println(e);
					}
					break;
				case 3:
					System.out.println("사원정보 수정을 선택하셨습니다.");
					//수정 사번 입력 : 100
					//수정항목 입력 : name 박수정 ->   이름   박수정으로 변경
					//			   salary 300 -> 현재급여 + 3000 변경
					break;
				case 4:
					System.out.println("사원정보 탈퇴를 선택하셨습니다.");
					break;
				case 5:
					System.out.println("프로그램 종료합니다.");
					break;
				default:
					System.out.println("해당 기능의 메뉴가 존재하지 않습니다.");
					break;
			}
		}
		
		s.close();
	}

}
