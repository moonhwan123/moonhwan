package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private BoardDAO() {}
	public static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//리스트
	public List<BoardVO> boardList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<BoardVO> list = new ArrayList<BoardVO>();

		String query="select * from tbl_board order by idx desc";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			BoardVO vo = null;
			while(rs.next()) {
				vo = new BoardVO();
				
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setName(rs.getString("name"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				
				list.add(vo);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	
	
	//등록(글쓰기)
	public int boardWrite(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		
		String query = "insert into tbl_board(idx,name,email,subject,contents,pass) "
				+ "values(tbl_board_seq_idx.nextval,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getSubject());
			pstmt.setString(4, vo.getContents());
			pstmt.setString(5, vo.getPass());
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
			}
		}
		return row;
	}
	
	
	
	//idx로 내용불러오기
	public BoardVO boardselect(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		BoardVO vo = new BoardVO();
		
		String query = "select * from tbl_board where idx = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setEmail(rs.getString("email"));
				vo.setPass(rs.getString("pass"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return vo;
	}
	//조회수 증가 메소드
	public void boardReadcnt(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query="update tbl_board set readcnt = readcnt+1 where idx=?";
		
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
	public int boardUpdate(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		
		String query = "update tbl_board set email=?,subject=?,contents=? where idx=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getEmail());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());
			pstmt.setInt(4, vo.getIdx());
			
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
		public int boardDelete(int idx) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int row = 0;
			String query="delete from tbl_board where idx=?";
			
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
