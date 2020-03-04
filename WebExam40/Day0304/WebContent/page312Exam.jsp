<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>p.312</title>
</head>
<body>

\${5+2 } : ${5+2 } <br>
\${5/2 } : ${5/2 } <br>
\${5 mod 2 } : ${5 mod 2 } <br>
\${5>2 } : ${5>2 } <br>
\${5 gt 2 } : ${5 gt 2 } <br>
\${2 gt 10 } : ${2 gt 10 } <br>
\${(5>2)?5:2 } : ${(5>2)?5:2 } <br>
\${empty input } : ${empty input } <br>
<c: if test=${empty input }>
텅빈 객체 입니다.
</c: if>

</body>
</html>