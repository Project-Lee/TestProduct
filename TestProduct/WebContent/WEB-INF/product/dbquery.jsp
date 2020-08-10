<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>
		------------------------------------------------
	CREATE TABLE product(
	    i_num number(3),
	    i_name varchar2(40),
	    i_price number(6),
	    PRIMARY KEY(i_num)    
	);
	
	-------------------------------------------------
	
	INSERT INTO product(i_num, i_name, i_price)
	VALUES
	(1,'abc',21500);
	SELECT * FROM product;
	commit;
	
	------------------------------------------------
	SELECT * FROM product;
	commit;
</pre>
</body>
</html>