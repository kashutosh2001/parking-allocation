<%@page import="com.yash.parkingallocationsystem.dao.daoimpl.AdminDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>

<%
		AdminDaoImpl ags = (AdminDaoImpl) request.getAttribute("ags");

%>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <tr>
        <td><%= ags.getId() %></td>
        <td><%= ags.getName() %></td>
    </tr>
</table>

</body>
</html>