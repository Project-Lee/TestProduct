<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background-image: url('#');
		background-repeat : no-repeat;
		background-size : cover;		
	}
	.container { width: 600px; margin: 0 auto;}
	ul.mylist {
		list-style-type: "\1F44D"; // thumbs up sign
	}
	h3 { color: grey; font-size: 1.2em;}
	#one { color : black;}
	button {margin-bottom: 10px;}
}
 * {
            box-sizing: border-box;
        }
        .container {
            width: 600px;
            margin: 30px auto;
        }
        .container h3 {
            text-align: center;
        }  
        ul {
            list-style: none;
            margin: 0;
            padding: 0;

            }
        ul li {
            background-color: #eee;
            font-size: 1.2em;
            padding: 10px 10px 10px 40px;
            position: relative;
        }
        ul li:nth-child(odd) {
            background-color: #ddd;
        } 
        ul li:hover {
            background-color: lemonchiffon;
            color: brown;
        }
</style>
</head>
<body>
	
	<div class="container">
		<button onclick="backSpace()">← 뒤로가기</button><br>
		<button onclick="loginBack()">로그인 페이지로</button><br>	
		<button onclick="#">회원정보 수정</button>		
		<h3 id="one">${data.i_name } 님의 상세정보</h3>
		<br>
		<ul class="mylist">
			<li> <h3>아이디 : ${data.i_id }</h3></li>
			<li> <h3>이름 : ${data.i_name }</h3></li>
			<li> <h3>이메일 : ${data.i_email }</h3></li>
			<li> <h3>성별 : ${data.i_gender }</h3></li>
			<br>
			<li> // 주소 기능 넣기 //</li>
			<br>
			<li> // 사진 기능 넣기 //</li>
		</ul>
	</div>
	<script>
		function backSpace() {
			location.href="LoginMember";
		}
		
		function loginBack() {
			location.href="LoginMain"
		}
		
		
	</script>
</body>
</html>