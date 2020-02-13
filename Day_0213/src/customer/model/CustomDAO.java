package customer.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Finishings;

import model.DBManager;
import model.DeptVO;

public class CustomDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//1번 메소드 - 전체 목록 출력 메소드
	public List<CustomVO> customView(){
		String query = "select * from custom order by num asc";
		List<CustomVO> list = new ArrayList<CustomVO>();
		
		
		try {
			CustomVO vo = null;
			
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new CustomVO();
				
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setOffice(rs.getString("office"));
				vo.setBirthday(rs.getString("birthday").substring(0,11));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate").substring(0,11));
				
				list.add(vo);
			}
			
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
	
	
	//2번 신규고객 등록 메소드
	public int customInsert(int num, String name, String tel, String addr,String office, String birthday,String sex) {
		String query = "insert into custom(num,name,tel,addr,office,birthday,sex) values(?,?,?,?,?,?,?)";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, tel);
			pstmt.setString(4, addr);
			pstmt.setString(5, office);
			pstmt.setString(6, birthday);
			pstmt.setString(7, sex);
			
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			
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
	public List<CustomVO> customSearch(String name){
		String query = "select name,tel,addr,office,birthday,sex,indate from custom where name = ?";
		List<CustomVO> list = new ArrayList<CustomVO>();
		
		try {
			CustomVO vo = null;
			
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new CustomVO();
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setAddr(rs.getString("addr"));
				vo.setOffice(rs.getString("office"));
				vo.setBirthday(rs.getString("birthday").substring(0,11));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate").substring(0,11));
			}
			list.add(vo);
			
		} catch (Exception e) {
			
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
	public int customUpdate(int num, String tel, String office) {
		String query = "update custom set tel=? , office=? where num=?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, tel);
			pstmt.setString(2, office);
			pstmt.setInt(3, num);
			
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
	public int customDelete(int num) {
		String query = "delete from custom where num=?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
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
	
	//번호로 서치
	public List<CustomVO> customSearch2(int num){
		String query = "select name,tel,addr,office,birthday,sex,indate from custom where num = ?";
		List<CustomVO> list = new ArrayList<CustomVO>();
		
		try {
			CustomVO vo = null;
			
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new CustomVO();
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setAddr(rs.getString("addr"));
				vo.setOffice(rs.getString("office"));
				vo.setBirthday(rs.getString("birthday").substring(0,11));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate").substring(0,11));
			}
			list.add(vo);
			
		} catch (Exception e) {
			
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
	
	//번호로 이름만 서치
	public CustomVO customSearch3(int num){
		String query = "select name,tel,addr,office,birthday,sex,indate from custom where num = ?";
		CustomVO vo = null;
		try {
			
			
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new CustomVO();
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setAddr(rs.getString("addr"));
				vo.setOffice(rs.getString("office"));
				vo.setBirthday(rs.getString("birthday").substring(0,11));
				vo.setSex(rs.getString("sex"));
				vo.setIndate(rs.getString("indate").substring(0,11));
			}
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				
			}
		}
		return vo;
		
	}
	
	
	
}
