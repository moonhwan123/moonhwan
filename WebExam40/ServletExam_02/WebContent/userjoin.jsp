<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	function send(){
		if(insert.name.value == ""){
			alert("이름을 입력 하세요");
			insert.name.focus();
			return;
		}
		for(x=0; x<insert.name.value.length; x++){
			if(insert.name.value.charAt(x)==" "){
				alert("공백no");
				return;
			}
		}
		if(insert.id.value == ""){
			alert("아이디를 입력 하세요");
			insert.id.focus();
			return;
		}
		
		
		alert("회원 정보를 등록합니다.");
		insert.action = "InsertServlet";
		insert.submit();
	}
	
	function del(){
		alert("회원 정보 등록을 취소합니다.");
		insert.reset();
		insert.name.focus();
	}

</script>


</head>
<body>
<form name="insert" method="post" action = "InsertServlet">
	<table border="1" width = "800">
		<tr>
			<td width="250" align = "center">이름</td>
			<td><input type="text" name="name" size="30"></td>
		</tr>
		<tr>
			<td width="250" align = "center">주민등록번호</td>
			<td>
				<input type="text" name="jumin1" size="15">-
				<input type="password" name="jumin2" size="15">
			</td>
			
		</tr>
		<tr>
			<td width="250" align = "center">아이디</td>
			<td><input type="text" name="id" size="30"></td>
		</tr>
		<tr>
			<td width="250" align = "center">비밀번호</td>
			<td><input type="password" name="pwd" size="30"></td>
		</tr>
		<tr>
			<td width="250" align = "center">비밀번호 확인</td>
			<td><input type="password" name="repwd" size="30"></td>
		</tr>
		<tr>
			<td width="250" align = "center">이메일</td>
			<td>
				<input type="text" name="email1" size="15">@
				<input type="text" name="email2" size="20">
				<select name = "email_select">
					<option value = "">선택하세요
					<option value = "naver.com">naver.com
					<option value = "hanmail.net">hanmail.net
					<option value = "gmail.com">gmail.com
					<option value = "직접입력">직접입력
					
				</select>
			</td>
			
		</tr>
		
		<tr>
			<td width="250" align = "center">우편번호</td>
			<td><input type="text" name="post" size="30"></td>
		</tr>
		<tr>
			<td width="250" align = "center">주소</td>
			<td>
				<input type="text" name="addr1" size="30"><br>
				<input type="text" name="addr2" size="30">
			</td>
			
		</tr>
		<tr>
			<td width="250" align = "center">핸드폰 번호</td>
			<td><input type="text" name="phone" size="30"></td>
		</tr>
				<tr>
			<td width="250" align = "center">직업</td>
			<td>
				<select name="job" class="formbox">
					<option value = "">선택하세요
					<option value = "학생">학생
					<option value = "정보통신">정보통신
					<option value = "공무원">공무원
					<option value = "교육">교육
					<option value = "서비스">서비스
				</select>
				<br>
			</td>
		</tr>
		<tr>
			<td width="250" align = "center">메일/SMS정보수신</td>
			<td>
				<input type="radio" name="susin" checked>수신&nbsp;&nbsp;
				<input type="radio" name="susin">수신거부
			</td>
		</tr>
		<tr>
			<td width="250" align = "center">관심분야</td>
			<td>
				<input type="checkbox" name="interest" value="생두">생두&nbsp;&nbsp;
				<input type="checkbox" name="interest" value="원두">원두&nbsp;&nbsp;
				<input type="checkbox" name="interest" value="로스팅">로스팅&nbsp;&nbsp;
				<input type="checkbox" name="interest" value="핸드드립">핸드드립&nbsp;&nbsp;
				<input type="checkbox" name="interest" value="에스프레소">에스프레소&nbsp;&nbsp;
				<input type="checkbox" name="interest" value="창업">창업&nbsp;&nbsp;
			</td>
		</tr>
		<tr>
			<td colspan = 3 align = "center">
			<a href = "javascript:send()"><input type="button" value="전송"></a>&nbsp;&nbsp;
			<a href = "javascript:del()"><input type="button" value="취소"></a>
			</td>
		</tr>	
	
	
	</table>
	</form>

</body>
</html>