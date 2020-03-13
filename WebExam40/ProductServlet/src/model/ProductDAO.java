package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class ProductDAO {
	
	//그룹코드불러오기
	public List<GroupcodeVO> groupcodeList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<GroupcodeVO> list = new ArrayList<GroupcodeVO>();
		
		String query = "select * from groupcode order by gcode";
		
		try {
			GroupcodeVO vo = null;
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new GroupcodeVO();
				vo.setGcode(rs.getString("gcode"));
				vo.setGname(rs.getString("gname"));
				
				list.add(vo);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return list;
	}
	
	//제품 등록 메소드
	public int productInsert(ProductVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "insert into product values(?,?,?,?,?,?,?)";
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getCode());
			pstmt.setString(2, vo.getPname());
			pstmt.setInt(3, vo.getCost());
			pstmt.setInt(4, vo.getPnum());
			pstmt.setInt(5, vo.getJnum());
			pstmt.setInt(6, vo.getSale());
			pstmt.setString(7, vo.getGcode());
			
			row = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return row;
		
	}
	
	
	//제품코드로 제품 정보 가져오는 메소드
	public ProductVO productSearch(String code) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ProductVO vo = new ProductVO();
		String query = "select p.code, p.pname,p.cost,p.pnum,p.jnum,p.sale,g.gname from product p , groupcode g "
				+ " where code = ? and p.gcode = g.gcode";
		
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			
			System.out.println(rs);
			
			if(rs.next()) {
				vo.setCode(rs.getString("code"));
				vo.setPname(rs.getString("pname"));
				vo.setCost(rs.getInt("cost"));
				vo.setPnum(rs.getInt("pnum"));
				vo.setJnum(rs.getInt("jnum"));
				vo.setSale(rs.getInt("sale"));
				vo.setGname(rs.getString("gname"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {	
			}
		}
		return vo;
	}
	
	//제품 정보 수정 메소드
	public int productModify(ProductVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String query = "update product set code = ? , pname = ? , cost = ? , pnum = ? , jnum = ? , sale = ?"
				+ " ,gcode = ? where code = ?";
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getCode());
			pstmt.setString(2, vo.getPname());
			pstmt.setInt(3, vo.getCost());
			pstmt.setInt(4, vo.getPnum());
			pstmt.setInt(5, vo.getJnum());
			pstmt.setInt(6, vo.getSale());
			pstmt.setString(7, vo.getGcode());
			pstmt.setString(8, vo.getCode());
			
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return row;
	}
	
	//제품 삭제 메서드
	public int productDelete(String code) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "delete from product where code = ?";
		
		int row = 0;
		
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, code);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		return row;
	}
	
	//기대이익 리스트 가져오는 메소드
	public List<ProductVO> profitRank(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<ProductVO> list = new ArrayList<ProductVO>();
		
		String query = "select pname,max(sale*jnum) as profit from product group by pname order by profit desc";
		
		try {
			ProductVO vo = null;
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new ProductVO();
				vo.setPname(rs.getString("pname"));
				vo.setTemp(rs.getString("profit"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return list;
	}
	
	//재고수량 조회 하는 메소드
	public List<GroupcodeVO> stockRank(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<GroupcodeVO> list = new ArrayList<GroupcodeVO>();
		
		String query = "select g.gname,sum(p.jnum) as stock from product p , groupcode g "
				+ "where p.gcode = g.gcode group by g.gname order by g.gname desc";
		
		try {
			GroupcodeVO vo = null;
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new GroupcodeVO();
				vo.setGname(rs.getString("gname"));
				vo.setTemp(rs.getString("stock"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {}
		}
		return list;
	}
	
	//우선생산 메소드
		public List<ProductVO> produceRank(){
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			List<ProductVO> list = new ArrayList<ProductVO>();
			
			String query = "select pname,((pnum*0.2)-jnum) as counter from product where jnum < (pnum*0.2)";
			
			try {
				ProductVO vo = null;
				conn = DBManager.getInstance().getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new ProductVO();
					vo.setPname(rs.getString("pname"));
					vo.setTemp(rs.getString("counter"));
					list.add(vo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {}
			}
			return list;
		}
	
}
