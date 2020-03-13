<%@page import="model.ProductVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<ProductVO> list = (List<ProductVO>)request.getAttribute("list");

%>
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
		<h1 class = "logo">생산관리 시스템</h1>
		<nav>
			<ul class = "navi">
				<li><a href = "product_insert">제품입력</a></li>
				<li><a href = "product_list">제품조회</a></li>
				<li><a href = "product_produce_list">우선생산제품</a></li>
				<li><a href = "product_profit_list">이익순위</a></li>
				<li><a href = "product_stock_list">그룹별재고수량</a></li>
			</ul>
		</nav>
	</header>
</div>

<div class = "section">
	<section>
		<div class = "content">	
			<h2 class = title>기대이익조회 화면</h2>
				<table>
							<tr>
								<th>제품이름</th>
								<th>총 이익 금액</th>
							</tr>
							<%
							for(int x=0; x<list.size(); x++){
							%>
							<tr>
								<td class="text_center"><%=list.get(x).getPname()  %></td>
								<td class="text_center"><%=list.get(x).getTemp()  %></td>
							</tr>
							<%
							}
							%>
				
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