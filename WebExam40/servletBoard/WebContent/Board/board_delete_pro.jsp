<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	int row = (int)(request.getAttribute("row"));

	if(row == 1){

%>
<script>
	alert("삭제 되었습니다.");
	opener.location.replace("board_list");
	self.close();
</script>
<%
	}else{
%>
<script>
	alert("비밀번호 오류");
	histroy.back();
</script>

<%
	}
%>