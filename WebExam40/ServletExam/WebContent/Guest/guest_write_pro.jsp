<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int row = (int)request.getAttribute("row");
	if(row==1){
%>

	<script>
		alert("등록 성공");
		location.href="guest.do"
	</script>

<%
	}else{

%>

	<script>
		alert("등록 실패");
		history.back();
	</script>
	
<%
	}
%>
