package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DBManager;

public class DDLDao {
	DBManager manager = DBManager.getInstance();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	//테이블 생성 메소드 정의
	public int tableCreate() {
		StringBuffer query = new StringBuffer();
		query.append("create table aaa(");
		query.append("dno number(2),");
		query.append("dname varchar(10) not null,");
		query.append("redate date,");
		query.append("score number(3),");
		query.append("primary key(dno))");
		
		int row=0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query.toString());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				// TODO: handle exception
			}	
		}
		return row;
	}
	
	//인서트 메소드
	public int insertAAA(int dno, String dname, String date, int score) {
		String query = "insert into aaa values (?,?,?,?)";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, date);
			pstmt.setInt(4, score);
			row = pstmt.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				// TODO: handle exception
			}	
		}
		return row;
	}
	
	
	//업데이트 메소드
	public int aaaUpdate(int dno, String dname, int score) {
		String query = "update aaa set dname = ?, score = ? where dno = ?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			pstmt.setInt(2, score);
			pstmt.setInt(3, dno);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				
			}	
		}
		return row;
	}
	
	//삭제메소드
	public int aaaDelete(int dno) {
		String query = "delete from aaa where dno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				
			}	
		}
		return row;
	}
	
	
	
}
