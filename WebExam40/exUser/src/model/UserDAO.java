package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {
	private UserDAO() {
	}

	private static UserDAO instance = new UserDAO();

	public static UserDAO getInstance() {
		return instance;
	}

	// 메소드 구현
	// 전체 회원 리스트
	public List<UserVO> userList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "select * from usertbl order by idx desc";
		List<UserVO> list = new ArrayList<UserVO>();

		try {
			UserVO vo = null;
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new UserVO();

				vo.setIdx(rs.getInt("idx"));
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setFirst_time(rs.getString("first_time"));
				vo.setLast_time(rs.getString("last_time"));

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

	// 전체 회원수 카운트 메소드
	public int userCount(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String query = "select count(*) as counter from usertbl";
		int totcount = 0;

		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				totcount = rs.getInt("counter");
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
		return totcount;
	}

	// 회원가입 메소드
	public boolean UserInsert(UserVO vo, Connection conn) {
		PreparedStatement pstmt = null;

		String query = "insert into usertbl(idx,name,userid,passwd,tel,email)"
				+ " values(usertbl_seq_idx.nextval,?,?,?,?,?)";
		boolean flag = false;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getUserid());
			pstmt.setString(3, vo.getPasswd());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getEmail());
			pstmt.executeUpdate();
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e2) {
			}
		}
		return flag;
	}

	// 로그인(id,passwd 체크) 검사 메소드
	public int userLogin(String userid, String passwd, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select passwd from usertbl where userid=?";

		int row = 0;

		try {
			UserVO vo = null;
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String pass = rs.getString("passwd");
				if (pass.equals(passwd)) { // 로그인 성공
					query = "update usertbl set last_time = sysdate where userid=?";
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, userid);
					pstmt.executeUpdate();
					row = 1;
				} else { // 비번오류
					row = 0;
				}

			} else {// 아이디 존재 하지 않음
				row = -1;
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
		return row;

	}

	// id또는 기본키에 해당하는 회원 정보 검색 메소드
	public UserVO userSearch(String userid, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from usertbl where userid=?";

		UserVO vo = new UserVO();

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setUserid(rs.getString("userid"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));

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

	// id또는 기본키에 해당하는 회원 정보 검색 메소드
	public String userSearchEmail(String userid, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from usertbl where userid=?";

		String email = "";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				email = rs.getString("email");

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
		return email;

	}

	// 회원정보 수정 메소드
	public int memberUpdate(String passwd, String tel, String email, String userid, Connection conn) {
		PreparedStatement pstmt = null;

		String query = "update usertbl set passwd=? ,tel=?, email=?  where userid = ?";

		int row = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, passwd);
			pstmt.setString(2, tel);
			pstmt.setString(3, email);
			pstmt.setString(4, userid);

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		return row;

	}

	// 회원정보 수정 메소드
	public int memberUpdate(String passwd, String userid, Connection conn) {
		PreparedStatement pstmt = null;

		String query = "update usertbl set passwd=? where userid = ?";

		int row = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, passwd);
			pstmt.setString(2, userid);

			row = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		return row;

	}

}
