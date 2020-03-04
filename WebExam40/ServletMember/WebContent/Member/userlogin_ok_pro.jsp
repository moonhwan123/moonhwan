<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");
	String userid = (String)request.getAttribute("userid");

	
if(row==-1){
%>
<script>
	alert("존재하지 않는 아이디");
	history.back();
</script>
<%
	}else if(row == 0){
%>
<script>
	alert("비밀번호 불일치");
	history.back();
</script>
<%
	}

	//세션 형성
	session.setAttribute("userid", userid);
	session.setMaxInactiveInterval(60*30); // 30min
	
%>
<script>
	location.href="/ServletMember/userlogin_ok";
</script>