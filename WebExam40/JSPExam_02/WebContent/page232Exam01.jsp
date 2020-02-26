<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function send(){
		engine.submit();
	}
	

</script>
</head>
<body>
	<form name="engine" method="post" action="exam01_send.jsp"> 
	<h3>검색 엔진 정보 페이지</h3><br>
	검색 엔을 선택 하세요.<br>
	<select name="choice">
		<option value="naver">네이버</option>
		<option value="daum">다음</option>
		<option value="google">구글</option>
	</select>
	<a href="javascript:send()"><input type="button" value="확인"></a>
	
	</form>
	



</body>
</html>