package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;
import vo.JoinVO;

public class JoinDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 1번 유저 출력
	public List<JoinVO> userPrint() {
		String query = "select userid,name,email,regdate from join order by regdate";
		List<JoinVO> list = new ArrayList<JoinVO>();

		try {
			JoinVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new JoinVO();

				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
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
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;

	}// 1번 끝

	// 2번 회원등록
	public int userInsert(String userid, String name, String passwd, String email, int age) {
		String query = "insert into join(userid,name,passwd,email,age) " + " values(?,?,?,?,?)";
		int row = 0;

		try {
			conn = this.manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			pstmt.setString(2, name);
			pstmt.setString(3, passwd);
			pstmt.setString(4, email);
			pstmt.setInt(5, age);
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

	}// 2번 끝

	public boolean idCheck(String userid) {
		String query = "select userid from join where userid=?";
		boolean check = true;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String str = rs.getString("userid");
				if (str == null) {
					System.out.println("중복아님");
					check = true;
				} else {
					check = false;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}
		return check;
	}

	// 3번 로그인
	public JoinVO joinLogin(String userid) {
		String query = "select userid,passwd from join where userid = ?";

		JoinVO vo = null;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new JoinVO();
				vo.setUserid(rs.getString("userid"));
				vo.setPasswd(rs.getString("passwd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		return vo;

	}

	// 4번 회원 정보 검색(이름으로)
	public List<JoinVO> joinSearchName(String name) {
		String query = "select userid,name,email,age,regdate" + " from join where name = ?";
		List<JoinVO> list = new ArrayList<JoinVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				JoinVO vo = new JoinVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));
				vo.setRegdate(rs.getString("regdate"));

				list.add(vo);
			}

		} catch (Exception e) {

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

	// 4번 회원 정보 검색(아이디로)
	public List<JoinVO> joinSearchId(String userid) {
		String query = "select userid,name,email,age,regdate" + " from join where userid = ?";
		List<JoinVO> list = new ArrayList<JoinVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				JoinVO vo = new JoinVO();
				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));
				vo.setRegdate(rs.getString("regdate"));

				list.add(vo);
			}

		} catch (Exception e) {

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

	// 5번 회원 정보 수정
	// 아이디로 수정용 정보 불러오기
	public List<JoinVO> updatePrint(String userid) {
		String query = "select userid,name,passwd,email,age " + "from join where userid = ?";
		List<JoinVO> list = new ArrayList<JoinVO>();

		try {
			JoinVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new JoinVO();

				vo.setUserid(rs.getString("userid"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setEmail(rs.getString("email"));
				vo.setAge(rs.getInt("age"));

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
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// 업데이트 하기
	public int joinUpdate(String userid, String name, String passwd, String email, int age) {
		String query = "update join set name = ?, passwd = ?, email = ? , " + "age = ? where userid = ?";
		int row = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);
			pstmt.setString(5, userid);
			row = pstmt.executeUpdate();

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

	// 6 아이디로 이름과 이메일 불러오기
	public List<JoinVO> joinDeleteSearch(String userid) {
		String qeury = "select name,email from join where userid=?";
		List<JoinVO> list = new ArrayList<JoinVO>();

		try {
			JoinVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(qeury);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				vo = new JoinVO();

				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
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
				// TODO: handle exception
			}
		}
		return list;
	}

	// 6번 회원 정보 삭제
	public int joinDelete(String userid) {
		String query = "delete from join where userid=?";
		int row = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);
			row = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
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
