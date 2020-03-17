package sample.model.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sample.util.DBManager;

public class GuestDAO {
	private GuestDAO() {
	}

	private static GuestDAO instance = new GuestDAO();

	public static GuestDAO getInstance() {
		return instance;
	}

	// 게시물 전체 카운트
	public int guestCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int row = 0;
		String query = "select count(*) as counter from tbl_guest";

		try {
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				row = rs.getInt("counter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return row;
	}

	// 게시물 전체 리스트 뽑아오기
	public List<GuestVO> guestList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<GuestVO> list = new ArrayList<GuestVO>();

		String query = "select * from tbl_guest order by idx desc";

		try {
			GuestVO vo = null;
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new GuestVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 게시글(시작,끝) 불러오기
	public List<GuestVO> GuestList(int pagestart, int endpage) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select X.* from (select rownum rnum, A.* from ("
				+ "select * from tbl_guest order by regdate desc) A " + "where rownum <= ?) X where X.rnum > ?";

		List<GuestVO> list = new ArrayList<GuestVO>();

		try {
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, endpage);
			pstmt.setInt(2, pagestart);
			rs = pstmt.executeQuery();
			GuestVO vo = null;
			while (rs.next()) {
				vo = new GuestVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setSubject(rs.getString("subject"));
				vo.setRegdate(rs.getString("regdate"));
				vo.setReadcnt(rs.getInt("readcnt"));

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}

	// 방명록 등록 메소드
	public int guestWrite(GuestVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String query = "insert into tbl_guest(idx,name,subject,contents) " + "values(tbl_guest_seq_idx.nextval,?,?,?)";

		int row = 0;
		try {
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getContents());

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}

	// 기본키(글번호)에 해당하는 글 추출하는 메소드
	public GuestVO guestSelect(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GuestVO vo = null;
		String query = "select * from tbl_guest where idx=?";

		try {
			vo = new GuestVO();
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			if (rs.next()) {
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
			DBManager.close(conn, pstmt, rs);
		}
		return vo;

	}

	// 조회수 증가 메소드
	public void guestReadcnt(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String query = "update tbl_guest set readcnt = readcnt+1 where idx=?";

		try {
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}

	// 수정
	public int guestModify(GuestVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int row = 0;

		String query = "update tbl_guest set subject=?,contents=? where idx=?";

		try {
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getSubject());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getIdx());

			row = pstmt.executeUpdate();
			// 로우에 성공한 갯수가 들어감

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);

		}
		return row;

	}

	// 삭제
	public int guestDelete(int idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String query = "delete from tbl_guest where idx=?";

		try {
			conn = DBManager.getconnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
		return row;

	}

}
