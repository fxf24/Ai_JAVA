package template;

import java.util.ArrayList;

public class Controller {
	//singleton 패턴
	//객체를 딱 하나만 생성할 수 있다.
	static private Controller con = new Controller();
	private Controller() {}
	public static Controller getInstance() {
		return con;
	}
	
	//사원등록 제어 부분
	void insert(int id, String name, double salary) {
		//VO 저장? DAO 메소드 호출
		EmployeeVO e = new EmployeeVO(id, name, salary);
		EmployeeDAO dao = new EmployeeDAO();
		dao.insert(e);
	}
	
	ArrayList<EmployeeVO> getAll() {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.getAll();
	}
}

//Controller c = Controller.getInstance();
