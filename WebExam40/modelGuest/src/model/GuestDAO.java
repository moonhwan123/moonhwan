package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class GuestDAO {
	private GuestDAO() {}
	public static GuestDAO instance = new GuestDAO(); //객체 생성(싱글톤 방식)
	
	public static GuestDAO getInstance() {
		return instance;
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
//			System.out.println("커넥션 성공 "+conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//db연결Test메소드
	public void dbTest() {
		Connection conn = null;
		try {
			conn = getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//방명록 전체 자료 검색(Select) 메소드
	public List<GuestVO> guestList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//쿼리문 정의
		String query="select * from tbl_guest order by idx desc";
		//리턴타입 정의 (리턴타입에 맞는놈 정의)
		List<GuestVO> list = new ArrayList<GuestVO>();
		
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			GuestVO vo = null;
			while(rs.next()) {
				vo = new GuestVO();
				
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				
				list.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//등록메소드-1
	public void guestWrite(String name, String subject, String contents) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query="insert into tbl_guest(idx,name,subject,contents) "
				+ " values(tbl_guest_seq_idx.nextval,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, subject);
			pstmt.setString(3, contents);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	//등록메소드-2 (오버로딩)
	public int guestWrite(GuestVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		
		String query="insert into tbl_guest(idx,name,subject,contents) "
				+ " values(tbl_guest_seq_idx.nextval,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());
			
			row = pstmt.executeUpdate();
			//로우에 성공한 갯수가 들어감
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return row;
		
	}
	
	//기본키(글번호)에 해당하는 글 추출하는 메소드
	public GuestVO guestSelect(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestVO vo = null;
		String query = "select * from tbl_guest where idx=?";
		
		try {
			vo = new GuestVO();
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return vo;
		
	}
	//조회수 증가 메소드
	public void guestReadcnt(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query="update tbl_guest set readcnt = readcnt+1 where idx=?";
		
		try {
			conn = getConnection();
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {}
		}
	}
	
	//수정
	public int guestUpdate(GuestVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		
		String query="update tbl_guest set subject=?,contents=? where idx=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getSubject());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getIdx());
			
			row = pstmt.executeUpdate();
			//로우에 성공한 갯수가 들어감
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return row;
		
	}
	
	
	
	
	//삭제
	public int guestDelete(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query="delete from tbl_guest where idx=?";
		
		try {
			conn = getConnection();
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {}
		}
		return row;
		
		
	}
	
	
	
	
	
	
}
