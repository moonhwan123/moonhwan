<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*" %>
    
    
<%
	request.setCharacterEncoding("UTF-8");
	GuestVO vo = new GuestVO();
	
	
	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	int idx = Integer.parseInt(request.getParameter("idx"));
	
	vo.setSubject(subject);
	vo.setContents(contents);
	vo.setIdx(idx);
	
	GuestDAO dao = GuestDAO.getInstance();
	
//	dao.guestWrite(name, subject, contents);
	int row = dao.guestUpdate(vo);
	
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

