<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
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

        #register {
             background-color: rgba(173, 216, 230, 0.7);; 
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            width: 350px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        input[type="text"], input[type="password"], input[type="mobile"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
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
            font-size: 16px;
        }

        button:hover {
            background-color: #45a049;
        }

        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
        }
    </style>
</head>
<body>
    <div id="register">
        <h2>Register</h2>
        <form action="registeration" method="post">
            <label for="name">Enter Name</label>
            <input type="text" id="name" required name="Name">
            
            <label for="email">Enter Email</label>
            <input type="text" id="email" required name="Email">
            
            <label for="mobile">Enter Mobile No</label>
            <input type="mobile" id="mobile" required name="No">
            
            <label for="password">Enter Password</label>
            <input type="password" id="password" required name="password">
            
            <label for="cpassword">Enter Confirm Password</label>
            <input type="password" id="cpassword" required name="cpassword">
            
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>