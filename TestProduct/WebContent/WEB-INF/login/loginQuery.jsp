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
	
	CREATE TABLE login(
	    i_numID number(3),
	    i_id varchar2(40),
	    i_ps varchar2(40),
	    i_name varchar2(40),
	    i_email varchar2(40),
	    i_gender varchar2(40),
    PRIMARY KEY(i_numID, i_id, i_ps, i_email)
	);
	
	------------------------------------------------------------
	
	INSERT INTO login(i_numID, i_id, i_ps, i_name, i_email, i_gender)
	VALUES (2,'bb2222','222222','난여자','ddw0099@daum.net','여자');
	
	</pre>
</body>
</html>