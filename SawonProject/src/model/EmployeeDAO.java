package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db.DBManager;

public class EmployeeDAO {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//1번 전체사원출력
	public List<EmployeeVO> employeePrint(){
		String query = "select e.*, dname from employee e, department d where e.dno = d.dno ";
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		try {
			EmployeeVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmployeeVO();
				
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setManager(rs.getInt("manager"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				vo.setCommission(rs.getInt("commission"));
//				vo.setDno(rs.getInt("dno"));
				vo.setDname(rs.getString("dname"));
				
				list.add(vo);
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
	}//1번 끝
	
	
	//2번 사원 삽입
	public int employeeInsert(String ename, String job,int manager, String hiredate, int salary,int commission,int dno) {
		String query = "insert into employee values(EMPLOYEE_SEQ_ENUM.nextval,?,?,?,?,?,?,?)";
		int row = 0;

	
		try {
			conn = this.manager.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, manager);
			pstmt.setString(4, hiredate);
			pstmt.setInt(5, salary);
			pstmt.setInt(6, commission);
			pstmt.setInt(7, dno);
			row = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		return row;
	}
	
	//3번 사원 검색
	public List<EmployeeVO> employeeSearch(String ename){
		String query = "select e.eno,e.ename,e.job,ee.ename as Mname," + 
				"e.hiredate,e.salary,e.commission,dname " + 
				"from employee e,employee ee, department d " + 
				"where e.ename = ? and e.dno = d.dno " + 
				"and ee.eno(+) = e.manager";
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		try {
			EmployeeVO vo = null;
			
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ename);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmployeeVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMname(rs.getString("Mname"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				vo.setCommission(rs.getInt("commission"));
				vo.setDname(rs.getString("dname"));
				list.add(vo);
			}
			
			
			
		} catch (Exception e) {
			
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
	
	//4번 수정(update)메소드
	public int employeeUpdate(int eno,String ename, String job, int manager, String hiredate,int salary,int commission,int dno) {
		String query = "update employee set ename=? , job=?, manager=?,hiredate=?,salary=?,commission=?,dno=? where eno=?";
		int row = 0;
		
		try {
			conn = this.manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			pstmt.setInt(3, manager);
			pstmt.setString(4, hiredate);
			pstmt.setInt(5, salary);
			pstmt.setInt(6, commission);
			pstmt.setInt(7, dno);
			pstmt.setInt(8, eno);
			row = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				
			}	
		}
		
		return row;
		
	}
	
	
	
	//4_1번 사원정보 업데이트
	public List<EmployeeVO> employeeUpdateSearch(int eno){
		String query = "select * from employee where eno = ?";
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		try {
			EmployeeVO vo = null;
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new EmployeeVO();
				
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setManager(rs.getInt("manager"));
				vo.setHiredate(rs.getString("hiredate"));
				vo.setSalary(rs.getInt("salary"));
				vo.setCommission(rs.getInt("commission"));
				vo.setDno(rs.getInt("dno"));
				
				list.add(vo);
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return list;
	}//4_1번 끝
	
	
	
	//5번 사원삭제
	public int employeeDelete(int eno) {
		String query = "delete from employee where eno = ?";
		int row = 0;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, eno);
			row = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch (Exception e) {
				
			}
		}
		return row;
	}
	
	
	//이름으로 부서명 받아오는 메소드
	public DepartmentVO nameBuseo(String ename) {
		String query = "select dname" + 
				" from employee e, department d" + 
				" where e.dno = d.dno and e.ename=?";
		DepartmentVO vo = null;
		
	
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ename);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new DepartmentVO();
				vo.setDname(rs.getString("dname"));
			}
			
		} catch (Exception e) {
			
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
	
	
	//부서번호 존재하는지 알아보는 메소드
	public int buseoSearch(int dno){
		String query = "select * from department where dno =?";
		DepartmentVO vo = null;
		int row = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);
			
			row = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				
			}
		}
		return row;
		
	}
	
	
	
	

}
