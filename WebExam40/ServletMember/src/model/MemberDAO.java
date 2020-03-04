package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class MemberDAO {
	
	
	//회원 정보 등록 메소드
	public boolean memberInsert(MemberVO vo) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			String query = "insert into tbl_member(idx,name,userid,passwd,gubun,zipcode,addr1,addr2,tel,email,job,favorite,intro)"
					+ " values(tbl_member_seq_idx.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
			boolean flag = false;
			
			try {
				conn = DBManager.getInstance().getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getUserid());
				pstmt.setString(3, vo.getPasswd());
				pstmt.setString(4, vo.getGubun());
				pstmt.setString(5, vo.getZipcode());
				pstmt.setString(6, vo.getAddr1());
				pstmt.setString(7, vo.getAddr2());
				pstmt.setString(8, vo.getTel());
				pstmt.setString(9, vo.getEmail());
				pstmt.setString(10, vo.getJob());
				pstmt.setString(11, vo.getFavorite());
				pstmt.setString(12, vo.getIntro());
				pstmt.executeUpdate();
				flag = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close(); 
				} catch (Exception e2) {}
			}
			return flag;
	}
	
	
	
	//id 중복검사 메소드
	public int memberIDCheck(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int row = 0;
		String query = "select count(*) from tbl_member where userid=?";
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				row = rs.getInt(1);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close(); 
			} catch (Exception e2) {}
		}
		return row;

	}
	
	//우편번호 검색 메소드
	public List<ZipcodeVO> zipcodeList(String addr){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from zipcode where dong like '%" + addr + "%'";
		
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();
		
		try {
			
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeVO vo = new ZipcodeVO();
				vo.setZipcode(rs.getString("zipcode"));
				vo.setSido(rs.getString("sido"));
				vo.setGugun(rs.getString("gugun"));
				vo.setDong(rs.getString("dong"));
				vo.setBunji(rs.getString("bunji"));
				
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
	}
	
	
	//회원전체 목록 검색 메소드
	public List<MemberVO> memberList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_member";
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		
		try {
			MemberVO vo = null;
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new MemberVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setTel(rs.getString("tel"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setLast_time(rs.getString("last_time"));
				
				list.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close(); 
			} catch (Exception e2) {}
		}
		return list;
		
	}
	
	//로그인(id,passwd 체크) 검사 메소드
	public int memberLogin(String userid, String passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select passwd from tbl_member where userid=?";
		
		
		int row = 0;
		
		
		try {
			MemberVO vo = null;
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String pass = rs.getString("passwd");
				if(pass.equals(passwd)) { //로그인 성공
					query="update tbl_member set last_time = sysdate where userid=?";
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, userid);
					pstmt.executeUpdate();
					row=1;
				}else { //비번오류
					row=0;
				}
				
			}else {//아이디 존재 하지 않음
				row=-1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close(); 
			} catch (Exception e2) {}
		}
		return row;
		
		
		
	}
	
	
	//id또는 기본키에 해당하는 회원 정보 검색 메소드
	public MemberVO MemberSearch(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from tbl_member where userid=?";
		
		MemberVO vo = new MemberVO();
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setGubun(rs.getString("gubun"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setAddr1(rs.getString("addr1"));
				vo.setAddr2(rs.getString("addr2"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setJob(rs.getString("job"));
				vo.setFavorite(rs.getString("favorite"));
				vo.setIntro(rs.getString("intro"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
			}
		}
		return vo;
		

	}
	
	//회원정보 수정 메소드
	
	
	
	
}
