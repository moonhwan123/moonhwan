<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String userid = request.getParameter("userid");
String name = request.getParameter("name");
String email = request.getParameter("email");




%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
out.print("아이디 : "+userid + "<br>");
out.print("이름 : "+name + "<br>");
out.print("이메일 : "+email + "<br>");
%>

</body>
</html>