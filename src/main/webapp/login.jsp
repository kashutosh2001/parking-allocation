<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('parking.jpg');
            background-size: cover; 
            background-position: center; 
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        #login {
         /*    background-color: rgba(255, 255, 255, 0.8); */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        h2 {
            text-align: center;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 10px;
            text-decoration: none;
            color: #007BFF;
        }
         label {
            font-weight: bold;
            display: block;
        }

        a {
    display: block;
    text-align: center;
    margin-top: 10px;
    text-decoration: none;
    color: #FFD700; 
	}

	a:hover {
    text-decoration: underline;
    color: #FFA500;
	}
	#new{
	display:flex;
	}
    </style>
</head>
<body>
    <div id="login">
        <h2>Login</h2>
        <form action="login" method="post">
           <div id="new">
            <label for="email">Enter Email</label>
            <input type="text" id="email" name="Email" required>
            
            
            <label for="password">Enter Password</label>
            <input type="password" id="password" name="password" required><br>
            </div>
            <button type="submit">Login!</button>
            <a href="Registeration.jsp">Register here</a>
        </form>
    </div>
</body>
</html>