package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Finishings;

public class DeptDAO {
	DBManager manager = DBManager.getInstance();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	//1번 메소드 - 전체 목록 출력 메소드
	public List<DeptVO> deptListPrint() {
		String query = "select * from department";
		
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			DeptVO vo = null;
			
			while(rs.next()) {
				vo = new DeptVO();
				
				vo.setDno(rs.getInt("dno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				
			}
		}
		return list;
		
	}
	
	//2번 인서트 메소드
	public int deptInsert(int dno, String dname,String loc) {
		String query = "insert into department values(?,?,?)";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
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
	
	//3번 검색(Search)메소드
	public List<DeptVO> deptSearch(int dno) {
		String query = "select * from department where dno = ?";
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		
		
		try {
			DeptVO vo = null;
			
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new DeptVO();
				vo.setDno(rs.getInt("dno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getString("loc"));
			}
			list.add(vo);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				
			}
		}
		return list;
		
		
	}
	
	
	
	//4번 수정(update)메소드
	public int deptUpdate(String dname, int dno, String loc) {
		String query = "update department set dname = ?"
				+ ", loc = ? where dno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
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
	
	//5번 삭제(Delete)메소드
	public int deptDelete(int dno) {
		String query = "delete from department where dno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
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
