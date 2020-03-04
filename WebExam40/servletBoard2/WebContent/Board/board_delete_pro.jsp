<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    


<c:if test="${row==1 }">

<script>
	alert("삭제 되었습니다.");
	opener.location.replace("board_list");
	self.close();
</script>
</c:if>
<c:if test="${row==0 }">
<script>
	alert("비밀번호 오류");
	histroy.back();
</script>
</c:if>
