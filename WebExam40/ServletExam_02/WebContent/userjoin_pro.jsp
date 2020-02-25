<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${name }<br>
	주민번호 : ${jumin1} - ${jumin2}<br>
	비밀번호 : ${pwd }<br>
	이메일 : ${email1 }@${email2 }<br>
	우편번호 : ${post }<br>
	주소 : ${addr1 }/${addr2 }<br>
	휴대폰 번호 : ${phone }<br>
	직업 : ${job }<br>
	관심분야 : ${inter }<br>
	<br>
	<a href ='javascript:history.go(-1)'>다시</a>
</body>
</html>