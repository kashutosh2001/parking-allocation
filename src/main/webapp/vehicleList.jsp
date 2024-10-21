<%@ page import="com.yash.parkingallocationsystem.domain.Vehicle" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Vehicle List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        a {
            color: #4CAF50;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h2>Vehicle List</h2>
    <table>
        <tr>
            <th>Vehicle ID</th>
            <th>Vehicle Type</th>
            <th>Vehicle Number</th>
            <th>User ID</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="vehicle" items="${vehicleList}">
            <tr>
                <td>${vehicle.vehicleId}</td>
                <td>${vehicle.vehicleType}</td>
                <td>${vehicle.vehicleNumber}</td>
                <td>${vehicle.userId}</td>
                <td>
                    <a href="vehicle?action=update&vehicleId=${vehicle.vehicleId}">Edit</a>
                    <a href="vehicle?action=delete&vehicleId=${vehicle.vehicleId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>