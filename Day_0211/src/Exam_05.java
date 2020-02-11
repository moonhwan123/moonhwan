import java.sql.*;
import java.util.Scanner;

/*
키보드로 사원 번호를 입력 검색
PreparedStatement이용 - > 예제 4번과 비교해서 쿼리문의 위치를 잘 보자

 */

public class Exam_05 {
	public static void main(String[] args) {
		
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe"; 
		String myID = "hr";
		String myPW = "1234";
		Connection con = null; // 필수
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select쓸때 필요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사원 이름 입력 >> ");
		String name = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL,myID,myPW);
			
			String query = "select * from employee where ename = ?"; // 원하는 값이 ? 로 들어간다.
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name); // 1번째 물음표에 name을 넣는다.
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //rs에 값이 존재할때 값을 꺼내온다.(존재하는지 물어본다.)
				int eno = rs.getInt(1); //"int eno = rs.getInt(eno);" 괄호안에 속성의 인덱스값이든 이름을 직접 적든 똑같다.
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager = rs.getInt("manager");
				String hiredate = rs.getString("hiredate"); // LocalDateTime 또는 TimeStamp도 가능
				int salary = rs.getInt("salary");
				int commission = rs.getInt("commission");
				int dno = rs.getInt("dno");
				
				System.out.print(eno + "\t " + ename + "\t " + job + "\t " + manager + "\t ");
				System.out.print(hiredate + "\t " + salary + "\t " + commission + "\t " + dno + "\n");
				

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
