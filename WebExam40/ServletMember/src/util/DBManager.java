package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private DBManager() {}
	
	private static DBManager instance = new DBManager();
	
	public static DBManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver";
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "jsl40";
		String myPass = "1234";
		
		try {
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myURL, myID, myPass);
//			System.out.println("커넥션 성공"+conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}

