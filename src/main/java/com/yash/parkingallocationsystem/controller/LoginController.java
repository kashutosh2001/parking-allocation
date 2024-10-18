package com.yash.parkingallocationsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.parkingallocationsystem.dao.VehicleDaoB;
import com.yash.parkingallocationsystem.util.DatabaseUtil;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter();
        String email = request.getParameter("Email");
        String password = request.getParameter("password");
        System.out.println(email);
        
        VehicleDaoB vehicle=new VehicleDaoB();
        DatabaseUtil jdbc = new DatabaseUtil();
        String query = "SELECT user_id,name, email,password,mobile_no FROM users WHERE email=?";

        try {
            PreparedStatement statement = jdbc.createPreparedStatement(query);
            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) { 
            	String id=resultSet.getString(1);
                String name = resultSet.getString(2);
                String storedPassword = resultSet.getString(4); 
                
                //debug
                System.out.println("id="+id);
                System.out.println(password);
                System.out.println(storedPassword);
               
                if (storedPassword.equals(password))
                { 
                	
                	request.setAttribute("userID", id);
                	request.setAttribute("userName", name);
                    RequestDispatcher rd=request.getRequestDispatcher("VehicleRegisteration.jsp");
                    rd.forward(request, response);
                } else {
                    out.print("Invalid password");
                }
            } else {
                out.print("User  not found");
            }

            
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}