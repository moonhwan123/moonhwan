<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
int bun =Integer.parseInt(request.getParameter("bun"));
String name = request.getParameter("name");
String gender = request.getParameter("gender");
int kor = Integer.parseInt(request.getParameter("kor"));
int eng = Integer.parseInt(request.getParameter("eng"));
int mat = Integer.parseInt(request.getParameter("mat"));
String regdate = request.getParameter("regdate");

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;



try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
}catch(Exception e){
	e.printStackTrace();
}

String query = "insert into tbl_score_001 values(?,?,?,?,?,?,?)";

pstmt = conn.prepareStatement(query);

pstmt.setInt(1, bun);
pstmt.setString(2, name);
pstmt.setString(3, gender);
pstmt.setInt(4, kor);
pstmt.setInt(5, eng);
pstmt.setInt(6, mat);
pstmt.setString(7, regdate);
	
int row = pstmt.executeUpdate();

%>

<%
if(row == 0){
%>
<script>
alert("번호는 4자리 *정수* , 점수는 0~100 사이의 *정수* 만 입력해주세요");
history.back();
</script>
<%
}else{
%>

<script>
alert("학생 성적 정보가 등록 되었습니다.");
location.href="student_list.jsp";
</script>
<%
}
%>