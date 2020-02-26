<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String end = request.getParameter("end");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>1부터<%= end %>까지 자연수 합 구하기</h3>
<%
int sum = 0;
for(int x=1; x<=Integer.parseInt(end); x++){
	sum = sum+x;
	if(x==Integer.parseInt(end)){
		out.print(x+" = ");
	}else{
		out.print(x+"+");
	}
}
%>
<%= sum %>
</body>
</html>