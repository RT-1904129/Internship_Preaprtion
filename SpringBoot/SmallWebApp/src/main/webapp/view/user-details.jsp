<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>************* User Deatils ***********</h1>
	<br>
	<br>
	User Name :${regObj.name}<br>
	User Name :${regObj.email}<br>
	User Name :${regObj.gender}<br>
	Hobbies :${regObj.hobbies[0]},${regObj.hobbies[1]}<br>
	<h1>${gender}</h1>
</body>
</html>