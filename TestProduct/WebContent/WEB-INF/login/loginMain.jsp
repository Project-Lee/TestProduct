<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	body {
		background-image: url('https://img.rawpixel.com/s3fs-private/rawpixel_images/website_content/v627-aew-41-technologybackground_1.jpg?bg=transparent&con=3&cs=srgb&dpr=1&fm=jpg&ixlib=php-3.1.0&q=80&usm=15&vib=3&w=1300&s=fb682f14bc6556bc6fbc357899b6e16f');
		background-repeat : no-repeat;
		background-size : cover;
		ㄴ
	}
	.container { width: 517px; margin: 30px auto; color: white;}
    h2 { text-align: center; color: grey;}
    label { width: 100px; display: inline-block; margin-left: 100px;}
   	label, input { margin-bottom: 10px;}
    .btn { text-align: center; color:hotpink}
    #box1 { text-align: center;}
    #clock { width: 250px; text-align: center; 
             display: inline-block; padding: 10px;}
    #h2update {color: red;}
    .aa { color : firebrick;}
    h1 clock { color: red;}
   
</style>
</head>
<body>	 
	<div class="container">
	<div id="box1">
        <h1 id="clock"></h1>
    </div>	
	    <fieldset>
	        <h2>Login</h2>
	        <form action="LoginMainCheck" method="post"> 	<!-- action="ProductMain" -->
	            <label for="name">아이디</label>
	            <input type="text" name="i_id"><br>
	            <label for="name">비밀번호</label>
	            <input type="password" name="i_ps"><br>
	            <div class="btn">
	                <input type="submit" value="Login" >
	            </div>
	        </form>
	        <button id="button1" onclick="signUp()">회원가입</button>
	        <button id="button2" onclick="memberList()">회원리스트</button>
	        <button id="button3">관리자(미정)</button>
	        <button id="button4" onclick="dbQuery()">login 쿼리문 보기</button>
	        <button id="button5" onclick="#">서블릿-JSP</button>
		</fieldset>
		<br>
		<br>
		<h2 id="h2update">추후 업데이트 사항</h2>
		<br>
		<div class="aa">
			<p> 1. 뭐만들지 또... ?</p>
			<p> 2. (회원리스트에 있는 아이디와 비밀번호 유효검사해서 로긴 기능만들기) 로그인했을시 그사람 개인 정보 나타내는 화면창 만들기</p>
			<p> 3. 회원리스트 화면에서 관리자아이디로 로그인했을시 관리자 고유기능 만들기</p>
			<p> 4. product 장바구니 기능 만들기 </p>
		</div>
		
	
	</div>
</body>
	
	<script>
		function signUp() {
			location.href="LoginSignUp";
		}
		
		function memberList() {
			location.href="LoginMember";
		}
		
		function dbQuery() {
			location.href="LoginQuery";
		}
		
		 var clock = document.getElementById("clock");
	        function changeTime() {
	            var date = new Date();
	            var hour = date.getHours();
	            var minute = date.getMinutes();
	            var seconds = date.getSeconds();
	            clock.innerHTML = hour + " : " + minute + " : " + seconds;
	        }
	        setInterval(changeTime, 1000);
	</script>
</html>