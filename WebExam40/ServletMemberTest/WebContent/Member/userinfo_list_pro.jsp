<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean flag = (boolean)request.getAttribute("flag");
	String userid = (String)request.getAttribute("userid");
	if(flag){
%>
<script>
	alert("등록에 성공 하셨습니다.");
	location.href="emailSendAction.jsp";
</script>
<%
	}else{
%>
<script>
	alert("등록에 실패 하셨습니다.");
	histroy.back();
</script>
<%
	}
%>
