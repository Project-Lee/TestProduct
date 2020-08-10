<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.jy.product.db.ProductVO" %>
       
<%
	List<ProductVO> list = (List<ProductVO>)request.getAttribute("list");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.div1 { width:500px; margin: 0 auto;}
	table { width: 300px; border: 1px solid grey; border-collapse: collapse;}
    td { border: 1px solid grey; text-align:center;}
    tr { height: 60px;}
    #f { text-align: center; color: red;} 
    button { margin-bottom: 10px; margin-top: 10px;}
</style>
</head>
<body>
	<div class="div1">
	<a href="ProductMain"><button> ←뒤로가기</button></a>
	<table>
		<tr>
			<td>No</td>
			<td>이름</td>
			<td>가격</td>
		</tr>
		<%! int i_num = 0; %>	
		<%for(ProductVO vo : list) { %>
		<tr>
			<td><%=vo.getI_num() %></td>
			<td><%=vo.getI_name() %></td>
			<td><%=vo.getI_price() %></td>
		</tr>
		<%i_num = vo.getI_num(); %>
		<% } %>
	</table>
	<a href="ProductDel?i_num=<%=i_num%>"><button>삭제하기</button></a>
	<a href="#"><button>장바구니 담기(미정, 추후계획)</button></a>
	</div>
</body>
</html>