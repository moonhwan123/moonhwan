<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="JSL">
  <meta name="Keywords" content="반응형홈페이지,  JAVA, JSP, PHP, 대전직업전문학교, 대전국비지원, 국비무료">
  <meta name="Description" content="응용SW개발자를 위한 반응형 홈페이지">
  <title>JSL인재개발원</title>
  <link href="../css/font-awesome.min.css" rel="stylesheet">
  <link href="../css/common.css" rel="stylesheet">
  <link href="../css/layout.css" rel='stylesheet'>
  <!--
  	jquery언어 사용법
	1. jquey.js을 기반으로 프로그램을 작성하기 때문에 jquery.js 파일을 다운 또는 CDN 방식으로 링크를 건다
	2. $(function() {
		실행문;
	});
  -->
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
  <script src="../js/jquery-3.3.1.min.js"></script>
</head>
<body>
<%@ include file = "../header.jsp"%>
<!-- sub contents -->
	<div class="sub_title">
		<h2>갤러리</h2>
		<div class="container">
		  <div class="location">
			<ul>
				<li class="btn_home">
					<a href="index.html"><i class="fa fa-home btn_plus"></i></a>
				</li>
				<li class="dropdown">
					<a href="">기업소개<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="../about/gratings.jsp">기업소개</a>
						<a href="../portfolio/portfolio.jsp">포트폴리오</a>
						<a href="../notice/notice.jsp">커뮤니티</a>
					</div>
				</li>
				<li class="dropdown">
					<a href="">갤러리<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="../photo_list">갤러리</a>
					</div>
				</li>
			</ul>
		  </div>
		</div><!-- container end -->
	</div>

	<div class="container">
	  <div class="search_wrap">
		<div class="record_group">
			<p>총게시글<span>${totcount }</span>건</p>
		</div>
		<div class="search_group">
			<form name="myform" action="photo_list">
				<select name="search" class="select">
					<option value="subject" <c:if test="${search == 'subject'}">selected </c:if>>제목</option>
					<option value="contents" <c:if test="${search == 'contents'}">selected </c:if>>내용</option>
				</select>
				<input type="text" name="key" class="search_word" value="${key}">
				<button class="btn_search"><i class="fa fa-search"></i><span class="sr-only">검색버튼</span></button>
			</form>
		</div>
	  </div> <!-- search end -->
	  
	  <div class="bord_list">
	  <c:forEach var="vo" items="${list }">
	  
	    <div class="gallery_wrap">
			<ul>
			
				<li>
					<a href=""><img src="upload/${vo.filename}" alt=""></a>
					<span class="title">${vo.subject }</span><div class="gallery_count"><span class="count"><i class="fa fa-eye"></i></span><span>&nbsp;${vo.readcnt }</span></div>
				</li>
			
			</ul>
		  </div>
		
		<!-- modal process -->

		<div class="modal">
			
			<div class="modal_background">
			</div>
			<div class="modal_content">
				<a href=""><i class="fa fa-close"></i></a>
				<div class="modal_body">
					<img src="upload/${vo.filename}" alt="">
				</div>
			</div>
		</div>
		</c:forEach>
		<div class="paging">
			${pageSkip}
			<a href="photo_write" class="btn_write">글쓰기</a>
		</div>
	  </div>
	</div>
	<!-- end contents -->
	
	<script>
		$(function() {
			$(".location  .dropdown > a").on("click",function(e) {
				e.preventDefault();
				if($(this).next().is(":visible")) {
					$(".location  .dropdown > a").next().hide();
				} else {
					$(".location  .dropdown > a").next().hide();
					$(this).next().show();
				}
			});

		$(".gallery_wrap > ul > li > a").on("click",function(e) {
			e.preventDefault();
			$(".modal").fadeIn(1000);
			

			});
		$(".modal .modal_content > a").on("click", function(e) {
			e.preventDefault();
			$(".modal").fadeOut(1000);
		});

		});
	</script>

</body>
</html>
<%@ include file = "../footer.jsp"%>

