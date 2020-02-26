<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.* , java.util.*" %>
<%
		int idx = Integer.parseInt(request.getParameter("idx"));

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jsl40","1234");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		String query = "delete from tbl_guest where idx=?";
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, idx);
		
		int row = pstmt.executeUpdate();
		if(row==1){
%>
	<script>
		alert("삭제완료");
		location.href="guest_list.jsp";
	</script>
<%
		}else{
%>	
	<script>
		alert("삭제실패");
		history.back();
	</script>
<%	
}
%>
