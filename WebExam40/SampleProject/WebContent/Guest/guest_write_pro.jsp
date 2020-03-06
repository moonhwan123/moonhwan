<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int row = (int)request.getAttribute("row");

if(row != 0){
%>
<script>
alert("방명록을 작성 하였습니다.");
location.href="guest_list";
</script>

<%
}else{
%>

<script>
alert("방명록을 작성 하지 못하였습니다.");
history.back();
</script>

<%
}
%>