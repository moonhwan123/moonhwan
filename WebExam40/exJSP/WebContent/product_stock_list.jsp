<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
}catch(Exception e){
	e.printStackTrace();
}
String query = "select g.gname,sum(p.jnum) as stock from product p , groupcode g "
		+ "where p.gcode = g.gcode group by g.gname order by g.gname desc";

pstmt = conn.prepareStatement(query);
rs = pstmt.executeQuery();

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
				<li><a href = "product_insert.jsp">제품입력</a></li>
				<li><a href = "product_tot_list.jsp">제품 전체 목록</a></li>
				<li><a href = "product_search.jsp">제품조회</a></li>
				<li><a href = "product_stock_list.jsp">그룹별재고수량</a></li>
				<li><a href = "index.jsp">홈으로</a></li>
			</ul>
		</nav>
	</header>
</div>

<div class = "section">
	<section>
		<div class = "content">	
			<h2 class = title>그룹별 재고 조회 화면</h2>
				<table>
							<tr>
								<th>그룹이름</th>
								<th>재고수량</th>
							</tr>
							<%
							while(rs.next()){
							%>
							<tr>
								<td class="text_center"><%=rs.getString("gname")%></td>
								<td class="text_center"><%=rs.getString("stock")%></td>
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