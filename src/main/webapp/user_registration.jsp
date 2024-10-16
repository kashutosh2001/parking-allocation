<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center; background-color: skyblue">
	<h2 style="color: green">This Is User Registration Page</h2>
	<table border="2" align="center">
		<form action="./userRegistration" method="post">
			<tr>
				<th>User Name :</th>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<th>User Email :</th>
				<td><input type="text" name="userEmail"></td>
			</tr>
			<tr>
				<th>User Password :</th>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<th>User Confirm Password :</th>
				<td><input type="password" name="confirmPass"></td>
			</tr>
			<tr>
				<th>User Role :</th>
				<td><input type="text" name="userRole"></td>
			</tr>

			<td><input type="submit" value="Registration"></td>

		</form>
	</table>
</body>
</html>