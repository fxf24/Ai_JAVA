package emp;
//DATA ACCESS OBJECT = 데이터 직접 접근

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	public ArrayList<EmployeeDTO> getEmployees(String currentPage, String cntPerPage){
		Connection conn = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		
		try {
			//jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db 연결
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "1234");
			System.out.println("db연결성공");
			//sql 전송 - 결과 검색
			//hr 계정의 employees 테이블 급여 많은 순서 정렬하여
			//1- 10 번째 사원 이름과 급여 조회
			//rownum, row_number(), rank(), dense_rank()

			String sql = "select rownum, first_name, salary"
					+ " from (select rownum r, first_name, salary from (select * from employees order by salary desc))"
					+ " where r >= ? and r <= ?";
			
			//sql 저장 객체 생성
			pt = conn.prepareStatement(sql);
			
			//sql 입력파라미터값 세팅
			pt.setInt(1, Integer.parseInt(currentPage));
			pt.setInt(2, Integer.parseInt(cntPerPage));
			
			//sql 실행
			rs = pt.executeQuery();
			while(rs.next()) {
				int rownum = rs.getInt("rownum");
				String emp_name = rs.getString("first_name");
				double salary = rs.getDouble("salary");
				
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmployee_id(rownum);
				dto.setFirst_name(emp_name);
				dto.setSalary(salary);
				
				list.add(dto);
			}
			
			//실행결과 출력
			System.out.println(" 개의 행 삽입");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버 세팅 확인하세요");
		}
		catch(SQLException e) {
			System.out.println("DB연결정보 확인하세요");
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				rs.next();
				pt.close();
				conn.close();
			}
			catch(SQLException e) {
				
			}
		}
		return list;
	}
}
