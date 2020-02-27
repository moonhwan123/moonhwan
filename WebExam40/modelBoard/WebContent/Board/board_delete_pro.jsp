<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.*  , java.util.*"%>
<% 
	int idx = Integer.parseInt(request.getParameter("idx"));
	
	BoardDAO dao = BoardDAO.getInstance();
	
	BoardVO vo = dao.boardselect(idx);
	
	String curpass = vo.getPass();
	String paspass = request.getParameter("pass");
	if(curpass.equals(paspass)){
		int row = dao.boardDelete(idx);
		if(row!=0){
			
%>
<script>
alert("삭제성공");
location.href = "board_list.jsp"
</script>
<%
		}
	}else{
%>
<script>
alert("비밀번호가 다릅니다.");
history.back();

</script>

<%
	}
%>
