package db_assignment;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO dao = new StudentDAO();
		int no = 3;
		String name = "나길동";
		String det = "영문학과";
		String addr = "제주";
		String tel = "010-3333-3333";
		
		
		dao.insertStudent(new StudentDTO(no, name, det, addr, tel));
		
		dao.printAllStudents();	
	}
}
