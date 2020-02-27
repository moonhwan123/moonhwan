<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*" %>

<%
	request.setCharacterEncoding("UTF-8");
	GuestVO vo = new GuestVO();

	int idx = Integer.parseInt(request.getParameter("idx"));


	
	GuestDAO dao = GuestDAO.getInstance();
	
	int row = dao.guestDelete(idx);
	
	if(row!=0){
		response.sendRedirect("guest_list.jsp");
	}else{
	
//	<script>
//	alert("등록되었습니다.");
//	location.href="guest_list.jsp"
//</script>
%>
<script>
	alert("수정실패.");
</script>
<%
	}
%>