<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.servlet.http.HttpServletRequest"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Vehicle Registration</title>
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

        #VehicleRegistration {
            background-color: rgba(255, 255, 255, 0.7);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            width: 400px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        label {
            font-weight: bold;
            margin-top: 10px;
            display: block;
            color: #555;
        }

        select, input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
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
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div id="VehicleRegistration">
        <h2>Register Your Vehicle</h2>
        <form action="vehicleRegisteration" method="post">
            <input type="hidden" name="userId" value="<%= request.getAttribute("userID") != null ? request.getAttribute("userID") : "" %>">
            <input type="hidden" name="userName" value="<%= request.getAttribute("userName") != null ? request.getAttribute("userName") : "" %>">
            
            <label for="vehicle">Select your Vehicle type:</label>
            <select name="vehicle" id="vehicle">
                <option value="Two Wheeler">Two wheeler</option>
                <option value="Four wheeler">Four wheeler</option>
            </select>
            
            <br><br>
            
            <label for="vehicleNumber">Enter Vehicle Number:</label>
            <input type="text" name="vehicleNumber" id="vehicleNumber" required>
            
            <br><br>
            
            <button type="submit">Register Vehicle</button>
        </form>
    </div>
</body>
</html>