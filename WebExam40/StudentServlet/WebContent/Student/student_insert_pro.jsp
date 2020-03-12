<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:if test="${row == 0 }">
<script>
alert("번호는 4자리 *정수* , 점수는 0~100 사이의 *정수* 만 입력해주세요");
history.back();
</script>

</c:if>
<c:if test="${row == 1 }">
<script>
alert("학생 성적 정보가 등록 되었습니다.");
location.href="student_list";
</script>

</c:if>