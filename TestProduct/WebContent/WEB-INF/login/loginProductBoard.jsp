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
	#btn1 { width:150px; height: 150px; margin-left: 560px; margin-top:180px; background-color: black; color: white;}
	#btn2 { width:150px; height: 150px; margin-left: 150px; margin-top:180px; background-color: black; color: white;}
	
</style>
</head>
<body>
	<button id="btn1" onclick="goToProduct()"><h3><b>가전제품 으로 가기</b></h3></button>
	<button id="btn2" onclick="goToBoard()"><h3><b>글쓰기 게시판으로 가기</b></h3></button>
	
	<script>
		function goToProduct() {
			location.href="ProductMain"
		}
		
		function goToBoard(){
			location.href="BoardMain"
		}
	</script>
</body>
</html>