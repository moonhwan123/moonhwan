<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	.content{background-color:#E6E6E6; padding:16px; height:300px;} 
	.title{text-align:center;padding:22px;}
	.footer{padding:16px 0; text-align:center;background-color:#0040FF;}
	.content table{width:500px; margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group{text-align:center;}	
	.text_center{text-align:center;}
</style>
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

<div class = "section">
	<section>
		<div class = "content">	
			<h2 class = title>학생성적조회 화면</h2>
				<table>
							<tr>
								<th>번호</th>
								<th>이름</th>
								<th>성별</th>
								<th>국어</th>
								<th>영어</th>
								<th>수학</th>
								<th>총점</th>
								<th>평균</th>
								<th>등급</th>
							</tr>
							<c:forEach var="vo" items="${list}">
								<tr>
									<td class="text_center">${vo.bun }</td>
									<td class="text_center">${vo.name }</td>
									<c:if test="${vo.gender == 'm'}">
										<td class="text_center">남자</td>
									</c:if>
									<c:if test="${vo.gender == 'f'}">
										<td class="text_center">여자</td>
									</c:if>
									<td class="text_center">${vo.kor }</td>
									<td class="text_center">${vo.eng }</td>
									<td class="text_center">${vo.mat }</td>
									<td class="text_center">${vo.tot }</td>
									<td class="text_center">${vo.ave }</td>
									<td class="text_center">${vo.grade }</td>
									
								</tr>
							</c:forEach>
				
				
				</table>
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