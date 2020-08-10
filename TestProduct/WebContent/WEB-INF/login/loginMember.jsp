<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jy.login.db.LoginVO" %>
<%@ page import="java.util.*" %>
<%
	List<LoginVO> list = (List<LoginVO>)request.getAttribute("list");
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
		.div1 { width:500px; margin: 0 auto; color: white;}
        table { width: 800px; border: 1px solid white; border-collapse: collapse;}
        td { border: 1px solid white; text-align:center;}
        tr { height: 60px;}
        #f { text-align: center; color: red;}
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
				<th></th>
				<th><button onclick="#">남자만 보기(기능추가하기)</button></th>
				<th></th>
			</tr>
			<tr>
				<th>No</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>이메일</th>
				<th>성별</th>
				<th>선택(일단보류)</th>
			</tr>
						
			<% for(LoginVO vo : list) { %>
			<tr class="itemRow" onclick="detail(<%=vo.getI_numId()%>)">
				<td><%=vo.getI_numId() %></td>
				<td><%=vo.getI_id() %></td>
				<td><%=vo.getI_ps() %></td>		
				<td><%=vo.getI_name() %></td>
				<td><%=vo.getI_email() %></td>
				<td><%=vo.getI_gender() %></td>
				<td><input type="radio"></td>
			</tr>
			<% } %>
		</table>
		<br>
		<table>
			<% for(LoginVO vo : list) { %>
				<td><%=vo.getI_numId()%>,<%=vo.getI_id() %> 아이디 <button onclick="deletePage(<%=vo.getI_numId() %>)">삭제</button></td>
			<% } %>
		</table>
		
		
	</div>
	<script>
		
		function backSpace() {
			location.href="LoginMain"
		}
					
		// 삭제버튼 클릭시 삭제
		function deletePage(getI_numId) {
			location.href="LoginDelete?i_numId="+getI_numId;
		}
		
		// 레코드 클릭시 디테일화면으로 이동 
		function detail(getI_numId) {
			location.href="LoginDetail?i_numId="+getI_numId;
		}
		
		function showToMan() {
			location.href="LoginShowToMan";
		}
		
	</script>
</body>
</html>