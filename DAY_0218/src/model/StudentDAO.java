package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class StudentDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//1번 학생정보입력
	public int StudentInsert(int bun,String name,String addr,String tel,String birth) {
		String query = "insert into student(bun,name,addr,tel,birth) values (?,?,?,?,?)";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			pstmt.setString(2,name);
			pstmt.setString(3,addr);
			pstmt.setString(4,tel);
			pstmt.setString(5,birth);
			
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
		
	}//1번 입력 끝
	
	
	//학번중복검사
	public boolean bunCheck(int bun) {
		String query = "select name from student where bun = ?";
		boolean check = true;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String str = rs.getString("name");
				if(str == null) {
					check = true;
				}else {
					check = false;
				}
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
		return check;
	}
	
	//이름 존재 검사
	public boolean nameCheck(String name) {
		String query = "select name from student where name = ?";
		boolean check = true;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String str = rs.getString("name");
				if(str == null) {
					check = true;
				}else {
					check = false;
				}
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
		return check;
	}
	
	
	
	//2번 전체 학생 정보 조회
	public List<StudentVO> StudentList(){
		String query = "select bun,name,tel,MONTHS_BETWEEN(TRUNC(SYSDATE,'YEAR'),TRUNC(birth,'YEAR')) /12 +1 as age  from student";
		List<StudentVO> list = new ArrayList<StudentVO>();
		
		try {
			StudentVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new StudentVO();
				
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setBirth(rs.getString("age"));
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
	
	
	//3-1 학생이름으로 검색
	public List<StudentVO> StudentSearchName(String name){
		String query = "select * from student where name = ?";
		List<StudentVO> list = new ArrayList<StudentVO>();
		try {
			StudentVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new StudentVO();
				
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setBirth(rs.getString("birth"));
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
	
	//3-2 학생번호로 검색
	public List<StudentVO> StudentSearchBun(int bun){
		String query = "select * from student where bun = ?";
		List<StudentVO> list = new ArrayList<StudentVO>();
		
		try {
			StudentVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new StudentVO();
				
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setBirth(rs.getString("birth"));
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
	//3-3 학생 학년으로 검색
	public List<StudentVO> studentSearchHak(int hak){
//		String query = "select * from student where to_char(bun,'9999') like ?";
		String query = "select * from student where bun like ?";
		List<StudentVO> list = new ArrayList<StudentVO>();
		try {
			StudentVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, String.valueOf(hak)+"%");

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new StudentVO();
				
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setBirth(rs.getString("birth"));
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
	
	
	
	//4번 학생정보 업데이트
	public int studentUpate(String name,String addr,String tel,String birth,int bun) {
		String query="update student set name=?,addr=?,tel=?,birth=?"
				+ " where bun=?";
		
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, tel);
			pstmt.setString(4, birth);
			pstmt.setInt(5, bun);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {

			}
		}
		return row;
		
	}
	
	//4 학생번호로 검색
	public List<StudentVO> StudentSearchBun2(int bun){
		String query = "select bun,name,addr,tel,birth from student where bun = ?";
		List<StudentVO> list = new ArrayList<StudentVO>();
		
		try {
			StudentVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bun);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new StudentVO();
				
				vo.setBun(rs.getInt("bun"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setTel(rs.getString("tel"));
				vo.setBirth(rs.getString("birth"));
				
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
	
	//5번 학생정보 삭제
	public int studentDelete(int bun) {
		String qeury="delete from student where bun = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(qeury);
			pstmt.setInt(1, bun);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {

			}
		}
		return row;
	}
	
}
