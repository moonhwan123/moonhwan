package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class StudentDAO {
	
	public int studentInsert(StudentVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "insert into tbl_score_001 values(?,?,?,?,?,?,?)";
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, vo.getBun());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getGender());
			pstmt.setInt(4, vo.getKor());
			pstmt.setInt(5, vo.getEng());
			pstmt.setInt(6, vo.getMat());
			pstmt.setString(7, vo.getRegdate());
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		
		
		return row;
	}
	
	public List<StudentVO> studentList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentVO> list = new ArrayList<StudentVO>();
		String qeury="select * from tbl_score_001 order by bun";
		
		try {
			StudentVO vo = null;
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(qeury);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new StudentVO();
				
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setGender(rs.getString("gender"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMat(rs.getInt("mat"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return list;
	}
	
	
	
}
