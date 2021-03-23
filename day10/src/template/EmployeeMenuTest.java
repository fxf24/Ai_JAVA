package template;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//class Employee{
//	int id;
//	String name;
//	double salary;
//	
//	Employee(int id, String name, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return id + "|" + name + "|" + salary;
//	}
//}
public class EmployeeMenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<EmployeeVO> eDB = new ArrayList<>();
		int menu_num = 0;
		FileReader fi = null;
		FileWriter fo = null;
		Scanner sc = null;

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
					InsertProcess p = new InsertProcess();
					p.process();
					break;
				case 2:
					System.out.println("사원정보 조회를 선택하셨습니다.");
					ViewProcess vp = new ViewProcess();
					vp.process();
					break;
				case 3:
					System.out.println("사원정보 수정을 선택하셨습니다.");
					System.out.print("수정 사번 입력 : ");
					int m_id = s.nextInt();
					s.nextLine();
					System.out.print("수정 항목 입력 : ");
					String mod = s.nextLine();
					String mod_item[] = mod.split(" ");
					
					try {
						fi = new FileReader("employee.txt");
						sc = new Scanner(fi);
						
						while(sc.hasNextLine()) {
							String line = sc.nextLine();
							String items[] = line.split("\\|");
							int id2 = Integer.parseInt(items[0]);
							String name2 = items[1];
							double salary2 = Double.parseDouble(items[2]);
							if(m_id == id2) {
								if(mod_item[0].equals("name")) {
									name2 = mod_item[1];
								}
								else {
									salary2 = Double.parseDouble(mod_item[1]);
								}
							}
							
							System.out.println(id2 + "|" + name2 + "|" + salary2);
							eDB.add(new EmployeeVO(id2, name2, salary2));
						}	
						
						fo = new FileWriter("employee.txt");
						for(EmployeeVO e : eDB) {
							fo.write(e.toString() + "\n");
						}
						fi.close();
						fo.close();
						sc.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					break;
				case 4:
					System.out.println("사원정보 탈퇴를 선택하셨습니다.");
					System.out.print("탈퇴 사번 입력 : ");
					int d_id = s.nextInt();
					
					try {
						fi = new FileReader("employee.txt");
						sc = new Scanner(fi);
						
						while(sc.hasNextLine()) {
							String line = sc.nextLine();
							String items[] = line.split("\\|");
							int id2 = Integer.parseInt(items[0]);
							String name2 = items[1];
							double salary2 = Double.parseDouble(items[2]);
							
							System.out.println(id2 + "|" + name2 + "|" + salary2);
							if(d_id == id2) {continue;}
							eDB.add(new EmployeeVO(id2, name2, salary2));
						}	
						
						fo = new FileWriter("employee.txt");
						for(EmployeeVO e : eDB) {
							fo.write(e.toString() + "\n");
						}
						
						fi.close();
						fo.close();
						sc.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
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
