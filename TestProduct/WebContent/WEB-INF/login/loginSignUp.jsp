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
		background-image: url('https://c8.alamy.com/comp/E6B9X8/abstract-concept-red-security-code-lock-technology-blue-background-E6B9X8.jpg');
		background-repeat : no-repeat;
		background-size : cover;		
	}
	.container { width: 500px; margin: 30px auto; color: white;}
      h2 { text-align: center; color: red;}
     label { width: 100px; display: inline-block; margin-left: 100px;}
     label, input { margin-bottom: 10px;}
     .btn { text-align: center;}
     #btn1 { margin-bottom: 10px; }
       
</style>
</head>
<body>
	<div class="container">
	<button id="btn1" onclick="backSpace()">←뒤로가기</button>
    <fieldset>
        <h2>SignUp page</h2>
        <form action="LoginSignInsert" method="post"> 	
            <label for="name">아이디</label>
            <input type="text" name="i_id" required autofocus placeholder="아이디"><br>
            <label for="name">비밀번호</label>
            <input type="password" name="i_ps" required placeholder="비밀번호"><br>
            <label for="name">이름</label>
            <input type="text" name="i_name" required placeholder="이름"><br>
            <label for="name">이메일</label>
            <input type="email" name="i_email" required placeholder="nnn@nnn.com"><br>
            <label for="name">성별</label>
                        남성<input type="radio" name="i_gender" value="남자">
                        여성<input type="radio" name="i_gender" value="여자">
            <div class="btn">
                <input type="submit" value="SignUp">
            </div>
        </form>
	</fieldset>   
	</div>
	
	<script>
		function backSpace() {
			location.href="LoginMain"
		}
	</script>
	
</body>
</html>