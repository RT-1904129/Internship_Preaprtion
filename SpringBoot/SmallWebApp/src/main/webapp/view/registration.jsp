<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>registartion form</h1>
	<form action= "userDetails">
		User Name :<input id = "UName" name = "UName"/><br>
		Email ID :<input id = "EmailId" name = "EmailId"/><br>
		Password :<input type= "password" id = "Password" name = "Password"/><br>
		Gender :<input type = "radio" name = "Gender" value = "1" checked= true />Male
		<input type= "radio" name = "Gender" value ="2"/>Female<br>
		<br>
		<input type = "checkbox" name = "hobby" value= "Dacing">Dancing<input name = "hobby" type = "checkbox" value= "Singing">Singing<br>
		<input type = "submit" value = "Register Now"/>
		
	</form>
</body>
</html>