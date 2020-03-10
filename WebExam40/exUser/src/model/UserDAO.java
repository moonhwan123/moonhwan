package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class UserDAO {
	private UserDAO() {
	}

	private static UserDAO instance = new UserDAO();

	public static UserDAO getInstance() {
		return instance;
	}

	// 커넥션 풀 사용
	public Connection getConnection() {
		Connection conn = null;
		try {
			Context init = new InitialContext();
			Context env = (Context) init.lookup("java:/comp/env");
			DataSource ds = (DataSource) env.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 메소드 구현

	// 전체 회원수 카운트 메소드
	public int userCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "select count(*) as counter from usertbl";
		int totcount = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				totcount = rs.getInt("counter");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return totcount;
	}

	// 회원가입 메소드
	public boolean UserInsert(UserVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String query = "insert into usertbl(idx,name,userid,passwd,tel,email)"
				+ " values(usertbl_seq_idx.nextval,?,?,?,?,?)";
		boolean flag = false;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getUserid());
			pstmt.setString(3, vo.getPasswd());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getEmail());
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
		return flag;
	}

}
