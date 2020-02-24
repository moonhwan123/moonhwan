<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	String name2 = (String)request.getAttribute("name");
	//겟 어트리뷰트 하면 오브젝트객체로 넘어온다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>
<body>

안녕하세요 <br>
나이 : ${age}   <br>

이름 : ${name}  <br>
이름 : <%= name2 %> <br>
$는 request내장 객체를 의미


</body>
</html>