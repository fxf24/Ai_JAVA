package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db 연결
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jdbc", "jdbc");
			System.out.println("db연결성공");
			String sql = /*"select employee_id, first_name, job_id, salary, department_id,"
					+ "to_char(hire_date, 'yyyy:mm:dd HH24:MMmi:ss') as h_date "
					+ "from employees";*/
			"select count(*) from c_emp group by dept_id";
			
			//sql 저장 - 전송 - 결과 저장
			st = conn.createStatement();
			//실행
			rs = st.executeQuery(sql);
			//리턴결과 검색
			rs.next();
			System.out.println(rs.getInt("count(*)"));
//			while(rs.next()) {
//				int emp_id = rs.getInt("employee_id");
//				String name = rs.getString("first_name");
//				String title = rs.getString("job_id");
//				double salary = rs.getDouble("salary");
//				int dept_id = rs.getInt("department_id");
//				String hire_date = rs.getString("h_date");
//				System.out.println(emp_id + " : " + name + " : " + title + " : " 
//				+ salary + " : " + dept_id + " : " + hire_date);
//			}
			
			System.out.println("db연결해제성공");
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
				st.close();
				rs.close();
				conn.close();
			}
			catch(SQLException e) {
				
			}
		}
	}

}
