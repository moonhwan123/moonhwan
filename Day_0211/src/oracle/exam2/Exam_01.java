package oracle.exam2;

import java.sql.Connection;

import oracle.db.DBManager;

public class Exam_01 {
	public static void main(String[] args) throws Exception {
		DBManager manager = DBManager.getInstance();
		Connection conn = manager.getConnection();
		System.err.println(conn);
		
		
		
		
		
		
	}
}
