<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>



<%
	request.setCharacterEncoding("utf-8");

	String[] fa = request.getParameterValues("fa");
	String str = "1";	
	if(fa != null){
		str = fa[0];
		for(int x=1; x<fa.length; x++){
			str = str + "/ " + fa[x];
		}
	
	}
%>

<jsp:useBean id="userinfo" class="model.userinfoBean">
	<jsp:setProperty name="userinfo" property="*"/>
</jsp:useBean>







회원성명 : <%=userinfo.getName() %> <br>
아이디 : <%=userinfo.getUserid() %> <br>
비밀번호 : <%=userinfo.getPasswd() %> <br>
구분 : <%=userinfo.getGubun() %> <br>
전화번호 : <%=userinfo.getTel() %> <br>
email : <%=userinfo.getEmail() %> <br>
관심분야 : <%= str %> <br>
직업 : <%=userinfo.getJob() %> <br>
자기소개 : <%=userinfo.getIntro() %> <br>
