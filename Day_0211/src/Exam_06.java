import java.sql.*;
import java.util.Scanner;

/*
키보드로 사원 번호를 입력 검색
PreparedStatement이용 - > 예제 4번과 비교해서 쿼리문의 위치를 잘 보자

 */

public class Exam_06 {
	public static void main(String[] args) {
		
		String myURL = "jdbc:oracle:thin:@localhost:1521/xe"; 
		String myID = "hr";
		String myPW = "1234";
		Connection con = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("부서 번호 입력 >> ");
		int In_dno = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL,myID,myPW);
			
			String query = "select * from employee where dno = ?"; 
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, In_dno); 
			rs = pstmt.executeQuery();
			
			while(rs.next()) { 
				int eno = rs.getInt(1); 
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int manager = rs.getInt("manager");
				String hiredate = rs.getString("hiredate"); 
				int salary = rs.getInt("salary");
				int commission = rs.getInt("commission");
				int dno = rs.getInt("dno");
				
				System.out.print(eno + "\t " + ename + "\t    " + job + "\t " + manager + "\t ");
				System.out.print(hiredate + "\t " + salary + "\t " + commission + "\t " + dno + "\n");
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
