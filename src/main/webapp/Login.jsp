<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Login Page</h3>

<form action="./Login" method="post">

	<label>Email :</label>
	<input type = "email" name = "email" required><br><br>

	<label>Password :</label>
	<input type = "password" name = "password" required><br><br>

	<input type = "submit" value = "Login">

</form>

</body>
</html>