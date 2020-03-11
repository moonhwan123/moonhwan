<%@page import="model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");
	String userid = (String)request.getAttribute("userid");
	UserVO vo = (UserVO)request.getAttribute("vo");
	
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
	}else{
%>
<script>
	alert("환영합니다.");
</script>
<%
	//세션 형성
	session.setAttribute("sessionVO", vo);
	session.setMaxInactiveInterval(60*30); // 30min
	}

	
%>
<script>
	location.href="user_list";
</script>