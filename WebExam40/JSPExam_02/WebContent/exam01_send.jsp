<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String choice = request.getParameter("choice");
	
	if(choice.equals("naver")){
		response.sendRedirect("https://www.naver.com/");
	}else if(choice.equals("daum")){
		response.sendRedirect("https://www.daum.net/");
	}else{
		response.sendRedirect("https://www.google.com/");
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>