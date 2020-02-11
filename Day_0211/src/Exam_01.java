import java.sql.*;

/*
1.DB연동
2.검색

 */


public class Exam_01 {
	public static void main(String[] args) {
		
		//1단계 JDBC드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		}
		
		
		//2단계 connection객체 생성 - 커넥션 연결
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe";  // 1521 오라클 기본포트 번호
		String myID = "system";
		String myPW = "1234";
		Connection con = null;
		try {
			con = DriverManager.getConnection(myURL,myID,myPW);
			System.out.println(con);
		} catch (Exception e) {
			System.out.println("커넥션 연결 실패");
			e.printStackTrace();
		}
		
		//3단계 SQL사용 
		Statement stmt = null; // 명령문처리
		ResultSet rs = null; // 일종의 컬랙션(set) 역할 , select
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from DEPARTMENT");
			while(rs.next()) {
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("loc")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//4단계 닫기
		
		try {
			rs.close();
			stmt.close();
			con.close(); 
			//close잘 안해주면 해킹 당할 수도 있음
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
