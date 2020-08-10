<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.jy.product.db.ProductVO" %>

<%
	
	List<ProductVO> list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<style>
	body {
		background-image: url('https://previews.123rf.com/images/monsitj/monsitj1606/monsitj160600003/57574562-%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4-%EA%B0%9C%EB%B0%9C%EC%9E%90-%EB%B0%8F-%EC%BB%B4%ED%93%A8%ED%84%B0-%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8A%B8-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-%EC%BD%94%EB%93%9C-%EC%B6%94%EC%83%81-%EA%B8%B0%EC%88%A0-%EB%B0%B0%EA%B2%BD.jpg');
		background-repeat : no-repeat;
		background-size : cover;
	}
	.container { width: 500px; margin: 30px auto; color: white;}
	table { width: 300px; border: 1px solid black; border-collapse: collapse;}
	
    td { border: 1px solid black; text-align:center; }
    tr { height: 60px;}
    #f { text-align: center; color: red;} 
    button { margin-top: 20px;}
    h3 { margin-bottom: 10px;}
    .itemRow:hover {
        	background-color:black;
        	cursor: pointer;
        	
        } 
    
</style>
</head>
<body>
	<div class="container">	
	<table>
		<caption><h3>Product</h3></caption>
		<tr>
			<td>No</td>
			<td>이름</td>
			<td>가격</td>
		</tr>
		
		<%for(ProductVO vo : list) { %>
		<tr class="itemRow" onclick="moveToDetail(<%=vo.getI_num()%>)">
			<td><%=vo.getI_num() %></td>
			<td><%=vo.getI_name() %></td>
			<td><%=vo.getI_price() %></td>
		</tr>
		<% } %>
	</table>
	<a href="ProductQuery"><button>Product 쿼리문</button></a>
	<a href="ProductInsert"><button>제품등록</button></a>
	<button onclick="logOut()">로그아웃</button>
	</div>	
	<script>
		
		
		function moveToDetail(i_num) {
			console.log("i_num = " + i_num);
			location.href="ProductDetail?i_num="+i_num;
		}
		
		function logOut() {
			var logOut = confirm("로그아웃 하시겠습니까 ? ");
			if(logOut == true) {
				location.href="LoginMain";
			} else {
				location.href="ProductMain"
			}
		}
	</script>
		
</body>
</html>