package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class ShopDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//[1] 회원 정보 등록
	public int shopInsert(int custno,String custname,String phone,String gender,String grade) {
		String query = "insert into shopping(custno,custname,phone,gender,grade) "
				+ "values (?,?,?,?,?)";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, custno);
			pstmt.setString(2, custname);
			pstmt.setString(3, phone);
			pstmt.setString(4, gender);
			pstmt.setString(5, grade);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return row;
	}
	
	
	//[2] 회원정보 현황 조회
	public List<ShopVO> shopList(){
		String query = "select * from shopping";
		List<ShopVO> list = new ArrayList<ShopVO>();
		
		try {
			ShopVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new ShopVO();
				
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setGender(rs.getNString("gender"));
				vo.setJoindate(rs.getString("joindate"));
				vo.setGrade(rs.getString("grade"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}//[2] 회언정보 현황 조회 끝
	
	
	//[3] 회원정보 수정 - 회원번호로 정보 불러오기
	public List<ShopVO> searchNo(int custno){
		String query = "select * from shopping where custno = ?";
		List<ShopVO> list = new ArrayList<ShopVO>();
		
		try {
			ShopVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, custno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new ShopVO();
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setGender(rs.getNString("gender"));
				vo.setJoindate(rs.getString("joindate"));
				vo.setGrade(rs.getString("grade"));
				list.add(vo);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
		
	}//번호로 회원 정보 불러오기 끝
	
	//[3] 회원정보 수정
	public int shopUpdate(String custname, String phone, String gender, String grade , int custno) {
		String query = "update shopping set custname = ? , phone = ? , gender = ? , grade = ? where custno = ?";
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custname);
			pstmt.setString(2, phone);
			pstmt.setString(3, gender);
			pstmt.setString(4, grade);
			pstmt.setInt(5, custno);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return row;
		
	}
	
	
	//[4] 회원 정보 삭제 
	public int shopDelete(int custno) {
		String query = "delete from shopping where custno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, custno);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return row;
	}

}
