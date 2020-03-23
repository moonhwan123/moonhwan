package model.index;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.portfolio.PortfolioVO;

public class IndexDAO {
	private IndexDAO() {
	}

	private static IndexDAO instance = new IndexDAO();

	public static IndexDAO getInstance() {
		return instance;
	}
	
	public List<PortfolioVO> indexPortList(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select * from (select * from portfolio_tbl order by idx desc) where rownum<=3";
		List<PortfolioVO> list = new ArrayList<PortfolioVO>();
		
		try {
			PortfolioVO vo = null;
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new PortfolioVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setSubject(rs.getString("subject"));
				vo.setContents(rs.getString("contents"));
				vo.setFilename(rs.getString("filename"));
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
	
	
	
}
