<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%
	int number = (Integer)request.getAttribute("num");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		alert("로그인  : [" + <%=number %> + "] 회 실패");
		if(<%=number %> == 3) {
			location.href="LoginMaxCount";
		} else {
			location.href="LoginMain"
		}
	</script>
</body>
</html>