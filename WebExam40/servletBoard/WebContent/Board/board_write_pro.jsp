<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	int row = (int) request.getAttribute("row");

	if (row != 0) {
%>
<script>
	alert("등록 성공");
	location.href = "board_list";
</script>
<%
	} else {
%>
<script>
	alert(" ");
	history.back();
</script>

<%
	}
%>