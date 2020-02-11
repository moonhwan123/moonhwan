package oracle.dao;

import java.sql.*;
import java.util.*;

import oracle.db.DBManager;
import oracle.dto.DeptVO;

public class SawonDAO {
	DBManager manager = DBManager.getInstance();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	//부서 정보 테이블 전체 검색 메소드 정의
	public List<DeptVO> deptList(){
		String query = "select * from department";

		//필요한 리턴 타입 정의
		List<DeptVO> list = new ArrayList<DeptVO>();
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDno(rs.getInt("dno"));
				vo.setDname(rs.getString("dname"));
				vo.setLoc(rs.getNString("loc"));
				
				list.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}

		return list;
		
	}
	
}
