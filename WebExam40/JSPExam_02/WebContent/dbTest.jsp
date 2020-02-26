<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.* , java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			out.println("드라이버 로딩");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Connection conn = null;
		try{
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
			out.println(conn);
		}catch(Exception e){
			e.printStackTrace();
		}
	%>


</body>
</html>