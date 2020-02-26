<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.*" %>


<%
	InsertBean insert1 = new InsertBean();

	insert1.setUserid(request.getParameter("userid"));
	
	//원래는 이런 방식으로 하는거지만

%>

<jsp:useBean id="insert" class="model.InsertBean">
	<jsp:setProperty name="insert" property="*"/>
</jsp:useBean>

<%-- jsp:useBean 을사용해서 이런 방식으로 한번에 받을수 도 있음 --%>
<%
	insert.setRegdate("2020-02-26");


%>


아이디 : <%=insert.getUserid() %> <br>
이름 : <%=insert.getName() %> <br>
이메일 : <%=insert.getEmail() %> <br>
등록날짜 : <%=insert.getRegdate() %> <br>
    
    