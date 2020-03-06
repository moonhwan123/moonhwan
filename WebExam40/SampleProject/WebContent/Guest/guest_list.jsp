<%@page import="model.guest.GuestVO"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	List<GuestVO> list = (List<GuestVO>)request.getAttribute("list");
%>

<html>
<head><title>방명록 읽기</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<style type="text/css">
  a.list {text-decoration:none;color:black;font-size:10pt;}
</style>
</head>
<center>
<body bgcolor="#FFFFFF" topmargin="0" leftmargin="0">
<%@ include file = "/include/topmenu.jsp"%>
<table border="0" width="800">
  <tr>
    <td width="20%" height="500" valign="top" bgcolor="#ecf1ef">
	<%@ include file = "/include/login_form.jsp"%></td>
    <td width="80%" valign="top">	
    <br>
    <table border="0" cellspacing="1" width="100%" align="center">
      <tr>
        <td colspan="7" align="center" valign="center" height="20">
        <font size="4" face="돋움" color="blue">
        <img src="./img/bullet-01.gif"> <b>방 명 록</b></font></td></tr>
      <tr>
        <td colspan="5" align="right" valign="middle" height="20">
		<font size="2" face="고딕">전체 : <%= list.size() %></b>건 - 3 Pages</font></td></tr>
 	   <tr bgcolor="e3e9ff">
 	      <td width="10%"align="center" height="20"><font face="돋움" size="2">번호</font></td>
 	      <td width="50%" align="center" height="20"><font face="돋움" size="2">제목</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">글쓴이</font></td>
 	      <td width="15%" align="center" height="20"><font face="돋움" size="2">작성일</font></td>
 	      <td width="10%" align="center" height="20"><font face="돋움" size="2">조회수</font></td>
 	   </tr>

	<c:forEach var="vo" items="${list}">
	<tr onMouseOver="style.backgroundColor='#D1EEEE'" onMouseOut="style.backgroundColor=''">
        <td align="center" height="25">
        <font face="돋움" size="2" color="#000000">${listcount}</font></td>
        <td align="left" height="20">
        <font face="돋움" size="2" color="#000000">
		      <a href="guest_view?idx=${vo.idx}&page=${page}">${vo.subject}</a></td>
        <td align="center" height="20"><font face="돋움" size="2">
        <a class="list" href="">${vo.name}</a></font></td>
        <td align="center" height="20"><font face="돋움" size="2">${vo.regdate.substring(2,10)}</font></td>
        <td align="center" height="20"><font face="돋움" size="2">${vo.readcnt}</font></td>
     </tr>
     <c:set var="listcount" value="${listcount-1}" />
	</c:forEach>

     <div align="center">
        <table width="700" border="0" cellspacing="0" cellpadding="5">
          <tr>&nbsp;</tr><tr>
             <td colspan="5">        
                <div align="center">${pageSkip }</div>
			  </td>
			 </tr>
			<tr align=right><td colspan="5">
				<a href="guest_write"><img src="./img/write.gif" border="0"></a>
			</td>
			</tr>
		</table>
		</div>
		</center>
	</body>
	
	</html>

