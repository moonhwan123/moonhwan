<%@page import="sample.model.guest.GuestDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="sample.model.guest.*" %>

<%
	GuestDAO dao = GuestDAO.getInstance();
	int row = dao.guestCount();

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>SampleMVC Project</h3>
<a href="Guest?command=guest_list"><p>방명록 리스트</p></a>
<a href="Board?command=board_list"><p>게시판 리스트</p></a>
</body>
</html>