<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.*  , java.util.*"%>

<%	
	String passchk=request.getParameter("pass");

	request.setCharacterEncoding("UTF-8");
	BoardVO vo = new BoardVO();
	int idx = Integer.parseInt(request.getParameter("idx"));

	vo.setName(request.getParameter("name"));
	vo.setEmail(request.getParameter("email"));
	vo.setSubject(request.getParameter("subject"));
	vo.setContents(request.getParameter("contents"));
	vo.setIdx(idx);

	BoardDAO dao = BoardDAO.getInstance();
	
	
	
	
	int row = dao.boardUpdate(vo);
	if (row != 0) {
%>
<script>
	alert("수정 성공");
	location.href = "board_list.jsp"
</script>
<%
	} else {
%>
<script>
	alert("수정 실패");
</script>
<%
	}
%>