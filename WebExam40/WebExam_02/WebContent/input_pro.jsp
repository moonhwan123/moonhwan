<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String repasswd  = request.getParameter("repasswd");
	String gubun = request.getParameter("gubun");
	String zip = request.getParameter("zip");
	String addr1 = request.getParameter("addr1");
	String addr2 = request.getParameter("addr2");
	String tel = request.getParameter("tel");
	String email = request.getParameter("email");
	String fa[] = request.getParameterValues("fa");
	String job = request.getParameter("job");
	String intro = request.getParameter("intro");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 이름 : <%= name %> <br>
	 아이디 : <%= userid %> <br>
	 전화 : <%= tel %> <br>
	 비밀번호 : <% for(int x = 0; x < passwd.length(); x++){
		 out.print("*");
	 } %> <br>
	 구분 : <%= gubun %> <br>
	 전화번호 : <%= tel %> <br> 
	 이메일 : <%= email %> <br>
	 관심분야 : <% 
		 for(int x = 0; x < fa.length; x++)  {
			 out.print(fa[x]+", ");
		 }
	 %> <br>
	 직업 : <%= job %> <br>
	 자기소개 : <%= intro %> <br>
	
</body>
</html>