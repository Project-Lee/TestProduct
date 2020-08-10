<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
		.div1 { width:500px; margin: 0 auto; color: white;}
        .itemRow:hover {
        	background-color:black;
        	cursor: pointer;
        } 
        button { margin-top:15px;}
        caption {margin-bottom: 5px;}
</style>
</head>
<body>
	<div class="div1">
		<button onclick="backSpace()">←뒤로가기</button>		
		<table>
			<caption><h2>회원목록</h2></caption>
			<br>
			<tr>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<th>No</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
			</tr>
			<tr class="itemRow" onclick="detail('#')">
				<td>${data.i_num }</td>
				<td>${data.title }</td>
				<td>${data.ctnt } %></td>		
				<td>${data.i_name } %></td>
			</tr>
		</table>
	</div>	
	
</body>
</html>