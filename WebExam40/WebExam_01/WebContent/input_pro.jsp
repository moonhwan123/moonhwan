<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String age = request.getParameter("age");
	//웹을 통해 이동되는 데이터는 무조건 "문자"
	out.print("age : " + age + "<br>");
	//<br> : 줄바꾸기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전송되었습니다.
나이는 <%= age %>

</body>
</html>