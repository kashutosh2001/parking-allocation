<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Registration form</h2>

		<c:if test="${sessionScope.errorMessage != null}">
    <p>${sessionScope.errorMessage}</p>
</c:if>
		<div>
	<form action ="./Register" method ="post">
	<%-- <label>Name (6-20 characters:):</label>
	 
	
	<label>Email (@yash.com only):</label>
	<input type = "email" name = "email" required><br><br>
	
	<label>Password :</label>
	<input type = "password" name = "password" required><br><br>
	
	<label>Confirm Password :</label>
	<input type = "password" name = "confirmpassword" required><br><br>
	
	<input type = "submit" value="Register">	 --%>
	
		 <label>Name :</label>
	    <input type="text" onchange="validateName(this)" id="first_name" name="name" placeholder="Username" required>
<p id="nameError" style="font-size: 10px; color: red;"></p><br>
    <label for="email">Email:</label>
    <input type="email" onchange="validateEmail(this)" id="email" name="email" placeholder="Email Address"  required>
<p id="emailError" style="font-size: 10px; color: red;"></p><br>
 
    <label for="password">Password:</label>
    <input type="password" onchange="validatePassword(this)" id="password" name="password" placeholder="Password"  required>
<p id="passError" style="font-size: 10px; color: red;"></p><br>
 
    <label for="confirmPassword">Confirm Password:</label>
    <input type="password" onchange="validateConfirmPassword(this)" id="confirm_password" name="confirmPassword" placeholder="Confirm Password" required>
<p id="conPassError" style="font-size: 10px; color: red;"></p><br>
 
    <button type="submit">Register Now</button>
  </form>
  <br><a href="<%= request.getContextPath() %>/Login" type="button">Login now</a>
  </div>

  <script type="text/javascript">
  function validateName(input) {
   const username = input.value;
   console.log(username);
   if (username.length < 5) {
   document.getElementById("nameError").innerHTML = "Username must be at least 6 characters long.";
   } else {
   document.getElementById("nameError").innerHTML = "";
   }
  }
  
  function validateEmail(input) {
   const email = input.value;
   const emailPattern = /^[a-zA-Z0-9._%+-]+@yash+\.[a-zA-Z]{2,}$/;
   const isValid = emailPattern.test(email);
   console.log(isValid);
   if (!isValid) {
   document.getElementById("emailError").innerHTML = "Email should have @yash and .com in it";
   } else {
   document.getElementById("emailError").innerHTML = "";
   }
  }
  
  function validatePassword(input) {
   const password = input.value;
   console.log(password);
   if (password.length < 8) {
   document.getElementById("passError").innerHTML = "Password should be greater than 8";
   } else {
   document.getElementById("passError").innerHTML = "";
   }
  }
  
  function validateConfirmPassword(input) {
  const password = document.getElementById("password").value;
   const confirmPassword = input.value;
   console.log(confirmPassword);
   console.log(password);
   if (password != confirmPassword) {
   document.getElementById("conPassError").innerHTML = "Password should match";
   } else {
   document.getElementById("conPassError").innerHTML = "";
   }
  }

</script>

</body>
</html>