<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");

	if(row==1){
%>	
<script>
alert("메일을 전송 하였습니다.");
self.close();
</script>


<%
	}else{
%>


<script>
alert("메일을 전송 하지 못하였습니다.");
history.back();
</script>

<%
	}
%>