<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.jy.board.db.BoardVO" %>

<%
	List<BoardVO> list = (List<BoardVO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background-image: url('https://img.rawpixel.com/s3fs-private/rawpixel_images/website_content/v627-aew-41-technologybackground_1.jpg?bg=transparent&con=3&cs=srgb&dpr=1&fm=jpg&ixlib=php-3.1.0&q=80&usm=15&vib=3&w=1300&s=fb682f14bc6556bc6fbc357899b6e16f');
		background-repeat : no-repeat;
		background-size : cover;
	}
	.container { width:500px; margin: 0 atuo; }
    table { width: 800px; border: 1px solid black; border-collapse: collapse;}
    td { border: 1px solid black; text-align:center;}
    tr { height: 60px;}
    #f { text-align: center; color: red;}
    .itemRow:hover {
    	background-color:grey;
       	cursor: pointer;
    } 
    button { margin-top:15px;}
    caption {margin-bottom: 5px;}
    #btn3 { margin-left: 350px; backgorund-color: black; color: white;}
</style>
</head>
<body>	
	<div class="container">
		<button onclick="backSpace()">← 뒤로가기</button>
		<button onclick="LoginMainPage()">로그아웃</button>
		<button id="btn3" onclick="BoardWrite()">글쓰기</button>
		<table>
			<caption>게시판</caption>
			<tr>
				<th><b>No</b></th>
				<th><b>제목</b></th>
				<th><b>이름</b></th>
				<th></th>
			</tr>
								
			<% for(BoardVO vo : list) { %>
			<tr class="itemRow" onclick="detail(<%=vo.getI_num()%>)">
				<td><%=vo.getI_num() %></td>
				<td><%=vo.getTitle() %></td>
				<td><%=vo.getI_name() %></td>
				<td><input type="radio"></td>
			</tr>
			<% } %>
		</table>
	</div>
	
	<script>
		function backSpace() {
			location.href="LoginProductBoard"
		}
		
		function LoginMainPage() {
			if(confirm("로그아웃 하시겠습니까 ? ")) {
				location.href="LoginMain";
			} else {
				location.href="BoardMain";
			}
		}
		
		function writeBoard() {
			location.href="BoardWrite"
		}
		
		function detail(vogetI_num) {
			location.href="BoardDetail?i_num="+vogetI_num
		}
		
	</script>
		
</body>
</html>
