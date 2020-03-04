<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="model.*,java.util.*"%>
<%!
	String lineBreak(String str){
		StringBuffer buf = new StringBuffer();
		for(int x=0 ; x<str.length(); x++){
			if(str.charAt(x)=='\n'){
				buf.append("<br>");
			}else{
				buf.append(str.charAt(x));
			}
		}
		return new String(buf);
	}

%>
<%
	int idx = Integer.parseInt(request.getParameter("idx"));
	
	GuestDAO dao = GuestDAO.getInstance();
	
	//쿠키존재여부검사
	boolean bool = false;
	Cookie info = null;
	Cookie[] cookies = request.getCookies();
	
	for(int x = 0; x < cookies.length; x++){
		info = cookies[x];
		if(info.getName().equals("guest"+idx)){
			bool = true;
			break;
		}
	}
	
	String newValue=""+System.currentTimeMillis();
	
	if(!bool){ // 쿠키가 존재 하지않으면
		dao.guestReadcnt(idx);
		info = new Cookie("guest"+idx , newValue);
		info.setMaxAge(60*60); // 세션을 유지하는 시간(초) 
		response.addCookie(info);
	}
	
	GuestVO vo = dao.guestSelect(idx);

%>

 <html>
 <head><meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
   <title>방명록 내용 보기</title>
   <link rel="stylesheet" type="text/css" href="/stylesheet.css">
   <style type="text/css">
     td.title { padding:4px; background-color:#e3e9ff }
     td.content { padding:10px; line-height:1.6em; text-align:justify; }
     a.list { text-decoration:none;color:black;font-size:10pt; }
   </style>
 <script language="javascript">
 <!--
 function del_list() {
   var urlString;
    urlString = "guest_delete.jsp" ;
    window.open(urlString, "del_list"," resizable=no,x=150,y=150,width=300,height=170");
 }
 //-->
 </script>
 </head>
 <body topmargin="0" leftmargin="0">
   <table border="0" width="800">
     <tr>
       <td width="20%"  height="500" bgcolor="#ecf1ef" valign="top">

		 <!--  다음에 추가할 부분 -->

	   </td>
       <td width="80%" valign="top">&nbsp;<br>
         <table border="0" width="90%" align="center">
           <tr>
             <td colspan="2"><img src="./img/bullet-01.gif"> 
              <font color="blue" size="3">방 명 록</font><font size="2"> - 글읽기</font></td>
           </tr>
         </table>
       <p>
       <table border="0" width="90%" align="center" cellspacing="0"  style="border-width:1px;border-color:#0066cc;border-style:outset;">
         <tr bgcolor="e3e9ff">
           <td class="title">
             <img src="./img/bullet-04.gif"> <font size="2" face="돋움">
                  <%=vo.getSubject() %></font>
           </td>
         </tr>
         <tr>
           <td class="content">
             <p align="right"><font size="2" face="돋움">
              <%=vo.getName() %> / <font size="2" face="돋움"><%=vo.getRegdate() %> / <%=vo.getReadcnt() %>번 읽음</font>
             <p>
             <%=lineBreak(vo.getContents()) %><p>
           </td>
         </tr>
       </table>

      <!--**** 여기서부터 게시물 내용 아래쪽의 버튼들이 나옵니다. 답변, 수정, 삭제, 목록보기 ****-->
      <p align="center">
      <font size="2">
       <!-- 목록보기 -->
       <a href="guest_list.jsp"><img src="./img/list-2.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
       <a href="guest_modify.jsp?idx=<%= idx %>"><img src="./img/edit.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
       <a href="guest_delete.jsp?idx=<%= idx %>"><img src="./img/del.gif" border="0"></a>&nbsp;&nbsp;&nbsp;&nbsp;
      </font>
    </td>
  </tr>
  </table>
  </body>
  </html>
