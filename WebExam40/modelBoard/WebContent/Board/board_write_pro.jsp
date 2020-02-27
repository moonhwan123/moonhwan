<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="model.*  , java.util.*" %>

<%
	request.setCharacterEncoding("UTF-8");
	BoardDAO dao = BoardDAO.getInstance();

	BoardVO vo = new BoardVO();
	
	vo.setName(request.getParameter("name"));
	vo.setEmail(request.getParameter("email"));
	vo.setSubject(request.getParameter("subject"));
	vo.setContents(request.getParameter("contents"));
	vo.setPass(request.getParameter("pass"));
	
	int row = dao.boardWrite(vo);

	if(row!=0){
%>
<script>
alert("등록 성공");
location.href="board_list.jsp"
</script>
<%
	}else{
%>
<script>
alert("등록 실패");
location.href="board_write.jsp"
</script>
<%
	}
%>
