<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//다른페이지에서 값 받아오기 request객체의 getParameter메소드
	//request의 경우 객체를 생성하지 않아도된다. 
	//tomcat이 설치되어 있는경우 내장 객체로 존재(객체가 이미 생성되어 있음)
	//JSP내장객체 => request(요청),response(응답),out,application,context
	String age = request.getParameter("age");
	String gender = request.getParameter("gender");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과는 : <%= age %>
성별은 : <%= gender %>



</body>
</html>