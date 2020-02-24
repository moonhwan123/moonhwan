<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	request.setCharacterEncoding("utf-8");
    
   		String name = null;
   		if(request.getParameter("name") != null){
   			name = request.getParameter("name");
   		}
   		
   		String userid = null;
   		if(request.getParameter("userid") != null){
   			userid = request.getParameter("userid");
   		}
   		
   		String passwd = request.getParameter("passwd");
   		String gubun = request.getParameter("gubun");
   		String tel = request.getParameter("tel");
   		String email = request.getParameter("email");
   		String[] fa = request.getParameterValues("fa");
   		String str = null;	// fa[]에 데이터가 없을 경우를 대비
   		if(fa != null){
   			str = fa[0];
   			for(int x=1; x<fa.length; x++){
   				str = str + "/ " + fa[x];
   			}
   		}
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

	<a href = "userinfo_modify.jsp">정보 수정</a>
	
</body>
</html>