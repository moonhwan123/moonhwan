<%@ page contentType="text/html; charset=UTF-8" import = "java.util.*, model.member.*"%>

<%
	MemberVO sessionvo = null;
	if(session.getAttribute("vo") != null){
		sessionvo = (MemberVO)session.getAttribute("vo");
	}
%>

<html>
<head>
<title>Login</title>
<script>
	function check_login(){
		if(member2.userid.value==""){
			alert("아이디를 입력하세요");
			member.userid.focus();
			return false;
		}
		if(member2.passwd.value==""){
			alert("비밀번호를 입력하세요");
			member2.passwd.focus();
			return false;
		}
		
		return true;
		
	}


</script>
</head>
<body>
<%
	if(sessionvo == null){
%>
<table width="100%" height="120" border="0">
<form name="member2" method="post" action="userlogin_ok">

     <tr>
       <td colspan="2" bgcolor="#6FA0E" height="20" align="center">
         <font size="2" color="white"><b>Member Login</b></font>
       </td>
     </tr>
     <tr>
       <td ><font size="2">아 이 디</font></td>
       <td ><input type="text" size="10" name="userid"></td>
     </tr>
     <tr>
       <td><font size="2">비밀번호</font></td>
			 <td>
         <input type="password" size="10" name="passwd">
       </td>
     </tr>

     <tr>
       <td><input type="image" src="./img/login1.gif" border="0" onSumbit="return check_login()"></td>
			 <td><a href="userinfo_insert2"><img src="./img/regist.gif" border="0"></a></td>


     </tr>
 </form>

 </table>
<%
	}else{
%>
 <table width="100%" height="120" border="0">
   <tr>
     <td bgcolor="#6FA0E" align="center" height="20">
       <font size="2" color="white"><%= sessionvo.getName() %> 님!</font>
     </td>
   </tr>
   <tr>
     <td align="center">
       <font size="2">
       <a href="adminpage.jsp">관리자 페이지</a><br>
       <a href="logout">로그오프</a><br>
       <a href="userinfo_modify">회원정보수정</a><br>
       </font>
     </td>
   </tr>
 </table>
 <table width="100%" height="120" border="0">
   <tr>
     <td bgcolor="#6FA0E" align="center" height="20">
       <font size="2" color="white"><%= sessionvo.getName() %> 님!</font>
     </td>
   </tr>
   <tr>
     <td align="center">
       <font size="2">
       <a href="logout">로그오프</a><br>
       <a href="userinfo_modify">회원정보수정</a>
       <a href="userinfo_delete">회원탈퇴</a>

       </font>
     </td>
   </tr>
 </table>
 	<%
	}
	%>
 </body>
 </html>
