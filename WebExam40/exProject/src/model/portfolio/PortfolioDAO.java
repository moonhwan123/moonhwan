package model.portfolio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class PortfolioDAO {
	private PortfolioDAO() {
	}

	private static PortfolioDAO instance = new PortfolioDAO();

	public static PortfolioDAO getInstance() {
		return instance;
	}

	// 조회수 증가 메소드
	public void portfolioCntUp(int idx, Connection conn) {
		PreparedStatement pstmt = null;
		String query = "update portfolio_tbl set readcnt=readcnt+1 where idx=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	// 게시글 등록
	public int portfolioWrite(PortfolioVO vo, Connection conn) {
		PreparedStatement pstmt = null;

		String query = "insert into portfolio_tbl(idx,subject,contents,filename) values (portfolio_tbl_seq_idx.nextval,?,?,?)";
		int row = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getSubject());
			pstmt.setString(2, vo.getContents());
			pstmt.setString(3, vo.getFilename());
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

	// 게시글 전체 카운트
	public int portfolioCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from portfolio_tbl";
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
	public int portfolioCount(String s_query, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select count(*) as counter from portfolio_tbl where " + s_query;
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

	// 전체 글 불러오기
	public List<PortfolioVO> portfolioList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from portfolio_tbl order by idx desc";
		List<PortfolioVO> list = new ArrayList<PortfolioVO>();

		try {
			PortfolioVO vo = null;
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new PortfolioVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFilename(rs.getString("filename"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
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

	// 게시글(시작,끝) 불러오기
	public List<PortfolioVO> portfolioList(int pagestart, int endpage, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from ("
				+ "select * from portfolio_tbl order by regdate desc) A " + "where rownum <= ?) X where X.rnum > ?";

		List<PortfolioVO> list = new ArrayList<PortfolioVO>();

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			PortfolioVO vo = null;
			while (rs.next()) {
				vo = new PortfolioVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFilename(rs.getString("filename"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
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
	public List<PortfolioVO> portfolioList(String s_query, int pagestart, int endpage, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from ("
				+ "select * from portfolio_tbl order by regdate desc) A " + " where " + s_query
				+ " and rownum <= ?) X where " + s_query + " and X.rnum > ?";

		List<PortfolioVO> list = new ArrayList<PortfolioVO>();

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			PortfolioVO vo = null;
			while (rs.next()) {
				vo = new PortfolioVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFilename(rs.getString("filename"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setRegdate(rs.getString("regdate"));
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

	// idx로 개시글 받아오기
	public PortfolioVO portfolioSelect(int idx, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from portfolio_tbl where idx=? order by idx desc";
		PortfolioVO vo = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo = new PortfolioVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				vo.setFilename(rs.getString("filename"));
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
		return vo;
	}

}
