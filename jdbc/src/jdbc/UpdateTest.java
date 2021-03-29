package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			//jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db 연결
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jdbc", "jdbc");
			System.out.println("db연결성공");
			/* 이자바 사원을 사번 100 인 사원과 같은 직급(title)으로 변경
			 * 대리 5000 --> 명령행 매개변구로 입력받으면 c_emp 테이블 title 대리인 직원의 현재
			 * 급여에 5000 인상 = 급여변경
			 * 
			 * update 테이블명
			 * set 변경컬럼이름=변경값
			 * where 변경조건식
			 * */
			String sql = 
			"update c_emp set salary = salary + " + args[1] 
			 + " where title = '" + args[0] + "'";
			
			//db 전송
			Statement st = conn.createStatement();
			//실행
			int updaterow = st.executeUpdate(sql);
			//리턴결과 검색
			System.out.println(updaterow + " 개의 행 수정");
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
				conn.close();
			}
			catch(SQLException e) {
				
			}
		}
	}

}
