package oracle.exam;

import java.sql.*;

import oracle.db.OracleConn;

public class OracleSQL extends OracleConn {
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 전체 검색
	public void deptListPrint() throws Exception{
		String query = "select * from department";
		
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			int dno = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			System.out.print(dno+"\t"+dname+"\t "+loc+"\n");
		}
		
	}
	
	
	// 부서번호로 검색
	public void deptSearch(int idno) throws Exception{
		String query = "select * from department where dno = ?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setInt(1,idno);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int dno = rs.getInt("dno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			
			System.out.print(dno+"\t"+dname+"\t "+loc+"\n");
		}
		
	}
	
	
	// 이름 검색
	public void nameSearch(String i_ename) throws Exception{
		String query = "select eno, ename, job, hiredate from employee where ename like ?";
		pstmt=myConn.prepareStatement(query);
		pstmt.setString(1, "%"+i_ename+"%");
		rs = pstmt.executeQuery();
		
		while(rs.next()) { 
			int eno = rs.getInt("eno"); 
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String hiredate = rs.getString("hiredate").substring(0,10);
			
			System.out.print(eno + "\t " + ename + "\t    " + job + "\t " + hiredate  + "\n ");

		}
		
	}
	
	
	//Exam_01
	public void searchExam(int In_dno) throws Exception{
		String query = "select * from employee where dno = ?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setInt(1, In_dno);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { 
			int eno = rs.getInt(1); 
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int manager = rs.getInt("manager");
			String hiredate = rs.getString("hiredate"); 
			int salary = rs.getInt("salary");
			int commission = rs.getInt("commission");
			int dno = rs.getInt("dno");
			
			System.out.print(eno + "\t " + ename + "\t    " + job + "\t " + manager + "\t ");
			System.out.print(hiredate + "\t " + salary + "\t " + commission + "\t " + dno + "\n");
		}
		
		
	}
	
	//Exam_02
	public void searchExam02(String In_hiredate) throws Exception{
		String query = "select * from employee where hiredate >= ?";
		pstmt = myConn.prepareStatement(query);
		pstmt.setString(1, In_hiredate);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { 
			int eno = rs.getInt("eno"); 
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int manager = rs.getInt("manager");
			String hiredate = rs.getString("hiredate"); 
			int salary = rs.getInt("salary");
			int commission = rs.getInt("commission");
			int dno = rs.getInt("dno");
			
			System.out.print(eno + "\t " + ename + "\t    " + job + "\t " + manager + "\t ");
			System.out.print(hiredate + "\t " + salary + "\t " + commission + "\t " + dno + "\n");
		}

	}
			
	
	
	
	
	@Override
	public void cleanUp() throws Exception {
		if(rs!=null) {
			rs.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
	}

}
