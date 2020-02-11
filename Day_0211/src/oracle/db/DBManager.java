package oracle.db;

import java.sql.*;

//싱글톤 방식 - 생성자를 private로 
public class DBManager {
	private DBManager() {}
	private static DBManager instance = new DBManager(); // 자기가 자기 생성자를 호출해서 객체를 스스로 만들었다.
	public static DBManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection conn= null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "hr";
	    String myPW = "1234";
	    
	    try {
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myURL, myID, myPW);
			System.out.println("로딩,커넥션 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    return conn;
		
	}
	
	
}
