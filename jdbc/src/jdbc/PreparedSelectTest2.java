package jdbc;

import java.util.ArrayList;

import emp.EmployeeDAO;
import emp.EmployeeDTO;

public class PreparedSelectTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		ArrayList<EmployeeDTO> list = dao.getEmployees(args[0], args[1]);
		for(EmployeeDTO dto : list) {
			System.out.println(dto.getFirst_name() + "|" + dto.getSalary());
		}
	}

}
