<%@page import="model.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
	List<MemberVO> list = (List)request.getAttribute("list");
	
%>
<html>
<head>
<title>회원목록 보여주기</title>

<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>
</head>
<body>
<table width="550" border="1" cellspacing="0" cellpadding="2" bordercolorlight="#173E7C" bordercolordark="white">
  <tr>
    <td width=50 align=center>번호</td>
    <td width=50 align=center>ID</td>
    <td width=80 align=center>이름</td>
    <td width=100 align=center>전화번호</td>
    <td width=100 align=center>등록일자</td>
    <td width=100 align=center>최근접속일</td>
    
  </tr>
     <%
  		for(int x=0; x<list.size(); x++){
     %>
   <tr>
      <td align=center><%= list.get(x).getIdx() %></td>
      <td align=center><%= list.get(x).getUserid() %></td>
      <td align=center><%= list.get(x).getName() %></td>
      <td align=center><%= list.get(x).getTel() %></td>
      <td align=center><%= list.get(x).getFirst_time() %></td>
      <td align=center><%= list.get(x).getLast_time() %></td>
   </tr>
	<%
  		}
	%>

</table>
<table width=550>
  <tr>
    <td>
      <select name="search_gubun">
        <option >이름 </option>
        <option >주소 </option>
        
    </td>
    <td>  찾는이름:
          <input type="text" name="search_name" size=10> &nbsp;
          <input type=hidden name="user_id" >[조회]</a>
     </td>
   </tr>
  <tr>
    <td>
    </td>
    <td></td>
   </tr>
  <tr>
    <td>
    	<a href = "/ServletMember/userlogin_form">로그인 페이지 이동</a>
    </td>
    <td>
    	회원가입페이지 이동
    </td>
   </tr>
</table>    
</body>
</html>
