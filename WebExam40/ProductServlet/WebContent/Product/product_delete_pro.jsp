<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");
%>

<%
if(row == 0){

%>
<script>
alert("삭제 실패");
history.back();
</script>

<%
}else{
%>

<script>
alert("제품정보가 삭제 되었습니다.");
location.href="Product/index.jsp";
</script>
<%
}

%>