<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int row = (int)request.getAttribute("row");
%>

<%
if(row == 0){

%>
<script>
alert("갱신 실패");
history.back();
</script>

<%
}else{
%>

<script>
alert("제품정보가 수정 되었습니다.");
location.href="Product/index.jsp";
</script>
<%
}

%>