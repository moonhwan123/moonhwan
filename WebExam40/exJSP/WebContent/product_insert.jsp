
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
	
	String query = "select * from groupcode order by gcode";
	
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
	.content{background-color:#E6E6E6; padding:16px; height:600px;overflow:hidden;} 
	.title{text-align:center;padding:22px;}
	.footer{padding:16px 0; text-align:center;background-color:#0040FF;}
	.content table{width:500px; margin:0 auto;}
	.content table th, td{border:1px solid #bbb;}
	.content table .btn_group{text-align:center;}	
</style>
<script>
	function send(){
		if(insert.code.value == ""){
			alert("제품코드를 입력 하세요");
			insert.code.focus();
			return false;
		}
		
		if(insert.pname.value == ""){
			alert("제품이름을 입력 하세요");
			insert.pname.focus();
			return false;
		}
		if(insert.cost.value == ""){
			alert("제품원가를 입력 하세요");
			insert.cost.focus();
			return false;
		}

		if(insert.pnum.value == ""){
			alert("목표수량을 입력 하세요");
			insert.pnum.focus();
			return false;
		}
		if(insert.jnum.value == ""){
			alert("재고수량을 입력 하세요");
			insert.jnum.focus();
			return false;
		}
		if(insert.sale.value == ""){
			alert("출고가를 입력 하세요");
			insert.sale.focus();
			return false;
		}
		if(insert.gcode.value == "0"){
			alert("그룹코드를 선택 하세요");
			insert.gcode.focus();
			return false;
		}
		
		insert.submit();
	}
	
	function del(){
		location.href = "Product/index.jsp";
	}

</script>
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


<div class="section">
		<section>
			<div class="content">
				<h2 class="title">제품 조회 화면</h2>
					<form name="insert" method="post" action="product_insert_pro.jsp">
						<table>
							<tr>
								<th>제품코드</th>
								<td><input type="text" name="code" ></td>
							</tr>
							
							<tr>
								<th>제품이름</th>
								<td><input type="text" name="pname"></td>
							</tr>

							<tr>
								<th>제품원가</th>
								<td><input type="text" name="cost"></td>
							</tr>
							
							<tr>
								<th>목표수량</th>
								<td><input type="text" name="pnum"></td>
							</tr>
							
							<tr>
								<th>재고수량</th>
								<td><input type="text" name="jnum"></td>
							</tr>
							
							<tr>
								<th>출고가</th>
								<td><input type="text" name="sale" ></td>
							</tr>
							
							<tr>
                				<th>&nbsp;그룹이름<font color=red>&nbsp;</font></th>
                				<TD >
                  					<select name="gcode" class="formbox">
 										<option value="0">선택하세요 ---
 										<%
 											while(rs.next()){
 										%>
 										<option value="<%= rs.getString("gcode") %>"><%= rs.getString("gname") %>
 										<%
 											
 											}
 										%>
									</select>
								</td>                
             				 </tr>
							
							
							<tr>
								<td colspan="2" class="btn_group">
									<input type="button" value="등록하기" onClick="send()">
									<input type="button" value="메인화면" onClick="del()">
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