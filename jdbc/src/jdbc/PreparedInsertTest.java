package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pt = null;
		try {
			//jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db 연결
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jdbc", "jdbc");
			System.out.println("db연결성공");
			//sql 전송 - 결과 검색

			//자동 commit 기본 - 수동 설정 변경 가능. PreparedStatement 변경
			String sql = "update c_emp set salary = salary + ? where title = ?";
			//sql 저장 객체 생성
			pt = conn.prepareStatement(sql);
			//sql 입력파라미터값 세팅
			pt.setInt(1, Integer.parseInt(args[1]));
			pt.setString(2, args[0]);
			//sql 실행
			int rowcnt = pt.executeUpdate();
			//실행결과 출력
			System.out.println(rowcnt + " 개의 행 삽입");
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
