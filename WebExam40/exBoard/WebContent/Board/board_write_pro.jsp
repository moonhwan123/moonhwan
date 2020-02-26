<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.* , java.util.*"%>
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String subject = request.getParameter("subject");
	String contents = request.getParameter("contents");
	String pass = request.getParameter("pass");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jsl40", "1234");
	} catch (Exception e) {
		e.printStackTrace();
	}

	String query = "insert into tbl_board(idx,name,email,subject,contents,pass) "
			+ "values(tbl_guest_seq_idx.nextval,?,?,?,?,?) ";
	pstmt = conn.prepareStatement(query);
	pstmt.setString(1, name);
	pstmt.setString(2, email);
	pstmt.setString(3, subject);
	pstmt.setString(4, contents);
	pstmt.setString(5, pass);
	int row = pstmt.executeUpdate();
	if (row == 1) {
%>
<script>
	alert("등록완료");
	location.href = "board_list.jsp";
</script>
<%
	} else {
%>
<script>
	alert("등록실패");
	history.back();
</script>
<%
	}
%>