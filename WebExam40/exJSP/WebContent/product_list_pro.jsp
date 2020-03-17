<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	
	request.setCharacterEncoding("UTF-8");
	String code = request.getParameter("code");
	String pname = request.getParameter("pname");
 	int cost = Integer.parseInt(request.getParameter("cost"));
 	int pnum = Integer.parseInt(request.getParameter("pnum"));
 	int jnum = Integer.parseInt(request.getParameter("jnum"));
 	int sale = Integer.parseInt(request.getParameter("sale"));
 	String gcode = request.getParameter("gcode");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	String query = "update product set code = ? , pname = ? , cost = ? , pnum = ? , jnum = ? , sale = ?"
			+ " ,gcode = ? where code = ?";
	
	pstmt = conn.prepareStatement(query);
	
	int row = 0;
	pstmt.setString(1, code);
	pstmt.setString(2, pname);
	pstmt.setInt(3, cost);
	pstmt.setInt(4, pnum);
	pstmt.setInt(5, jnum);
	pstmt.setInt(6, sale);
	pstmt.setString(7, gcode);
	pstmt.setString(8, code);
	
	row = pstmt.executeUpdate();

	if(row == 0){
	
%>

<script>
alert("수정에 실패 하셨습니다.");
history.back();

</script>
<%
	}else{

%>
<script>
alert("수정에 성공 하셨습니다.");
location.href = "product_tot_list.jsp";

</script>
<%
	}

%>
