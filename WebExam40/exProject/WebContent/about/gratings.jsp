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
		<h2>인사말</h2>
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
					<a href="">인사말<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="../about/gratings.jsp">인사말</a>
						<a href="gratings.html">연혁 및 비젼</a>
						<a href="gratings.html">교직원소개</a>
						<a href="gratings.html">갤러리</a>
						<a href="gratings.html">찾아오시는길</a>
					</div>
				</li>
			</ul>
		  </div>
		</div><!-- container end -->
	</div>

	<div class="container">
		<div class="text_center">
				<p><span class="support_text">JSL인재개발원은</span><br/>
<strong>우리 사회의 앞선 기술력</strong>으로 능력을 발휘하고 <strong>비젼인</strong>들이 <br/><strong>전문 기술인</strong>으로 거듭나길 바랍니다.</p>
				<span class="col_bar"></span>
		</div>
		<div class="greeting_cont">
			<img src="../images/ceo.jpg" alt="ceo 이미지" style="float:left; padding:0px 40px;">
			<div class="text_wrap"><p>우리는 지금 지식 정보화 시대 그리고 무한 경쟁시대의 한가운데 서 있습니다.</p><p>역동적인 기술 혁신으로 인하여 직업 세계는 예측할 수 없을 정도로 빠르게 변화하고 있으며 국경 없는 경쟁으로 인하여 어느 분야에서나 세계적인 표준을 능가할 것을 요구받고 있습니다.</p><p>이러한 시대에 선도적인 임무를 수행하면서 삶을 영위하는 지혜는 끊임없이 직무능력의 개발과 현장 지향적인 실천능력의 함양에 있습니다. 이것이 곧 개인의 입장에서는 자아실현의 길이며 국가적 입장에서는 경쟁력 향상의 길입니다.</p><p>비젼직업전문학교는 이와 같은 시대적 소명에 부응하기 위하여 지식 정보화 시대에 필요한 능력 개발 전문가 양성을 위하여 정부와 협력하여 설립되었습니다.</p><p>21세기는 능력중심사회를 구현하기 위해 시대적 사명감으로 우리 사회의 앞선 기술력으로 능력을 발휘하고 전문 기술 교육인으로서 새 지평선을 열어갈 것입니다.</p><strong class="sign">JSL인재개발원 홍 길 동</strong></div>
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

</body>
</html>
<%@ include file = "../footer.jsp"%>