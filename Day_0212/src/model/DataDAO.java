package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class DataDAO {
	DBManager manager = DBManager.getInstance();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	//P.65 1번예제
	public List<EmpVO> exam_01(){
		String query = "select ename,salary,salary+300 as temp from employee";
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			EmpVO vo = null;
			
			while(rs.next()){
				vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setTemp(rs.getInt("temp"));
				
				list.add(vo);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
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
	
	//2번 예제
	public List<EmpVO> exam_02(){
		String query = "select ename,salary,salary*12+100 as temp from employee order by temp desc";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setTemp(rs.getInt("temp"));
				
				list.add(vo);
			}
			
		} catch (Exception e) {} 
		finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
		
		return list;

	}
	
	
	//3번 예제
	public List<EmpVO> exam_03(){
		String query = "select ename,salary from employee where salary > 2000 order by salary desc";
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				
				list.add(vo);				
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
		
	}
	
	//4번 예제
	public EmpVO exam_04(){
		String query = "select ename,dno from employee where eno = 7788";
		EmpVO vo = null;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				vo.setEname(rs.getString("ename"));
				vo.setDno(rs.getInt("dno"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return vo;
		
	}
	
	public List<EmpVO> exam_05() {
		String query = "select ename,salary from employee where salary < 2000 or salary > 3000";
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				
				list.add(vo);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//6번 예제
	public List<EmpVO> exam_06() {
		String query = "select ename, job, hiredate from employee where hiredate between '81/02/20' and "
				+ "'81/05/01'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setHiredate(rs.getString("hiredate"));
				
				list.add(vo);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//7번 예제
	public List<EmpVO> exam_07() {
		String query = "select ename,dno from employee where dno = 20 or dno = 30 order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setDno(rs.getInt("dno"));
				
				list.add(vo);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//8번 예제
	public List<EmpVO> exam_08() {
		String query = "select ename,salary,dno from employee where (salary between 2000 and 3000) and (dno = 20 or dno = 30) order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setSalary(rs.getInt("salary"));
				vo.setDno(rs.getInt("dno"));
				
				list.add(vo);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//9번 예제
	public List<EmpVO> exam_09() {
		String query = "select ename,hiredate from employee where hiredate like '81%'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setHiredate(rs.getString("hiredate"));
				
				list.add(vo);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	
	//10번 예제
	public List<EmpVO> exam_10() {
		String query = "select ename,job from employee where manager is null";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmpVO();
				
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				
				list.add(vo);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	
	//11번 예제
		public List<EmpVO> exam_11() {
			String query = "select ename,salary,commission from employee where commission is not null order by "
					+ "salary asc, commission asc";
			List<EmpVO> list = new ArrayList<EmpVO>();
			EmpVO vo = null;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new EmpVO();
					
					vo.setEname(rs.getString("ename"));
					vo.setSalary(rs.getInt("salary"));
					vo.setCommission(rs.getInt("commission"));
					
					list.add(vo);				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return list;
		}
		
		//12번 예제
		public List<EmpVO> exam_12() {
			String query = "select ename from employee where ename like '__R%'";
			List<EmpVO> list = new ArrayList<EmpVO>();
			EmpVO vo = null;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new EmpVO();
					
					vo.setEname(rs.getString("ename"));
					
					list.add(vo);				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return list;
		}
	

		//13번 예제
		public List<EmpVO> exam_13() {
			String query = "select ename from employee where ename like '%A%' and ename like '%E%'";
			List<EmpVO> list = new ArrayList<EmpVO>();
			EmpVO vo = null;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new EmpVO();
					
					vo.setEname(rs.getString("ename"));
					
					list.add(vo);				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return list;
		}
		
		//14번 예제
		public List<EmpVO> exam_14() {
			String query = "select ename,job,salary from employee "
					+ "where job in ('CLERK','SALESMAN') and salary not in (1600,950,1300)";
			List<EmpVO> list = new ArrayList<EmpVO>();
			EmpVO vo = null;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new EmpVO();
					
					vo.setEname(rs.getString("ename"));
					vo.setJob(rs.getString("job"));
					vo.setSalary(rs.getInt("salary"));
					
					list.add(vo);				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return list;
		}
		
		
		//15번 예제
		public List<EmpVO> exam_15() {
			String query = "select ename,salary,commission from employee "
					+ "where commission >= 500";
			List<EmpVO> list = new ArrayList<EmpVO>();
			EmpVO vo = null;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					vo = new EmpVO();
					
					vo.setEname(rs.getString("ename"));
					vo.setSalary(rs.getInt("salary"));
					vo.setCommission(rs.getInt("commission"));
					
					list.add(vo);				
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return list;
		}
		
	
}
