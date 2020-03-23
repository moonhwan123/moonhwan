package model.faq;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




public class FaqDAO {
	private FaqDAO() {}
	private static FaqDAO instance = new FaqDAO();
	public static FaqDAO getInstance() {
		return instance;
	}
	
	// 게시글 전체 카운트
	public int faqCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from faq_tbl";
		int cnt = 0;
		try {
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
			} catch (Exception e2) {
			}
		}
		return cnt;
	}
	
	// 게시글중 조건에 맞는 게시글 전체 갯수 카운트
		public int faqCount(String s_query,Connection conn) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select count(*) as counter from faq_tbl where " + s_query;
			int cnt = 0;
			try {
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
				} catch (Exception e2) {
				}
			}
			return cnt;
		}
	
	//전체 글 불러오기
	public List<FaqVO> faqList(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query="select * from faq_tbl order by idx desc";
		List<FaqVO> list = new ArrayList<FaqVO>();
		
		try {
			FaqVO vo = null;
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new FaqVO();
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				list.add(vo);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e2) {}
		}
		return list;
	}
	
	// 게시글(시작,끝) 불러오기
		public List<FaqVO> faqList(int pagestart, int endpage,Connection conn) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select X.* from (select rownum rnum, A.* from ("
					+ "select * from faq_tbl) A " + "where rownum <= ?) X where X.rnum > ?";

			List<FaqVO> list = new ArrayList<FaqVO>();

			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, endpage);
				pstmt.setInt(2, pagestart);
				rs = pstmt.executeQuery();
				FaqVO vo = null;
				while (rs.next()) {
					vo = new FaqVO();
					vo.setIdx(rs.getInt("idx"));
					vo.setSubject(rs.getString("subject"));
					vo.setContents(rs.getString("contents"));
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
				} catch (Exception e2) {
				}
			}
			return list;
		}
	
		// 검색조건이 있을때의 메소드
		public List<FaqVO> faqList(String s_query, int pagestart, int endpage,Connection conn) {
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select X.* from (select rownum rnum, A.* from ("
					+ "select * from faq_tbl) A " + " where " + s_query
					+ " and rownum <= ?) X where " + s_query + " and X.rnum > ?";

			List<FaqVO> list = new ArrayList<FaqVO>();

			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, endpage);
				pstmt.setInt(2, pagestart);
				rs = pstmt.executeQuery();
				FaqVO vo = null;
				while (rs.next()) {
					vo = new FaqVO();
					vo.setIdx(rs.getInt("idx"));
					vo.setSubject(rs.getString("subject"));
					vo.setContents(rs.getString("contents"));
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
				} catch (Exception e2) {
				}
			}
			return list;
		}

	
		// 게시글 등록
		public int faqWrite(FaqVO vo,Connection conn) {
			PreparedStatement pstmt = null;
			String query = "insert into faq_tbl values (faq_tbl_seq_idx.nextval,?,?)";
			int row = 0;
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, vo.getSubject());
				pstmt.setString(2, vo.getContents());
				row = pstmt.executeUpdate();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
				} catch (Exception e2) {
				}
			}
			return row;
		}
	
}
