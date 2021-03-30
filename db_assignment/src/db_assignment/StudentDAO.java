package db_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	Connection conn = null;
	PreparedStatement pt = null;
	ResultSet rs = null;
	ArrayList<StudentDTO> list = new ArrayList<>();
	
	public void insertStudent(StudentDTO studentDTO) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db 연결
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "test", "test");
			String sql = "insert into student values(?, ?, ?, ?, ?)";
			pt = conn.prepareStatement(sql);
			
			pt.setInt(1, studentDTO.getNo());
			pt.setString(2, studentDTO.getName());
			pt.setString(3, studentDTO.getDet());
			pt.setString(4, studentDTO.getAddr());
			pt.setString(5, studentDTO.getTel());
			//sql 실행
			pt.executeUpdate();
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
				pt.close();
				conn.close();
			}
			catch(SQLException e) {
				
			}
		}
	}
	
	public void printAllStudents() {
		
		
		try {
			//jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db 연결
			conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "test", "test");
			String sql = "select * from student";
			pt = conn.prepareStatement(sql);
			//sql 실행
			rs = pt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String det = rs.getString("det");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				
				list.add(new StudentDTO(no, name, det, addr, tel));
			}
			
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
		
		for(StudentDTO dto : list) {
			System.out.println(dto);
		}
	}
}
