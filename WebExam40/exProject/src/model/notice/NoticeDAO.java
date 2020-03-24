package model.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.portfolio.PortfolioVO;

public class NoticeDAO {
	private NoticeDAO() {
	}

	private static NoticeDAO instance = new NoticeDAO();

	public static NoticeDAO getInstance() {
		return instance;
	}
	
	// 조회수 증가 메소드
	public void noticeCntUp(int idx, Connection conn) {
		PreparedStatement pstmt = null;
		String query = "update notice_tbl set readcnt=readcnt+1 where idx=?";
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
	public int noticeWrite(NoticeVO vo, Connection conn) {
		PreparedStatement pstmt = null;

		String query = "insert into portfolio_tbl(idx,subject,contents,filename) values (portfolio_tbl_seq_idx.nextval,?,?,?)";
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
