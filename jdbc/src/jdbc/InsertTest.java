package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

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
			//sql 전송 - 결과 검색
			//jdbc 계정 c_emp 테이블에 데이터 저장
			//600 이자바 사장 10000 10
			// 자바 "sql" 정의 - db 전송 - 결과 검색
			String sql = 
					"insert into c_emp values(" + args[0] + ", '" + args[1] + 
					"', '" + args[2] + "', " + args[3] + ", " + args[4] + ")";
			//db 전송
			Statement st = conn.createStatement();
			//실행
			int insertrow = st.executeUpdate(sql);
			//리턴결과 검색
			System.out.println(insertrow + " 개의 행 삽입");
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
