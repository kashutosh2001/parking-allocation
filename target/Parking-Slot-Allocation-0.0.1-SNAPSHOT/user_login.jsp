<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center; background-color: skyblue">
  <h2 style="color: green">This Is User Login Page</h2>
	<table border="2" align="center">
		<form action="./userLogin" method="post">
		<tr>
			<th>User Email :</th>
			<td><input type="text" name="userEmail"></td>
		</tr>
		<tr>
			<th>User Password :</th>
			<td><input type="text" name="password"></td>
		</tr>

		<td><input type="submit" value="Login"></td>

		</form>
	</table>

</body>
</html>