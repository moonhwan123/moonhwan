<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.* , java.util.*" %>
<%
		int idx = Integer.parseInt(request.getParameter("idx"));
		String subject= request.getParameter("subject");
		String email = request.getParameter("email");
		String contents = request.getParameter("contents");
		String pass = request.getParameter("pass");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String query = "update tbl_board set email=? ,subject=? , contents=? where idx=?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(2, subject);
		pstmt.setString(1, email);
		pstmt.setString(3, contents);
		pstmt.setInt(4, idx);
		
		
		int row = pstmt.executeUpdate();
		if(row==1){
		
		
%>
	<script>
		alert("수정완료");
		location.href="board_list.jsp";
	</script>
<%
		}else{
%>	
	<script>
		alert("수정실패");
		history.back();
	</script>
<%	
}

%>