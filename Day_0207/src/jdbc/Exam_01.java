package jdbc;

/*
1. JDBC ����̹� �ε�
2. Ŀ�ؼ� ����
3. ��ɹ� ����
 */

import java.sql.*;

public class Exam_01 {
	public static void main(String[] args) {
		
		//JDBC ����̹� �ε�
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("����̹� �ε� ����");
		} catch (Exception e) {
			System.out.println("����̹� �ε� ����");
		}
		
		//Ŀ�ؼ� ����
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myUser = "system";
		String myPass = "1234";
		try {
			Connection con = DriverManager.getConnection(myURL,myUser,myPass);
			System.out.println("Ŀ�ؼ� ���� ����");
		} catch (Exception e) {
			System.out.println("Ŀ�ؼ� ���� ����");
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
