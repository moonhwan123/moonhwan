<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


<c:if test="${row==1}">
	<script>
		alert("등록되었습니다.");
		location.href="pds_list";
	</script>
</c:if>
<c:if test="${row==0}">
	<script>
		alert("등록에 실패했습니다.");
		history.back();
	</script>
</c:if>