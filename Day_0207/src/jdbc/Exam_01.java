package jdbc;

/*
1. JDBC 드라이버 로딩
2. 커넥션 연결
3. 명령문 실행
 */

import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		
		//JDBC 드라이버 로딩
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		
		//커넥션 연결
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myUser = "system";
		String myPass = "1234";
		try {
			Connection con = DriverManager.getConnection(myURL,myUser,myPass);
			System.out.println("커넥션 연결 성공");
		} catch (Exception e) {
			System.out.println("커넥션 연결 실패");
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
