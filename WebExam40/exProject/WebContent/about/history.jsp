<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<h2>연혁 및 비젼</h2>
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
					<a href="">연혁 및 비젼<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="gratings.html">인사말</a>
						<a href="history.html">연혁 및 비젼</a>
						<a href="gratings.html">교직원소개</a>
						<a href="./gallery/photo.html">대우갤러리</a>
					</div>
				</li>
			</ul>
		  </div>
		</div><!-- container end -->
	</div>

	<div class="container">
		<div class="history_wrap">
			<h3 class="title3">학교연혁</h3>
			<ul class="history_list">
				<li>
					<strong class="years">
						<span>2018</span>
						<span>년</span>
					</strong>
					<ul>
						<li>
							<strong class="year">06월</strong>
							<ul>
								<li>
									<span>06.10</span>
									<ul>
										<li>국가기간 전략산업 승인</li>
									</ul>
								</li>
							</ul>
						</li>
						<li>
							<strong class="year">05월</strong>
							<ul>
								<li>
									<span>05.22</span>
									<ul>
										<li>스마트기반응용SW개발학과 졸업</li>
										<li>빅데이터기반응용SW개발학과 졸업</li>
									</ul>
								</li>
							</ul>
						</li>
					</ul>
				</li>
				<li>
					<strong class="years">
						<span>2017</span>
						<span>년</span>
					</strong>
					<ul>
						<li>
							<strong class="year">03월</strong>
							<ul>
								<li>
									<span>03.10</span>
									<ul>
										<li>국가기간 전략산업 승인</li>
									</ul>
								</li>
							</ul>
						</li>
						<li>
							<strong class="year">01월</strong>
							<ul>
								<li>
									<span>01.22</span>
									<ul>
										<li>스마트기반응용SW개발학과 졸업</li>
										<li>빅데이터기반응용SW개발학과 졸업</li>
									</ul>
								</li>
							</ul>
						</li>
					</ul>
				</li>
			</ul>
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
		});
	</script>
	

	<?php
		include "footer.html";
	?>

</body>
</html>
<%@ include file = "../footer.jsp"%>