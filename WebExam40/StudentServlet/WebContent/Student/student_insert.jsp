<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{margin:0; padding:0;}
	ul,li {list-style:none;}
	a {text-decoration:none;}
	.logo {color:#fff; text-align:center;background-color:#0040FF;
	      padding:16px 0;}

	.navi{padding:12px 0; overflow:hidden;background-color:#BCA9F5;}
	
	.navi ul,li{float:left; padding:0 20px; text-align:center;}
	.content{background-color:#E6E6E6; padding:16px; height:600px;overflow:hidden;} 
	.title{text-align:center;padding:22px;}
	.footer{padding:16px 0; text-align:center;background-color:#0040FF;}
	.content table{width:500px; margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group{text-align:center;}	
</style>
<script>
	function send(){
		if(insert.name.value == ""){
			alert("이름을 입력 하세요");
			insert.name.focus();
			return false;
		}
		if(insert.bun.value == ""){
			alert("번호를 입력 하세요");
			insert.bun.focus();
			return false;
		}
		if(insert.gender.value == ""){
			alert("성별을 선택 하세요");
			return false;
		}
		if(insert.kor.value == ""){
			alert("국어 점수를 입력 하세요");
			return false;
		}
		if(insert.eng.value == ""){
			alert("영어 점수를 입력 하세요");
			return false;
		}
		if(insert.mat.value == ""){
			alert("영어 점수를 입력 하세요");
			return false;
		}
		if(insert.bun.value < 1000 || insert.bun.value > 9999){
			alert("번호는 4자리 정수만 입력 가능 합니다.");
			return false;
		}
		if(insert.kor.value < 0 || insert.kor.value > 100){
			alert("국어점수 입력 범위 초과");
			return false;
		}
		if(insert.eng.value < 0 || insert.eng.value > 100){
			alert("영어점수 입력 범위 초과");
			return false;
		}
		if(insert.mat.value < 0 || insert.mat.value > 100){
			alert("수학점수 입력 범위 초과");
			return false;
		}
		
		var res = /^[0-9]+$/; 

		if (!res.test(insert.bun.value)) {

			alert("숫자만 입력해 주십시오.");
			return false;
		}
		
		insert.submit();
	}
	
	function del(){
		
	}

</script>
</head>
<body>

<div>
	<header class = "header">
		<h1 class = "logo">(과정평가형 정보처리산업기사) 학생성적 관리 프로그램 ver2009-06</h1>
		<nav>
			<ul class = "navi">
				<li><a href = "student_insert">학생 성적 등록</a></li>
				<li><a href = "student_list">학생 성적 조회</a></li>
				<li><a href = "Student/index.jsp">홈으로</a></li>
			</ul>
		</nav>
	</header>
</div>
<div class="section">
		<section>
			<div class="content">
				<h2 class="title">학생성적 관리 프로그램</h2>
					<form name="insert" method="post" action="student_insert">
						<table>
							<tr>
								<th>번호</th>
								<td><input type="text" name="bun" > 정수 4자리(1001)</td>
							</tr>
							<tr>
								<th>이름</th>
								<td><input type="text" name="name"></td>
							</tr>

							<tr>
								<th>성별</th>
								<td><input type="radio" name="gender" value="m" /> 남자
								<input type="radio" name="gender" value="f" /> 여자 
								</td>
							</tr>
							<tr>
								<th>국어</th>
								<td><input type="text" name="kor">(0~100)
								</td>
							</tr>
							<tr>
								<th>영어</th>
								<td><input type="text" name="eng">(0~100)
								</td>
							</tr>
							<tr>
								<th>수학</th>
								<td><input type="text" name="mat">(0~100)
								</td>
							</tr>
							<tr>
								<th>등록일자</th>
								<td><input type="text" name="regdate" value = ${regdate }> 
								</td>
							</tr>
							<tr>
								<td colspan="2" class="btn_group">
									<input type="button" value="등록하기" onClick="send()">
									<input type="button" value="취소하기" onClick="del()">
								</td>
							</tr>
						</table>
					</form>
			</div>
		</section>
	</div>



<div>
	<footer class = "footer">
		<p>HRDKOREA Copyright@2019 All rights reserve. Human Resources 
			Development Serivce of Korea</p>
	</footer>
</div>



</body>
</html>