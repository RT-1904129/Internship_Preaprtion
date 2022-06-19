<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action= "getDetails">
		User By ID :<input id = "uid" name = "UID"/><br>
		<select name = "ddlFlag">
			<option value = "select">Select Records </option>
			<option value = "delete">Delete Records </option>
			<option value = "update">Update Records </option>
		</select>
		<input type= "submit" value="Click Now"/>
</form>

</body>
</html>