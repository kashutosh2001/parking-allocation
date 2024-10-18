package com.yash.parkingallocationsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;

import com.yash.parkingallocationsystem.util.DatabaseUtil;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/vehicleRegisteration")
public class VehicleController extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user_id = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String vehicletype = request.getParameter("vehicle");
        String vehicleNumber = request.getParameter("vehicleNumber");
        out.println("User  ID: " + user_id);
        out.println("User  Name: " + userName);
        out.println("Vehicle Type: " + vehicletype + ", Vehicle Number: " + vehicleNumber);

        // Add to uservehicles table
        DatabaseUtil jdbc = new DatabaseUtil();
        String query = "INSERT INTO uservehicles (user_name, vehicle_type, vehicle_no, user_id) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement statement = jdbc.createPreparedStatement(query);
            statement.setString(1, userName);
            statement.setString(2, vehicletype);
            statement.setString(3, vehicleNumber);
            statement.setInt(4, Integer.parseInt(user_id));
            int rowsAdded = statement.executeUpdate();
            if (rowsAdded != 0) {
                System.out.println("Added successfully.");
            } else {
                System.out.println("Not added.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}