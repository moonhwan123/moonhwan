package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class ReDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// [1] 도서 대출 예약 등록
	public int reInsert(int lentno, String custname, String phone, int bookno, String outdate, String indate) {
		String query = "insert INTO reservation (lentno,custname,phone,bookno,outdate,indate) "
				+ "VALUES (?,?,?,?,?,?)";
		int row = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, lentno);
			pstmt.setString(2, custname);
			pstmt.setString(3, phone);
			pstmt.setInt(4, bookno);
			pstmt.setString(5, outdate);
			pstmt.setNull(6, java.sql.Types.NULL);
//			pstmt.setString(6, indate);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return row;

	}

	// [2] 도서대출 현황 조회
	public List<ReVO> reList() {
		String query = "SELECT * from reservation";
		List<ReVO> list = new ArrayList<ReVO>();

		try {
			ReVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new ReVO();
				vo.setLentno(rs.getInt("lentno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setBookno(rs.getInt("bookno"));
				vo.setOutdate(rs.getString("outdate"));
				vo.setIndate(rs.getString("indate"));
				vo.setStatus(rs.getString("status"));
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
	}//2번 끝
	
	
	//대출번호로 성명,연락처,도서코드,대출일자,반납일자 조회하기
	public List<ReVO> reSearchLentno(int lentno){
		String query = "select custname,phone,bookno,outdate,indate from reservation where lentno=?";
		List<ReVO> list = new ArrayList<ReVO>();
		
		try {
			ReVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, lentno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new ReVO();
				
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setBookno(rs.getInt("bookno"));
				vo.setOutdate(rs.getString("outdate"));
				vo.setIndate(rs.getString("indate"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
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
	
	//[3] 도서 대출 예약 수정
	public int reUpdate(String custname,String phone,int bookno,String outdate, String indate, int lentno) {
		String query = "update reservation set custname=? , phone=? , bookno=?, outdate=?, indate=? where lentno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custname);
			pstmt.setString(2, phone);
			pstmt.setInt(3, bookno);
			pstmt.setString(4, outdate);
			pstmt.setString(5, indate);
			pstmt.setInt(6, lentno);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return row;
	}
	
	
	//[4] 도서 대출 반납 등록
	public int reReturn(String strToday,int lentno) {
		String query = "update reservation set indate = ? where lentno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, strToday);
			pstmt.setInt(2, lentno);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return row;
	}

}
