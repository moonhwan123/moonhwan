<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String code = request.getParameter("code");

	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String query = "delete from product where code = ?";
	
	int row = 0;

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
	}catch(Exception e){
		e.printStackTrace();
	}
	
	pstmt = conn.prepareStatement(query);
	pstmt.setString(1, code);
	row = pstmt.executeUpdate();
	
	if(row == 0){
	
%>

<script>
alert("제품정보 삭제에 실패 하셨습니다.");
history.back();

</script>
<%
	}else{

%>
<script>
alert("제품정보 삭제에 성공 하셨습니다.");
location.href = "product_tot_list.jsp";

</script>
<%
	}

%>    
