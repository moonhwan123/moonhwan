
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
	
	insert.submit();
}

function update(){
	
	insert.action = "product_list_pro.jsp";
	insert.submit();
}
function sakuje(){
	
	insert.action = "product_delete.jsp";
	insert.submit();
}


function main(){
	location.href = "index.jsp";
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
				<h2 class="title">제품 조회 화면 - 제품코드를 입력해 주세요</h2>
					<form name="insert" method="post" action="product_search_pro.jsp">
						<table>
							<tr>
								<th>제품코드</th>
								<td><input type="text" name="code" ></td>
							</tr>
							
							<tr>
								<th>제품이름</th>
								<td><input type="text" name="pname" readonly></td>
							</tr>

							<tr>
								<th>제품원가</th>
								<td><input type="text" name="cost" readonly></td>
							</tr>
							
							<tr>
								<th>목표수량</th>
								<td><input type="text" name="pnum" readonly></td>
							</tr>
							
							<tr>
								<th>재고수량</th>
								<td><input type="text" name="jnum" readonly></td>
							</tr>
							
							<tr>
								<th>출고가</th>
								<td><input type="text" name="sale" readonly></td>
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
									<input type="button" value="조회하기" onClick="send()">
									<input type="button" value="수정하기" onClick="update()">
									<input type="button" value="삭제하기" onClick="sakuje()">
									<input type="button" value="메인화면" onClick="main()">
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