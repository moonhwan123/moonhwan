package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;





public class PdsDAO {
	private PdsDAO() {
	}

	private static PdsDAO instance = new PdsDAO();

	public static PdsDAO getInstance() {
		return instance;
	}

//	public static Connection getConnection() {
//		Connection conn = null;
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
//			System.out.println("커넥션 성공 "+conn);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return conn;
//	}

	public Connection getConnection() {
		Connection conn = null;

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	// 조회수 증가 메소드
	public void pdsCntUp(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "update tbl_pds set readcnt=readcnt+1 where idx=?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
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
	}

	// idx로 개시글 받아오기
	public PdsVO pdsSelect(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_pds where idx=?order by idx desc";
		PdsVO vo = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo = new PdsVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setPass(rs.getString("pass"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setFilename(rs.getString("filename"));

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
		return vo;
	}

	// 게시글 전체 목록 메소드
	public List<PdsVO> pdsList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_pds order by idx desc";
		List<PdsVO> list = new ArrayList<PdsVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			PdsVO vo = null;
			while (rs.next()) {
				vo = new PdsVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setFilename(rs.getString("filename"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));

				list.add(vo);
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
		return list;
	}
	
	// 게시글(시작,끝) 불러오기
	public List<PdsVO> pdsList(int pagestart, int endpage) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from ("
				+ "select * from tbl_pds order by regdate desc) A " + "where rownum <= ?) X where X.rnum > ?";

		List<PdsVO> list = new ArrayList<PdsVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			PdsVO vo = null;
			while (rs.next()) {
				vo = new PdsVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setFilename(rs.getString("filename"));
				list.add(vo);
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
		return list;
	}

	// 검색조건이 있을때의 메소드
	public List<PdsVO> pdsList(String s_query, int pagestart, int endpage) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from ("
				+ "select * from tbl_pds order by regdate desc) A " + " where " + s_query
				+ " and rownum <= ?) X where " + s_query + " and X.rnum > ?";

		List<PdsVO> list = new ArrayList<PdsVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			PdsVO vo = null;
			while (rs.next()) {
				vo = new PdsVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setFilename(rs.getString("filename"));

				list.add(vo);
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
		return list;
	}


	// 게시글 전체 카운트
	public int pdsCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from tbl_pds";
		int cnt = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				cnt = rs.getInt("counter"); // cnt = rs.getInt(1);
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
		return cnt;
	}
	// 게시글중 조건에 맞는 게시글 전체 갯수 카운트
	public int pdsCount(String s_query) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from tbl_pds where " + s_query;
		int cnt = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				cnt = rs.getInt("counter"); // cnt = rs.getInt(1);
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
		return cnt;
	}

	// 조건에 맞는 게시글 갯수 카운트
	public int pdsCount(String search, String key) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from tbl_pds where " + search + " like '%" + key + "%'";
		int cnt = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				cnt = rs.getInt("counter"); // cnt = rs.getInt(1);
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
		return cnt;
	}

	// 게시글 등록
	public int pdsWrite(PdsVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String query = "insert into tbl_pds(idx,name,email,subject,contents,filename,pass) "
				+ " values (tbl_pds_seq_idx.nextval,?,?,?,?,?,?)";
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getSubject());
			pstmt.setString(4, vo.getContents());
			pstmt.setString(5, vo.getFilename());
			pstmt.setString(6, vo.getPass());
			row = pstmt.executeUpdate();

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
		return row;
	}
	
	// idx(특정) 게시글 수정하는 메소드
	public int pdsModify(PdsVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE TBL_PDS SET EMAIL=?, SUBJECT=?, CONTENTS=?, FILENAME=? " + "WHERE IDX=? AND PASS=?";

		int row = 0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getEmail());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());
			pstmt.setString(4, vo.getFilename());
			pstmt.setInt(5, vo.getIdx());
			pstmt.setString(6, vo.getPass());

			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return row;
	}


}
