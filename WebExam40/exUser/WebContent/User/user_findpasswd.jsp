<%@ page contentType="text/html; charset=UTF-8" %>
<%
	String sendBunho = (String)request.getAttribute("sendBunho");
	
%>
<HTML>
<HEAD>
<TITLE>사용자의 이메일 인증번호를 체크합니다.</TITLE>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<STYLE TYPE="text/css">
<!--
body { font-family: 돋움, Verdana; font-size: 9pt}
td   { font-family: 돋움, Verdana; font-size: 9pt; text-decoration: none; color: #000000} 
--->
</STYLE>
<script>
	function check(){
		if(input.userid.value == ""){
			alert("가입하신 아이디를 입력하세요");
			input.userid.focus();
			return false;
		}
		alert("가입되신 이메일로 비밀번호를 전송 합니다.");
		input.submit();
	}
	

</script>
</HEAD>
<BODY bgcolor="#FFFFFF">
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="./img/u_b02.gif"></td>
    <td align=center><FONT COLOR="#FFFFFF"><b>비밀번호 찾기</FONT></td>
    <td align=right><img src="./img/u_b03.gif"></td>
  </tr>
</table>
<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
<TR BGCOLOR=#948DCF>
  <TD>
  
    <TABLE CELLPADDING=4 CELLSPACING=1 BORDER=0 WIDTH=330>
  	  <TR BGCOLOR="#FFFFFF">
        <TD ALIGN="center">
    	<BR><FONT COLOR="#483cae"><b>회원 아이디를 입력해 주세요</b><br>
    	<b>가입 하신 이메일로 임시 비밀번호가 전송 됩니다.<br> </b></FONT><br>
    	<form name="input" method="post" action="user_findpasswd" onsubmit="return false">
           <INPUT NAME=userid type=text size=16 maxlength=16>
      	   <input type=image src="./img/u_bt08.gif" border=0 vspace=0 onClick="check()">
		</form>
        </TD>
      </TR>
    </TABLE>
 </TD>
</TR>
</TABLE>

<TABLE CELLPADDING=0 CELLSPACING=0 BORDER=0 WIDTH=330>
  <TR BGCOLOR=#7AAAD5>
    <td align=left><img src="./img/u_b04.gif"></td>
    <td align=right><img src="./img/u_b05.gif"></td>
  </tr>
  <tr>
    <td colspan=3 align=center>
    </td>
  </tr>
</table>
</BODY>
</HTML>