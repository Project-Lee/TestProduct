<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 등록</title>
<style>
	body {
		background-image: url('https://previews.123rf.com/images/chainat/chainat1701/chainat170100057/71641366-%EC%BB%B4%ED%93%A8%ED%84%B0-%ED%95%B4%EC%BB%A4-%EB%82%98-%EC%82%AC%EC%9D%B4%EB%B2%84-%EA%B3%B5%EA%B2%A9-%EA%B0%9C%EB%85%90-%EB%B0%B0%EA%B2%BD.jpg');
		background-repeat : no-repeat;
		background-size : cover;	
	}
	.container { width:500px margin: 0 auto; color: black; }
	
</style>
</head>
<body>
	<div class="container">
		<form action="ProductInsertExc" method="post">
			<label>제품이름 : <input type="text" name="i_name" required></label>
			<label>제품가격 : <input type="text" name="i_price" required></label>
			<input type="submit" value="입력">	
		</form>
	</div>
</body>
</html>